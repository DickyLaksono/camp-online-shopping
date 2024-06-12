List<int> list = new List<int>();
for(int i = 1; i <= 10; i++)
{
   list.Add(i);
}

foreach(int i in list)
{
    Console.WriteLine((i * i).ToString());
}