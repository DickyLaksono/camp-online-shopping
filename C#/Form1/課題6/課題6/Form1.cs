namespace 課題6
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void calculate_Click(object sender, EventArgs e)
        {
            int textBox1 =int.Parse( this.textBox1.Text);
            int textBox2 = int.Parse(this.textBox2.Text);

            if (this.plus.Checked)
            {
                this.textBox3.Text = $"{textBox1 + textBox2}";
            }else if(this.mines.Checked) {
                this.textBox3.Text = $"{textBox1 - textBox2}";
            }
            else if (this.multiple.Checked)
            {
                this.textBox3.Text = $"{textBox1 * textBox2}";
            }
            else if (this.divide.Checked) {
                this.textBox3.Text = $"{textBox1 / textBox2}";
            }
            
        }
    }
}
