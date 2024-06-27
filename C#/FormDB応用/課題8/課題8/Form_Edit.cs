using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace 課題8
{
    public partial class Form_Edit : Form
    {
        public Form_Edit()
        {
            InitializeComponent();
        }

        public string StudentName
        {
            get
            {
                return this.textBox1.Text;
            }
            set
            {
                this.textBox1.Text = value;
            }
        }

        public int japanesePoint 
        {
            get
            {
                return (int)this.numericUpDown_Japanese.Value;
           }
            set
            {
                this.numericUpDown_Japanese.Value = value;
            }
        }
        public int englishPoint
        {
            get
            {
                return (int)this.numericUpDown_English.Value;
           }
            set
            {
                this.numericUpDown_English.Value = value;
            }
        }
        public int mathematicsPoint
        {
            get
            {
                return (int)this.numericUpDown_Mathematics.Value;
          }
            set
            {
                this.numericUpDown_Mathematics.Value = value;
            }
        }
    }
}
