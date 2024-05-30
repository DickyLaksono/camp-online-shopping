namespace 課題5
{
    public partial class Form_Main : Form
    {
        public Form_Main()
        {
            InitializeComponent();
        }

        private void button_Display_Click(object sender, EventArgs e)
        {
            int shibuya = 100;
            int ikebukuro = 100;
            int tokyo = 140;
            int ueno = 140;
            int shinagawa = 140;

            if (this.adult.Checked && this.shibuya.Checked)
            {
                MessageBox.Show($"運賃は{shibuya + 60}円になります");
            }else if (this.adult.Checked && this.ikebukuro.Checked)
            {
                MessageBox.Show($"運賃は{ikebukuro + 60}円になります");
            }
            else if (this.adult.Checked && this.tokyo.Checked)
            {
                MessageBox.Show($"運賃は{tokyo + 60}円になります");
            }
            else if (this.adult.Checked && this.ueno.Checked)
            {
                MessageBox.Show($"運賃は{ueno + 60}円になります");
            }
            else if (this.adult.Checked && this.shinagawa.Checked)
            {
                MessageBox.Show($"運賃は{shinagawa + 60}円になります");
            }else if (this.child.Checked && this.shibuya.Checked)
            {
                MessageBox.Show($"運賃は{(shibuya + 60) / 2}円になります");
            }
            else if (this.child.Checked && this.ikebukuro.Checked)
            {
                MessageBox.Show($"運賃は{(ikebukuro + 60) / 2 }円になります");
            }
            else if (this.child.Checked && this.tokyo.Checked)
            {
                MessageBox.Show($"運賃は{(tokyo + 60) / 2}円になります");
            }
            else if (this.child.Checked && this.ueno.Checked)
            {
                MessageBox.Show($"運賃は{(ueno + 60) / 2}円になります");
            }
            else if (this.child.Checked && this.shinagawa.Checked)
            {
                MessageBox.Show($"運賃は{(shinagawa + 60) / 2}円になります");
            }

        }
    }
}
