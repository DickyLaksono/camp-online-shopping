using System.Data.SQLite;

namespace 課題7
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string dbPath = Path.Combine(Application.StartupPath, "result.db");

            try
            {
                    
                List<string[]> results = readDB(dbPath);

                string[] lastRow = results[results.Count -1];
                this.textBox1.Text = lastRow[0];
                this.textBox2.Text = lastRow[1];
                this.textBox3.Text = lastRow[2];
                results.Remove(lastRow);

                this.listView1.Items.Clear();
                foreach (string[] row in results)
                {

                    this.listView1.Items.Add(new ListViewItem(row));
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.ToString());
            }
        }

        private List<string[]> readDB(string dbPath)
        {
            SQLiteConnection conn = null;
            SQLiteCommand cmd = null;
            SQLiteDataReader reader = null;

            try
            {

                string connectionString = $"Data Source={dbPath};Version=3";
                conn = new SQLiteConnection(connectionString);

                //conn.Open();.. jika ini lupa ,saat ingin menjalankkan nya akan terjadi error
                conn.Open();
                cmd = conn.CreateCommand();

                //untuk menjalankan SQlnya
                cmd.CommandText = "SELECT *, (JAPANESE_POINT + MATHEMATICS_POINT + ENGLISH_POINT) TOTAL FROM RESULT_TABLE";

                reader = cmd.ExecuteReader();//start

                List<string[]> result = new List<string[]>();

                //while (reader.Read()).. artinya: sampai tidak bisa membaca lagi akan terus melakukan pengulangan
                while (reader.Read())
                {
                    string[] s = [
                        reader["STUDENT_NAME"].ToString(),
                        reader["JAPANESE_POINT"].ToString(),
                        reader["MATHEMATICS_POINT"].ToString(),
                        reader["ENGLISH_POINT"].ToString(),
                        reader["TOTAL"].ToString()
                        ];
                    result.Add(s);
                }

                //**
                //pada bagian ini, hanya memberhentikan command nya saja 
                cmd.Dispose();
                //dan lalu ini untuk membuat command baru,  yang mencari rata rata
                cmd = conn.CreateCommand();
                cmd.CommandText = "SELECT *, AVG(JAPANESE_POINT) JPAVG ,AVG(MATHEMATICS_POINT) MATHAVG, AVG(ENGLISH_POINT) ENGAVG FROM RESULT_TABLE";
                reader = cmd.ExecuteReader();
                //karna ini hanya menghasilkan satu recorder saja, hanya menggunakan Read() saja 
                reader.Read();
                string[] avg = [
                        reader["JPAVG"].ToString(),
                        reader["MATHAVG"].ToString(),
                        reader["ENGAVG"].ToString(),
                        ];
                result.Add(avg);
                //**

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
    }
}
