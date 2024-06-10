using System.Text;

namespace 課題18
{
    public partial class Form_Main : Form
    {
        public Form_Main()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            this.openFileDialog.ShowDialog();
        }

        private void openFileDialog_FileOk(object sender, System.ComponentModel.CancelEventArgs e)
        {
            StreamReader sr = new StreamReader(this.openFileDialog.FileName, Encoding.UTF8);
            
            string read = sr.ReadToEnd();

            sr.Close();

            MessageBox.Show(read);
        }
    }
}
