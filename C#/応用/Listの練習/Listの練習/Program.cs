using System.Text;

Console.OutputEncoding = Encoding.UTF8;
List<int> list = new List<int>();

Console.WriteLine("整数を入力して、ENTERキーを押してください。");

for (int i = 0; i < 5; i++)
{
    String input = Console.ReadLine();
    list.Add(int.Parse(input));

}

int total = 0;
for (int i = 0;i < list.Count; i++)
{
    total += list[i];
}

Console.WriteLine($"合計 =  {total}");