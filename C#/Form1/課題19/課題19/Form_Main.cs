namespace 課題19
{
    public partial class Form_Main : Form
    {
        public Form_Main()
        {
            InitializeComponent();
        }

        private void Form_Main_Load(object sender, EventArgs e)
        {
            this.textBox1.Text = "10000";

        }
        private void button_Start_Click(object sender, EventArgs e)
        {
            this.button_Start.Enabled = false;  
            this.textBox2.Enabled = true;
            this.button_Reset.Enabled = true;

            this.comboBox1.Enabled = true;
            this.button1.Enabled = true;
            string inputMoney = this.textBox2.Text;



        }

        private void button1_Click(object sender, EventArgs e)
        {
            Random random = new Random();
            int r1 = random.Next(1, 7);
            int r2 = random.Next(1, 7);

            if ((r1 + r2) % 2 == 1 && this.comboBox1.Text == "奇数" )
            {
                this.label6.Text = $"{r1} - {r2} の奇数\n負け";
            }
            else if ((r1 + r2) % 2 == 0 && this.comboBox1.Text == "偶数")
            {
                this.label6.Text = $"{r1} - {r2} の偶数\n勝ち";

            }
        }
    }
}
