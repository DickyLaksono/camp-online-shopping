using System.Text;

StreamReader sr = new StreamReader(@"C:\Users\Public\Documents\input.txt", Encoding.UTF8);
StreamWriter sw = new StreamWriter(@"C:\Users\Public\Documents\numbered.txt",false, Encoding.UTF8);

int number = 0;
while (-1 < sr.Peek())
{
number++;   
String input  = sr.ReadLine(); 
sw.WriteLine(number + " : " + input);
Console.WriteLine(input);
}
sw.Close();
sr.Close(); 

