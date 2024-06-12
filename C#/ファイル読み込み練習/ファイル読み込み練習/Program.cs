using System.Text;

StreamReader sr = new StreamReader(@"C:\Users\Public\Documents\greeting.txt", Encoding.UTF8);

String greeting = sr.ReadLine();

sr.Close();

Console.WriteLine(greeting);
