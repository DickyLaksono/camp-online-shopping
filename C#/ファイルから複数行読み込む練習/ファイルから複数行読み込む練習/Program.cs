using System.Text;

Console.OutputEncoding = Encoding.UTF8; 
StreamReader sr = new StreamReader(@"C:\Users\Public\Documents\price.txt", Encoding.UTF8);

int total = 0;
while (-1 < sr.Peek())
{
    String price = sr.ReadLine();
    total += int.Parse(price);
}

sr.Close();

DateTime dateTime = DateTime.Now;

Console.WriteLine($"支払日時 : {dateTime}");
Console.WriteLine($"値段の場合 : {total}");