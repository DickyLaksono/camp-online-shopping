namespace WinFormsApp1計算アプリ
{
    public partial class Form_main : Form
    {
        public Form_main()
        {
            InitializeComponent();
        }

        private void button_Diplay_Click(object sender, EventArgs e)
        {
            int number1 = int.Parse(this.textBox_Number1.Text);
            int number2 = int.Parse(this.textBox_Number2.Text);

            int total  = number1 + number2;

            this.textBox_Answer.Text = $"{total}";

        }
    }
}
