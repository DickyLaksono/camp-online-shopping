namespace レジスター
{
    public partial class Form_Main : Form
    {
        public Form_Main()
        {
            InitializeComponent();
        }

        private void button_Display_Click(object sender, EventArgs e)
        {
            int total = 0;

            for (int i = 0; i < listBox_Item.Items.Count;i++ )
            {
                string item = this.listBox_Item.Items[i].ToString();

                total += int.Parse(item);

            }

            this.label2.Text= $@"{total}";
        }
    }
}
