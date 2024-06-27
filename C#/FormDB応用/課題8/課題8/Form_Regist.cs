using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SQLite;

namespace 課題8
{
    public partial class Form_Regist : Form
    {
        public Form_Regist()
        {
            InitializeComponent();

            string dbPath = Path.Combine(Application.StartupPath, "results2.db");
            this.connectionString = $"Data Source={dbPath};Version=3;";
        }
        private string connectionString;
        private List<string[]> students = new List<string[]>();

        public int studentId
        {
            get
            {
                int index = this.comboBox_Name.SelectedIndex;
                string studentId = this.students[index][0];

                return int.Parse(studentId);
            }
        }
        public int japanesePoint
        {
            get
            {
                return (int)this.numericUpDown_Japanese.Value;
            }
        }
        public int mathematicsPoint
        {
            get
            {
                return (int)this.numericUpDown_Mathematics.Value;
            }
        }
        public int EnglishPoint
        {
            get
            {
                return (int)this.numericUpDown_English.Value;
            }
        }
        private void Form_Regist_Load(object sender, EventArgs e)
        {
            try
            {
                this.students = readDB();
                display(this.comboBox_Name, this.students);

                this.comboBox_Name.SelectedIndex = 0;
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.ToString());
                Close();
            }
        }

        private void display(ComboBox comboBox_Name, List<string[]> students)
        {
            comboBox_Name.Items.Clear();
            foreach (string[] student in students)
            {
                comboBox_Name.Items.Add(student[1]);
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
                cmd.CommandText = @"SELECT * FROM STUDENT_TABLE WHERE DELETED = 0";
                reader = cmd.ExecuteReader();
                List<string[]> result = new List<string[]>();
                while (reader.Read())
                {
                    string[] s =
                    {
                        reader["STUDENT_ID"].ToString(),
                        reader["STUDENT_NAME"].ToString(),
                        reader["DELETED"].ToString()

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

        private void button_OK_Click(object sender, EventArgs e)
        {

        }
    }
}
