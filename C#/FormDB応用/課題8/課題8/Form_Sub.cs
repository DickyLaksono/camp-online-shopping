using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.SQLite;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace 課題8
{
    public partial class Form_Sub : Form
    {
        private string connectionString;

        private List<string[]> names = new List<string[]>();
        public Form_Sub()
        {
            InitializeComponent();

            string dbPath = Path.Combine(Application.StartupPath, "results2.db");
            this.connectionString = $"Data Source ={dbPath}; Version=3";
        }

        private void button_Close_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void Form_Sub_Load(object sender, EventArgs e)
        {
            try
            {
                this.names = readDB();
                display(this.listBox_Names, this.names);
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.ToString());
                return;
            }
        }

        private void display(ListBox listBox_Names, List<string[]> names)
        {
            listBox_Names.Items.Clear();
            foreach (string[] name in names)
            {
                listBox_Names.Items.Add(name[1]);
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
                cmd.CommandText = "select * from STUDENT_TABLE where DELETED = 0 order by STUDENT_ID;";
                reader = cmd.ExecuteReader();
                List<string[]> result = new List<string[]>();
                while (reader.Read())
                {
                    string[] s = {
                        reader["STUDENT_ID"].ToString(),
                        reader["STUDENT_NAME"].ToString(),
                        reader["DELETED"].ToString(),
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

        private void button_Regist_Click(object sender, EventArgs e)
        {
            if (string.IsNullOrWhiteSpace(this.textBox1.Text))
            {
                MessageBox.Show("名前を入力してください");
                return;
            }

            try
            {
                registData(this.textBox1.Text);
                this.textBox1.Clear();//INI UNTUK MENG CLEAR YANG ADA DI DALAM TEXTBOX

                this.names = readDB();
                display(this.listBox_Names, this.names);
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.ToString());
            }
        }

        private void registData(string text)
        {
            string sql = "insert into STUDENT_TABLE (STUDENT_NAME) values(@SN);";

            SQLiteParameter[] parameters =
            {
                new SQLiteParameter("SN", System.Data.DbType.String)
            };
            parameters[0].Value = text;
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

        private void listBox_Names_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (this.listBox_Names.SelectedIndex != -1)//ini ketika list box nya tidak terpilih
            {
                this.textBox1.Text = this.listBox_Names.SelectedItem.ToString();
            }
        }

        private void button_Delete_Click(object sender, EventArgs e)
        {
            if (this.listBox_Names.SelectedIndex == -1)
            {
                MessageBox.Show("削除する名前を選択してください。");
                return;
            }
            string id = this.names[this.listBox_Names.SelectedIndex][0];
            try
            {
                deleteData(id);
                this.textBox1.Clear();

                this.names = readDB();
                display(this.listBox_Names, this.names);
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.ToString());
            }
        }

        private void deleteData(string id)
        {
            string sql = "UPDATE STUDENT_TABLE SET DELETED = 1 WHERE STUDENT_ID = @ID;";

            SQLiteParameter[] parameters =
            {
                new SQLiteParameter("ID", System.Data.DbType.Int32)
            };
            parameters[0].Value = id;
            executeSQL(sql, parameters);
        }

        private void button_Edit_Click(object sender, EventArgs e)
        {
            if (this.listBox_Names.SelectedIndex == -1)
            {
                MessageBox.Show("更新する名前を選択ください");
                return;
            }

            string[] row = this.names[this.listBox_Names.SelectedIndex];

            if(this.textBox1.Text == row[1])
            {
                return;
            }

            try
            {
                updateData(row[0], this.textBox1.Text);
                this.textBox1.Clear();

                this.names = readDB();
                display(this.listBox_Names, this.names);
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.ToString());
            }
        }

        private void updateData(string id, string name)
        {
            string sql = "UPDATE STUDENT_TABLE SET STUDENT_NAME = @SN WHERE STUDENT_ID = @ID";
            SQLiteParameter[] parameters =
            {
                new SQLiteParameter ("SN",System.Data.DbType.String),
                new SQLiteParameter ("ID",System.Data.DbType.Int32)
            };
            parameters[0].Value = name;
            parameters[1].Value = id;
            executeSQL(sql, parameters);    
        }
    }
}
