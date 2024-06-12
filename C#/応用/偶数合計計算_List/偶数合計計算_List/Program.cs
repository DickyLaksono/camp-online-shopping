using System.Collections.Generic;

List<int> list  = new List<int>();  

for(int i = 1; i <= 100; i++)
{
    list.Add(i);
}
int count = list.Count;

for(int i = count - 1; 0 <= i; i--)
{
    if (list[i] % 2 == 1)
    {
        list.RemoveAt(i);   
    }
}
int total = 0;
for (int i = 0; i < list.Count; i++)
{
        total += list[i];

}
Console.WriteLine(total);  

