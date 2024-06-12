using System.Text;

Console.OutputEncoding = Encoding.UTF8; 
StreamWriter sw = new StreamWriter(@"C:\Users\Public\Documents\name.txt", false, Encoding.UTF8);

String name = "IF太郎";

sw.WriteLine(name); 

sw.Close();