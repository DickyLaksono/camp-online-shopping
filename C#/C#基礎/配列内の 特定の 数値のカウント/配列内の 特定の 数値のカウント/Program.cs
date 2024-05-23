int[] numbers = [5, 3, 5, 6, 7, 5,];
int count = 0;
for (int i = 0; i < numbers.Length; i++)
{
    if (numbers[i] == 5)
    {
        count++;
    }
}
Console.WriteLine(count);