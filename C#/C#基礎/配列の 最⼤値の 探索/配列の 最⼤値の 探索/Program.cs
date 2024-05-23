int[] numbers = [1,2,3,4,10,5,6];

int max = numbers[0];

for (int i = 1; i < numbers.Length; i++)
{
    if (numbers[i] > max)
    {
        max = numbers[i];
    }

}
    Console.WriteLine(max);
