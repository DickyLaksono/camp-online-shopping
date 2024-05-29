namespace 宝くじ
{
    public partial class Form_main : Form
    {
        public Form_main()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
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

            MessageBox.Show(random);


        }
    }
}
