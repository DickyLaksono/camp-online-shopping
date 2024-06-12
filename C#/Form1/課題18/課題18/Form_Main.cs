using System.Text;

namespace 課題18
{
    public partial class Form_Main : Form
    {
        public Form_Main()
        {
            InitializeComponent();
        }

        private List<string[]> csvFile = new List<string[]>();
        private void button1_Click(object sender, EventArgs e)
        {
            this.openFileDialog.ShowDialog();
        }

        private void openFileDialog_FileOk(object sender, System.ComponentModel.CancelEventArgs e)
        {
            StreamReader sr = new StreamReader(this.openFileDialog.FileName, Encoding.UTF8);


            string line;
            while ((line = sr.ReadLine()) != null)
            {
                csvFile.Add(line.Split(','));
            }
            sr.Close();

            listView1.Items.Clear();
            foreach (var row in csvFile)
            {
                string noPost = row[2].Trim('"');
                string alamat = $"{row[6].Trim('"')}{row[7].Trim('"')} {row[8].Trim('"')} ";

                ListViewItem item = new ListViewItem(new[] { noPost, alamat });
                listView1.Items.Add(item);
            }

        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.saveFileDialog.ShowDialog();
        }

        private void saveFileDialog_FileOk(object sender, System.ComponentModel.CancelEventArgs e)
        {
            StreamWriter sw = new StreamWriter(this.saveFileDialog.FileName, false, Encoding.UTF8);

            foreach(ListViewItem list in this.listView1.Items)
            {
                string no = list.SubItems[0].Text;
                string address = list.SubItems[1].Text;
                sw.WriteLine($"{no} {address}");


            }

            sw.Close();
        }
    }
}
