using System.Data.SQLite;
using System.Text;

namespace 課題8
{
    public partial class Form_Main : Form
    {
        public Form_Main()
        {
            InitializeComponent();
            string dbPath = Path.Combine(Application.StartupPath, "results2.db");
            this.connectionString = $"Data Source={dbPath};Version=3;";
        }
        private string connectionString;
        private List<string[]> results = new List<string[]>();
        private void button1_Click(object sender, EventArgs e)
        {
            Form_Sub form = new Form_Sub();
            form.ShowDialog();

            try
            {
                this.results = readDB();
                display(this.listView1, this.results);
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.ToString());
            }
        }

        private void Form_Main_Load(object sender, EventArgs e)
        {
            try
            {
                this.results = readDB();
                display(this.listView1, this.results);
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.ToString());
                Environment.Exit(1);
            }
        }

        private void display(ListView listView1, List<string[]> result)
        {
            listView1.Items.Clear();

            foreach (string[] row in result)
            {
                listView1.Items.Add(new ListViewItem(row));
            }
        }

        private List<string[]> readDB()
        {
            SQLiteConnection conn = null;
            SQLiteCommand cmd = null;
            SQLiteDataReader reader = null;

            try
            {
                conn = new SQLiteConnection(this.connectionString);
                conn.Open();

                cmd = conn.CreateCommand();
                cmd.CommandText = @"select
                                        S.STUDENT_NAME,
                                        R.JAPANESE_POINT,
                                        R.MATHEMATICS_POINT,
                                        R.ENGLISH_POINT,
                                        R.RESULT_ID
                                    from RESULT_TABLE R JOIN STUDENT_TABLE S ON R.STUDENT_ID = S.STUDENT_ID WHERE S.DELETED = 0;";
                reader = cmd.ExecuteReader();
                List<string[]> result = new List<string[]>();
                while (reader.Read())
                {
                    string[] s =
                    {
                        reader["STUDENT_NAME"].ToString(),
                        reader["JAPANESE_POINT"].ToString(),
                        reader["MATHEMATICS_POINT"].ToString(),
                        reader["ENGLISH_POINT"].ToString(),
                        reader["RESULT_ID"].ToString(),

                    };
                    result.Add(s);
                }
                return result;
            }
            finally
            {
                if (reader != null)
                {
                    reader.Close();
                }
                if (cmd != null)
                {
                    cmd.Dispose();
                }
                if (conn != null)
                {
                    conn.Close();
                }
            }
        }

        private void button_Delete_Click(object sender, EventArgs e)
        {
            if (this.listView1.SelectedIndices.Count == 0)
            {
                MessageBox.Show("削除するデータを選択してください");
                return;
            }

            int index = this.listView1.SelectedIndices[0];
            string resultId = this.results[index][4];

            try
            {
                deleteData(resultId);

                this.results = readDB();
                display(this.listView1, this.results);
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.ToString());
                return;
            }
        }

        private void deleteData(string resultId)
        {
            string sql = "UPDATE RESULT_TABLE SET DELETED = 1 WHERE RESULT_ID = @ID;";

            SQLiteParameter[] parameters =
            {
                new SQLiteParameter("ID", System.Data.DbType.Int32)
            };
            parameters[0].Value = int.Parse(resultId);
            executeSQL(sql, parameters);
        }

        private void executeSQL(string sql, SQLiteParameter[] parameters)
        {
            SQLiteConnection conn = null;
            SQLiteCommand cmd = null;
            //string connectionString = $"Data Source={dbPath};Version=3";

            try
            {
                conn = new SQLiteConnection(this.connectionString);
                conn.Open();
                cmd = conn.CreateCommand();
                cmd.CommandText = sql;
                cmd.Parameters.AddRange(parameters);
                cmd.ExecuteNonQuery();
            }
            finally
            {
                if (cmd != null)
                {
                    cmd.Dispose();
                }
                if (conn != null)
                {
                    conn.Close();
                }
            }
        }

        private void button_Regist_Click(object sender, EventArgs e)
        {
            Form_Regist form = new Form_Regist();
            if (form.ShowDialog() == DialogResult.Cancel)
            {
                return;
            }

            try
            {
                registData(form);

                this.results = readDB();
                display(this.listView1, this.results);
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.ToString());
            }
        }

        private void registData(Form_Regist form)
        {

            string sql = @"insert into RESULT_TABLE (STUDENT_ID, JAPANESE_POINT, MATHEMATICS_POINT, ENGLISH_POINT) VALUES (@ID, @JP, @MP, @EP)";

            SQLiteParameter[] parameters =
            {
                new SQLiteParameter("ID", System.Data.DbType.Int32),
                new SQLiteParameter("JP", System.Data.DbType.Int32),
                new SQLiteParameter("MP", System.Data.DbType.Int32),
                new SQLiteParameter("EP", System.Data.DbType.Int32)
            };
            parameters[0].Value = form.studentId;
            parameters[1].Value = form.japanesePoint;
            parameters[2].Value = form.mathematicsPoint;
            parameters[3].Value = form.EnglishPoint;

            executeSQL(sql, parameters);


        }

        private void button_Edit_Click(object sender, EventArgs e)
        {
            if(this.listView1.SelectedIndices.Count == 0)
            {
                MessageBox.Show("選択してください");
                return;
            }

            int index = this.listView1.SelectedIndices[0];
            string[] row = this.results[index];
            string studentId = row[4];

            Form_Edit form = new Form_Edit();
            form.StudentName = row[0];
            form.japanesePoint = int.Parse(row[1]);
            form.mathematicsPoint = int.Parse(row[2]);
            form.englishPoint = int.Parse(row[3]);

            if(form.ShowDialog() == DialogResult.Cancel)
            {
                return;
            }

            if(form.japanesePoint == int.Parse(row[1]) && form.mathematicsPoint == int.Parse(row[1]) &&form.englishPoint == int.Parse(row[1]))
            {
                return;
            }
            try
            {
                updateData(form, studentId);
                this.results = readDB();
                display(this.listView1, this.results);

            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.ToString());
            }
        }

        private void updateData(Form_Edit form, string studentId)
        {
            string sql = "update RESULT_TABLE SET JAPANESE_POINT= @JP, MATHEMATICS_POINT=@MP, ENGLISH_POINT=@EP WHERE RESULT_ID = @ID";

            SQLiteParameter[] parameters =
           {
                new SQLiteParameter("JP", System.Data.DbType.Int32),
                new SQLiteParameter("MP", System.Data.DbType.Int32),
                new SQLiteParameter("EP", System.Data.DbType.Int32),
                new SQLiteParameter("ID", System.Data.DbType.Int32)

            };
            parameters[3].Value = int.Parse(studentId);
            parameters[0].Value = form.japanesePoint;
            parameters[1].Value = form.mathematicsPoint;
            parameters[2].Value = form.englishPoint;

            executeSQL(sql, parameters);
        }
    }
}
