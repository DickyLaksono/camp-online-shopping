namespace 年齢確認
{
    public partial class Form_main : Form
    {
        public Form_main()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int textBox = int.Parse(this.textBox1.Text);

            if (textBox < 16)
            {
                MessageBox.Show("原付の免許も自動車の免許も習得できません");
            }
            else if (textBox >= 16 && textBox < 18)
            {
                MessageBox.Show("原付の免許は習得できますが、自動車の免許は習得できません");
            }
            else
            {
                MessageBox.Show("原付の免許も自動車の免許も習得できます");
            }

            // this.button1.Text = textBox.ToString();
        }
    }
}
