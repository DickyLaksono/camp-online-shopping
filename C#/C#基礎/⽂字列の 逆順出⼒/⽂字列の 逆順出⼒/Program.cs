
string[] array = new string[3];
for (int i = 0; i < 3; i++)
{  
    array[i] = Console.ReadLine();
}

for (int i = array.Length -1 ; i >= 0; i--)
{
    Console.Write(array[i] + " ");
}
