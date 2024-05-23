int[][] table = [[1,2],[3,4]];
for (int i = 0; i < table.Length; i++)
{
    for (int j = 0; j < table[i].Length; j++)
    {
        if (table[i][j] == 4)
        {
        Console.WriteLine(table[i][j]);

        }
        else
        {
            Console.WriteLine(table[i][j]+ ", ");
        }
    }
}
