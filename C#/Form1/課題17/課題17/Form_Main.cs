using System.Text;

namespace 課題17
{
    public partial class Form_Main : Form
    {
        public Form_Main()
        {
            InitializeComponent();
        }

        private List<string[]> result = new List<string[]>();
        private void Form_Main_Load(object sender, EventArgs e)
        {
            string filePath = @"C:\Users\Public\Documents\results.txt";
            readData(filePath);
            setCombo();
        }
        private void readData(string filePath)
        {
            StreamReader sr = new StreamReader(filePath, Encoding.UTF8);
            while (-1 < sr.Peek())
            {

                this.result.Add(sr.ReadLine().Split(' '));
            }
            sr.Close();
        }

        private void setCombo()
        {

            foreach (string[] n in this.result)
            {
                this.comboBox1.Items.Add(n[0]);
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            displayItem();
        }
        private void displayItem()
        {
            this.listView1.Items.Clear();
            this.listView2.Items.Clear();
            this.listView3.Items.Clear();

            string selectedName = comboBox1.SelectedItem.ToString();
            if (selectedName == "全員") {
                foreach (string[] list1 in this.result)
                {
                    string[] l1 = [
                        list1[0],
                        list1[1]
                        ];
                    ListViewItem lv1 = new ListViewItem(l1);
                    this.listView1.Items.Add(lv1);

                    string[] l2 = [
                       list1[0],
                        list1[2]
                       ];
                    ListViewItem lv2 = new ListViewItem(l2);
                    this.listView2.Items.Add(lv2);

                    string[] l3 = [
                       list1[0],
                        list1[3]
                       ];
                    ListViewItem lv3 = new ListViewItem(l3);
                    this.listView3.Items.Add(lv3);
                }
            }
            else
            {
                if (selectedName != null)
                {
                    string[] selectedEntry = null;
                    foreach (string[] entry in result)
                    {
                        if (entry[0] == selectedName)
                        {
                            selectedEntry = entry;
                            break;
                        }
                    }
                    if (selectedEntry != null)
                    {
                        listView1.Items.Clear();
                        listView1.Items.Add(new ListViewItem(new[] { selectedEntry[0], selectedEntry[1] }));

                        listView2.Items.Clear();
                        listView2.Items.Add(new ListViewItem(new[] { selectedEntry[0], selectedEntry[2] }));

                        listView3.Items.Clear();
                        listView3.Items.Add(new ListViewItem(new[] { selectedEntry[0], selectedEntry[3] }));
                    }
                }
            }
           

        }
    }
}
