using System.Text;
namespace 課題12
{
    public partial class Form1_Main : Form
    {
        public Form1_Main()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int indexComboBox = this.comboBox1.SelectedIndex;
            if (indexComboBox != -1)
            {
                if(indexComboBox == 0)
                {
                    this.textBox1.Text = $"￥{700}";
                }
                else if (indexComboBox == 1)
                {
                    this.textBox1.Text = $"￥{800}";
                }
                else if(indexComboBox == 2)
                {
                    this.textBox1.Text = $"￥{300}";
                }
                else if( indexComboBox == 3)
                {
                    this.textBox1.Text = $"￥{560}";
                }
                else if(indexComboBox == 4)
                {
                    this.textBox1.Text = $"￥{800}";
                }
                else if(indexComboBox == 5)
                {
                    this.textBox1.Text = $"￥{250}";
                }
                else if(indexComboBox == 6)
                {
                    this.textBox1.Text = $"￥{500}";
                }
                


                

            }

        }
    }
}
