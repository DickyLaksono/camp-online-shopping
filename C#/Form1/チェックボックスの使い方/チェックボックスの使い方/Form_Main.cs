namespace チェックボックスの使い方
{
    public partial class Form_Main : Form
    {
        public Form_Main()
        {
            InitializeComponent();
        }

        private void button_Display_Click(object sender, EventArgs e)
        {
            if (this.checkBox_Select.Checked)
            {
                this.label_Display.Text = "チェックされている";
            }else
            {
                this.label_Display.Text = "チェックされていない";
            }
        }
    }
}
