using System.Collections.Generic;
using System.Text;

namespace 課題13
{
    public partial class Form_Main : Form
    {
        public Form_Main()
        {
            InitializeComponent();
        }

        private List<string> listName = new List<string>();
        private void button1_Click(object sender, EventArgs e)
        {
            readData();
            showData();
        }

     

     
        private void showData()
        {
            this.listBox_Names.Items.Clear();

            foreach (string name in listName)
            {
                this.listBox_Names.Items.Add(name);

            }
        }


        private void readData()
        {

            string filePath = @"C:\Users\Public\Documents\names.txt";
            StreamReader sr = new StreamReader(filePath, Encoding.UTF8);

            List<string> list = new List<string>();

            while(-1 < sr.Peek())
            {
              
                listName.Add(sr.ReadLine());
            }
            sr.Close();
           
            

        }
    }
}
