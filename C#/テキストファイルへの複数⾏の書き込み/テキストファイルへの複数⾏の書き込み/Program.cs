using System.Text;

Console.OutputEncoding = Encoding.UTF8;
StreamWriter sw = new StreamWriter(@"C:\Users\Public\Documents\messages.txt", false, Encoding.UTF8);
String[] mess = { "Welcome", "To", "C#" };

for (int i = 0; i < mess.Length; i++) 
{
    String s = mess[i]; 
    sw.WriteLine(s);   
}

sw.Close();
