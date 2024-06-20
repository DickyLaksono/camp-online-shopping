using System.Data.SQLite;   

namespace 課題1
{
    public partial class Form_Main : Form
    {
        public Form_Main()
        {
            InitializeComponent();
        }

        private void button_Read_Click(object sender, EventArgs e)
        {
            string dbPath = Path.Combine(Application.StartupPath, "result.db");

            try {
                List<string[]> result = readDB(dbPath);
                this.listView_Result.Items.Clear();
                foreach (string[] row in result)
                {
                    
                    this.listView_Result.Items.Add(new ListViewItem(row));
                }
            }
            catch(Exception ex) 
            {
                MessageBox.Show(ex.ToString());
            }
        }

        private List<string[]> readDB(string dbPath)
        {
            SQLiteConnection conn = null;
            SQLiteCommand cmd = null;
            SQLiteDataReader reader = null;

            try {

                string connectionString = $"Data Source={dbPath};Version=3";
                conn = new SQLiteConnection(connectionString);

                //conn.Open();.. jika ini lupa ,saat ingin menjalankkan nya akan terjadi error
                conn.Open();
                cmd = conn.CreateCommand();

                //untuk menjalankan SQlnya
                cmd.CommandText = "SELECT * FROM RESULT_TABLE";

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
                        ];
                    result.Add(s);  
                }
                return result;
            } finally { 
                if(reader != null)
                {
                    reader.Close();
                }
                if (cmd != null)
                {
                    cmd.Dispose();
                }
                if(conn != null)
                {
                    conn.Close();
                }
            
            }
        }
    }
}
