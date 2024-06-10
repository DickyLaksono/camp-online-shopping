using System.Text;

namespace 課題16
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        private List<string[]> result = new List<string[]>();
        private void Form1_Load(object sender, EventArgs e)
        {
            string filePath = @"C:\Users\Public\Documents\results.txt";
            readData(filePath);
            setCombo();
        }

        private void button_Display_Click(object sender, EventArgs e)
        {
            displayItem();
        }

        private void displayItem()
        {
            this.listView1.Items.Clear();
            this.listView2.Items.Clear();
            this.listView3.Items.Clear();

            string selectedName = comboBox1.SelectedItem.ToString();
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

       
    }
}
