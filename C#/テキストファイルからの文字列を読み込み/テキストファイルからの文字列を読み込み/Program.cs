using System.Text;

StreamReader sr = new StreamReader(@"C:\Users\Public\Documents\sample.txt", Encoding.UTF8);

String sample = sr.ReadLine();

sr.Close(); 

Console.WriteLine(sample);  
