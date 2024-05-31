using System.Text;

namespace 課題10
   
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button_Read_Click(object sender, EventArgs e)
        {
            this.openFileDialog.ShowDialog();
        }

        private void openFileDialog_FileOk(object sender, System.ComponentModel.CancelEventArgs e)
        {
            StreamReader sr = new StreamReader(this.openFileDialog.FileName, Encoding.UTF8);

            string read = sr.ReadToEnd();

            sr.Close();
            this.textBox.Text = read;
            
        }

        private void button_Write_Click(object sender, EventArgs e)
        {
            this.saveFileDialog.ShowDialog();


        }

        private void saveFileDialog_FileOk(object sender, System.ComponentModel.CancelEventArgs e)
        {

            StreamWriter sw = new StreamWriter(this.saveFileDialog.FileName, false, Encoding.UTF8);

            string input = this.textBox.Text;


            sw.Write(input);

            sw.Close();
        }

        private void button_Quit_Click(object sender, EventArgs e)
        {
            Close();
        }
    }
}
