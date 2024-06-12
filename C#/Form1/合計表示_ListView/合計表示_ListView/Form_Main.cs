using System.Text;

namespace 合計表示_ListView
{
    public partial class Form_Main : Form
    {
        public Form_Main()
        {
            InitializeComponent();
        }

        private List<string[]> products = new List<string[]>();

        private void button_Display_Click(object sender, EventArgs e)
        {
            this.openFileDialog.ShowDialog();
        }

        private void openFileDialog_FileOk(object sender, System.ComponentModel.CancelEventArgs e)
        {
           readData(this.openFileDialog.FileName);

            displayData();
        }
        private void readData(string fileName)
        {
            this.products.Clear();

            StreamReader sr = new StreamReader(fileName, Encoding.UTF8);

           while(-1< sr.Peek()){
                string[] product = sr.ReadLine().Split(' ');
                this.products.Add(product);
            }

            sr.Close();
        }

        private void displayData()
        {
            this.listView_Display.Items.Clear();

            foreach (string[] item in products)
            {
                    int total = int.Parse(item[1]) * int.Parse(item[2]);

                string[] displayProduct = [
                        item[0],
                        item[1],
                        item[2],    
                        total.ToString()
                    ];

                ListViewItem lvi = new ListViewItem(displayProduct);
                this.listView_Display.Items.Add(lvi);
            }
        }
    }
}
