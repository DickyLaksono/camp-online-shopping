using System.Text;

StreamReader sr = new StreamReader(@"C:\Users\Public\Documents\original.txt", Encoding.UTF8);
StreamWriter sw = new StreamWriter(@"C:\Users\Public\Documents\copy.txt", false, Encoding.UTF8);
String original = sr.ReadLine();
sw.WriteLine(original); 

sr.Close();
sw.Close();

Console.WriteLine(original);
