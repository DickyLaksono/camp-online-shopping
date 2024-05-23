using System.Text;

Console.OutputEncoding = Encoding.UTF8;
int number = 0;
if (number == 0)
{
    Console.WriteLine("零");
}
else if(number < 0){
    Console.WriteLine("負");
}
else
{
    Console.WriteLine("正");
}
