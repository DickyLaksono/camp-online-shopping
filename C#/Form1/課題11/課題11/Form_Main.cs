using System.Text;
namespace 課題11
{
    public partial class Form_Main : Form
    {
        public Form_Main()
        {
            InitializeComponent();
        }

        private List<string[]> list = new List<string[]>();
        private void button1_Click(object sender, EventArgs e)
        {
            setData1();
            showData();
        }

        private void showData()
        {
            this.listBox_Setting.Items.Clear();

            foreach (string[] s in list)
            {
                this.listBox_Setting.Items.Add($"{s[0]}");

            }
        }

        private void setData1()
        {
            if(this.comboBox1.SelectedIndex != -1)
            {
                string[] listBoxData = new string[1];
                listBoxData[0] = this.comboBox1.Text;

                this.list.Add(listBoxData);

                int index = this.comboBox1.SelectedIndex;
                comboBox1.Items.RemoveAt(index);
            }
            else
            {
                MessageBox.Show("コンボボックスから値を選択してください。");
            }
         

        }

        private void button2_Click(object sender, EventArgs e)
        {
            setData2();
            showData();
        }
        private void setData2()
        {
            
            int index = this.listBox_Setting.SelectedIndex;

            if(index != -1)
            {
                string selectedItem = listBox_Setting.Items[index].ToString();
                comboBox1.Items.Add(selectedItem);

                listBox_Setting.Items.RemoveAt(index);
                list.RemoveAt(index);
            }
            else
            {
                MessageBox.Show("インデクスを選択してください");
            }
        }
    

      
    }
}
