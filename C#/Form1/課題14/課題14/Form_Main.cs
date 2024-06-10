using System.Text;
namespace 課題14
{
    public partial class Form_Main : Form
    {
        public Form_Main()
        {
            InitializeComponent();
        }

        private List<string[]> list = new List<string[]>();
        private void button_Display_Click(object sender, EventArgs e)
        {
            readData();
            showData();
        }

        private void readData()
        {
            this.list.Clear();
            string filePath = @"C:\Users\Public\Documents\results.txt";
            StreamReader sr = new StreamReader(filePath,Encoding.UTF8);

            while(-1 < sr.Peek())
            {
                string[] listName = sr.ReadLine().Split(' ');
                this.list.Add(listName);
            }
            sr.Close();
        }

        private void showData()
        {
            this.listView.Items.Clear();

            foreach (string[] listName in list)
            {
                string[] displayItem = [
                        listName[0],
                        listName[1],
                        listName[2],
                        listName[3]                  
                    ];
                ListViewItem item = new ListViewItem(displayItem);
                this.listView.Items.Add(item);
            }

        }
    }
}
