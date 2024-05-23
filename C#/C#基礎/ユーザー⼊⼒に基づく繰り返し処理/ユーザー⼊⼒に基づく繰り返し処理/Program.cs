
using System.Text;

Console.OutputEncoding = Encoding.UTF8; 

string num = Console.ReadLine();
int input = int.Parse(num);

if (input > 0)
{
    for (int i = 0; i < input; i++)
    {
        Console.WriteLine("こんにちは");
    }
}
else
{
    Console.WriteLine("不正な入力");
}