using System.Data.SQLite;

namespace 課題10
{
    public partial class Form_Main : Form
    {
        public Form_Main()
        {
            InitializeComponent();
        }
        private List<string[]> names = new List<string[]>();
        private void button_Read_Click(object sender, EventArgs e)
        {
            if (this.openFileDialog1.ShowDialog() == DialogResult.Cancel)
            {
                return;
            }

            try
            {
                this.names = readFile(this.openFileDialog1.FileName);
                MessageBox.Show("ファイルを読み込みました");
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.ToString());
            }
        }

        private List<string[]> readFile(string fileName)
        {
            StreamReader sr = null;

            try
            {
                sr = new StreamReader(fileName);
                List<string[]> rows = new List<string[]>();
                while (-1 < sr.Peek())
                {
                    string[] row = sr.ReadLine().Split(',');
                    rows.Add(row);
                }
                return rows;
            }
            finally
            {
                if (sr != null)
                {
                    sr.Close();
                }
            }
        }

        private void button_Write_Click(object sender, EventArgs e)
        {
            if (this.names.Count == 0)
            {
                return;
            }
            string dbPath = Path.Combine(Application.StartupPath, "namedata.db");
            try
            {
                registDB(dbPath, this.names);
                MessageBox.Show("データベースを書き込みました");
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.ToString());
            }
        }

        private void registDB(string dbPath, List<string[]> names)
        {
            SQLiteConnection conn = null;
            SQLiteCommand cmd = null;

            string connectionString = $"Data Source={dbPath};Version=3";
            try
            {
                //open
                conn = new SQLiteConnection(connectionString);
                conn.Open();

                foreach (string[] row in names)
                {
                    cmd = conn.CreateCommand();
                    cmd.CommandText = "insert into Names (LASTNAME, FIRSTNAME, LASTNAME_KANA, FIRSTNAME_KANA) VALUES (@LN, @FN, @LNK, @FNK)";

                    cmd.Parameters.Add("LN", System.Data.DbType.String);
                    cmd.Parameters.Add("FN", System.Data.DbType.String);
                    cmd.Parameters.Add("LNK", System.Data.DbType.String);
                    cmd.Parameters.Add("FNK", System.Data.DbType.String);
                    cmd.Parameters["LN"].Value = row[0];
                    cmd.Parameters["FN"].Value = row[1];
                    cmd.Parameters["LNK"].Value = row[2];
                    cmd.Parameters["FNK"].Value = row[3];
                    cmd.ExecuteNonQuery();
                    cmd.Dispose();
                }

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

        private void button_Exit_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void Form_Main_FormClosing(object sender, FormClosingEventArgs e)
        {
            if (MessageBox.Show("終了してもよろしいですか", "終了確認", MessageBoxButtons.OKCancel) == DialogResult.Cancel) 
            {
                e.Cancel = true;
            }
        }
    }
}
