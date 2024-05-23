int[][] matrix = [[1,2,3],[4,5,6],[7,8,9]];


for (int i = 0; i < matrix.Length; i++)
{
    int count = 0;
    for (int j = 0; j < matrix[i].Length; j++)
    {
        count += matrix[i][j];
    }
    Console.Write("[" + count + "] ");
}
