using System.Text.Unicode;
using System.Text;
namespace 課題9
{
    public partial class Form_Main : Form
    {
        public Form_Main()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            this.openFileDialog1.ShowDialog();
        }

        private void openFileDialog1_FileOk(object sender, System.ComponentModel.CancelEventArgs e)
        {
            StreamReader sr = new StreamReader(this.openFileDialog1.FileName, Encoding.UTF8);

            string read = sr.ReadToEnd();

            sr.Close();

            MessageBox.Show(read);

        }

        private void button2_Click(object sender, EventArgs e)
        {
            string[] sacredLot = {
                                   "大吉：今日は最高の一日。",
                                   "吉：いろいろいいことがあるかも",
                                   "中吉：ほしいもが手に入れるかも",
                                   "小吉：まわりのお願いがかなうかも",
                                   "半吉：果報は寝て待て",
                                   "末小吉：普通な一日、欲張らないほうがいいかも",
                                   "凶：ちょっと今日はついていないかも",
                                   "小凶：あまりついていない日。気を付けたほうがいいかも",
                                   "半凶：いいことが起きそうにないかも",
                                   "末凶：ついていない日。あまり無駄遣いしないほうがいいかも",
                                   "大凶：最悪の一日。おとなしくして置いたほうがいい"
            };
            Random r = new Random();
            int number = r.Next(sacredLot.Length);
            string random = sacredLot[number];

            string input = this.textBox_Name.Text;

            MessageBox.Show(input + "さんの本日運勢は...\n" + random);
        }
    }
}
