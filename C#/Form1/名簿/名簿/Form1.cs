using System.Text;

namespace 名簿
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private List<string[]> list = new List<string[]>(); 
        private void button1_Click(object sender, EventArgs e)
        {
            setData(this.textBox1.Text, this.textBox2.Text);
            showData();
        }

        private void showData()
        {
          this.listBox_Display.Items.Clear();

            foreach (string[] List in list)
            {
                this.listBox_Display.Items.Add($"{List[0]}\t{List[1]}");
            }
        }

        private void setData(string familyName, string name)
        {
            string[] personalData = new string[2];
            if (this.radioButton1.Checked)
            {
                personalData[0] = "男性";
            }
            else
            {
                personalData[0] = "女性";
            }
            personalData[1] = $"{familyName} {name}";

            this.list.Add(personalData);
        }
    }
}
