using System.Text;

Console.OutputEncoding = Encoding.UTF8;
StreamReader sr = new StreamReader(@"C:\Users\Public\Documents\data.txt", Encoding.UTF8);

string data = sr.ReadToEnd();

sr.Close();

Console.WriteLine(data);    





