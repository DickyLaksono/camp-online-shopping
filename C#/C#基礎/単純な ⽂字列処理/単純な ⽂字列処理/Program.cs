String input = Console.ReadLine();

int count = 0;

foreach (char cnt in input)
{
    if (cnt == ' ')
    {
        count++;
    }
}

Console.WriteLine(count);
