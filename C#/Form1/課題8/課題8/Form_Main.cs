namespace 課題8
{
    public partial class Form_Main : Form
    {
        public Form_Main()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Random r1 = new Random(); 
            Random r2 = new Random();

            int random6 = r1.Next(1,7);
            int random12 = r2.Next(1,13);

            if (this.radioButton1.Checked)
            {
                if (this.checkBox1.Checked && (random6 % 2)  == 0)
                {
                    this.textBox1.Text = "偶数";

                }else if (this.checkBox1.Checked && (random6 % 2) == 1)
                {
                    this.textBox1.Text = "奇数";

                }
                else
                {
                    this.textBox1.Text = $"{random6}";

                }

            }else if (this.radioButton2.Checked)
            {
                if (this.checkBox1.Checked && (random12 % 2) == 0)
                {
                    this.textBox1.Text = "偶数";

                }
                else if (this.checkBox1.Checked && (random12 % 2) == 1)
                {
                    this.textBox1.Text = "奇数";

                }
                else
                {
                    this.textBox1.Text = $"{random12}";
                }

            }

        }
    }
}
