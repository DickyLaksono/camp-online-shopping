using System.Text;

namespace ファイル読み込み
{
    public partial class Form_Main : Form
    {
        public Form_Main()
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

            string message = sr.ReadToEnd();

            sr.Close();

            MessageBox.Show(message);
        }

        private void button_Write_Click(object sender, EventArgs e)
        {
            this.saveFileDialog.ShowDialog();
        }

        private void saveFileDialog_FileOk(object sender, System.ComponentModel.CancelEventArgs e)
        {
            StreamWriter sw = new StreamWriter(this.saveFileDialog.FileName, false, Encoding.UTF8);

            sw.Write("ABC");

            sw.Close();
        }
    }
}
