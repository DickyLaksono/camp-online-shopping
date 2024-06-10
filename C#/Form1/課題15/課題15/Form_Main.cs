using System.Text;
namespace 課題15
{
    public partial class Form_Main : Form
    {
        public Form_Main()
        {
            InitializeComponent();
        }

        private List<string[]> name = new List<string[]>();
        private void button_Display_Click(object sender, EventArgs e)
        {
            readData();
            showData();
        }

        private void readData()
        {
            string filePath = @"C:\Users\Public\Documents\results.txt";
            StreamReader sr = new StreamReader(filePath, Encoding.UTF8);

            while(-1 < sr.Peek())
            {
                string[] line = sr.ReadLine().Split(' ');
                this.name.Add(line);
            }

            sr.Close();
        }
        private void showData() {

            this.listView1.Items.Clear();
            this.listView2.Items.Clear();
            this.listView3.Items.Clear();

            foreach (string[] n in this.name)
            {
                string[] list1 = [
                    n[0],
                    n[1],
                    ];
                ListViewItem lv1 = new ListViewItem(list1);
                this.listView1.Items.Add(lv1);
                string[] list2 = [
                    n[0],
                    n[2],
                    ];
                ListViewItem lv2 = new ListViewItem(list2);
                this.listView2.Items.Add(lv2);
                string[] list3 = [
                    n[0],
                    n[3],
                    ];
                ListViewItem lv3 = new ListViewItem(list3);
                this.listView3.Items.Add(lv3);
            }
        }
    }
}
