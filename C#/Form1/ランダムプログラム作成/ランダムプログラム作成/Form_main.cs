namespace ランダムプログラム作成
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button_Display_Click(object sender, EventArgs e)
        {
            string[] who = [ "ウー",
                             "トゥイ",
                             "タイ",
                             "ダット",
                             "ハン",
                             "ゆっせふ",
                             "てっと",
                             "チョー",
                             "ブラッド",
                             "マルガリター"
                ];

            string[] what = ["携帯電話",
                             "自動車",
                             "パソコン",
                             "テレビ",
                             "冷蔵庫",
                             "時計",
                             "本",
                             "自転車",
                             "机",
                             "椅子"
                ];

            string[] doing = ["を使う",
                              "を運転する",
                              "を操作する",
                              "を見る",
                              "を開ける",
                              "を見る",
                              "を読む",
                              "に乗る",
                              "に座る",
                              "に座る"
                ];

            Random r = new Random();

            int number1 = r.Next( who.Length );
            int number2 = r.Next(what.Length);
            int number3 = r.Next(doing.Length);

            string whoR = who[number1];
            string whatR =what[number2];
            string doingR = doing[number3];


            MessageBox.Show(whoR+ "が" + whatR + doingR);
        }
    }
}
