namespace 課題7
{
    public partial class Form_Main : Form
    {
        public Form_Main()
        {
            InitializeComponent();
        }

        private void button_Display_Click(object sender, EventArgs e)
        {
            if (this.tokyo1.Checked && this.shinagawa2.Checked && !this.tokyo2.Checked)
            {
                if (this.checkBox1.Checked)
                {
                    this.textBox1.Text = $"{160 / 2}";

                }
                else
                {
                    this.textBox1.Text = $"{160}";

                }
            }
            else if (this.tokyo1.Checked && this.shinjuku2.Checked && !this.tokyo2.Checked)
            {
                if (this.checkBox1.Checked)
                {
                    this.textBox1.Text = $"{200 / 2}";

                }
                else
                {
                this.textBox1.Text = $"{200}";

                }

            }else if (this.shinjuku1.Checked && this.tokyo2.Checked && !this.shinjuku2.Checked)
            {
                if (this.checkBox1.Checked)
                {
                    this.textBox1.Text = $"{200 / 2}";

                }
                else
                {
                    this.textBox1.Text = $"{200}";

                }
            }
            else if (this.shinjuku1.Checked && this.shinagawa2.Checked && !this.shinjuku2.Checked)
            {
                if (this.checkBox1.Checked)
                {
                    this.textBox1.Text = $"{200 / 2}";

                }
                else
                {
                    this.textBox1.Text = $"{200}";

                }

            }
            else if (this.shinagawa1.Checked && this.tokyo2.Checked && !this.shinagawa2.Checked)
            {
                if (this.checkBox1.Checked)
                {
                    this.textBox1.Text = $"{160 / 2}";

                }
                else
                {
                    this.textBox1.Text = $"{160}";

                }
            }
            else if (this.shinagawa1.Checked && this.shinjuku2.Checked && !this.shinagawa2.Checked)
            {
                if (this.checkBox1.Checked)
                {
                    this.textBox1.Text = $"{200 / 2}";

                }
                else {
                this.textBox1.Text = $"{200}";

                }

            }
        }
    }
}
