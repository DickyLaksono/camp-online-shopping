using System.Text;

Console.OutputEncoding = Encoding.UTF8;

List<int[]> quetions = new List<int[]>();

Random r = new Random();


for (int i = 0; i < 6; i++)
{
    int[] numbers = new int[2];
    numbers[0] = r.Next(10, 100);
    numbers[1] = r.Next(10, 100);
    quetions.Add(numbers);
}


Console.WriteLine("問題を6問用意しました");
Console.WriteLine("「=」の最後に回答を入力してください");
int score = 0;
foreach (int[] question in quetions)
{
    Console.Write($"{question[0]} + {question[1]} = ");
    String input = Console.ReadLine();
    int n = int.Parse(input);
    if (  n == (question[0] + question[1]))
    {
        Console.WriteLine($"世界は{question[0] + question[1]}! 〇");
        score += 20;
    }
    else
    {
        Console.WriteLine($"世界は{question[0] + question[1]} ×");
        score -= 20;
    }

}
Console.WriteLine($"Score = {score}");