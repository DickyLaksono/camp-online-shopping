using System.Text;

namespace 名簿_ListView
{
    public partial class Form_Main : Form
    {
        public Form_Main()
        {
            InitializeComponent();
        }

        private List<string[]> members = new List<string[]>();
        private void button1_Click(object sender, EventArgs e)
        {
            string nextNumber = getNextNumber();
            setData(nextNumber);
            displayData();
        }

        private void displayData()
        {
            this.listView_Display.Items.Clear();
            foreach (string[] item in members)
            {
                this.listView_Display.Items.Add(new ListViewItem(item));

            }
        }

        private void setData(string nextNumber)
        {
            string[] personalData = new string[3];

            personalData[0] = nextNumber;

            if (this.radioButton_Male.Checked)
            {
                personalData[1] = "男性";
            }
            else
            {
                personalData[1] = "女性";
            }
            personalData[2] = $"{this.textBox1.Text} {this.textBox2.Text}";

            this.members.Add(personalData);
        }

        private string getNextNumber()
        {
            int nextNumber = 1;

            //ini jika register permata
            if (this.members.Count == 0)
            {
                return nextNumber.ToString();
            }

            //jika sudah register maka memulai dari orang terakhir
            string[] lastMember = this.members[this.members.Count - 1];

            nextNumber = int.Parse(lastMember[0] + 1);

            return nextNumber.ToString();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            if(this.listView_Display.SelectedIndices.Count == 0) {
                MessageBox.Show("削除する項目を選んでください");
                return;
            }

           int index = this.listView_Display.SelectedIndices[0];
            this.members.RemoveAt(index);

            displayData();
        }
    }
}
