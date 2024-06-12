using System.Text; ;

StreamWriter sw = new StreamWriter(@"C:\Users\Public\Documents\sample.txt", false, Encoding.UTF8);

String sample = "Hello, World!";
sw.WriteLine(sample);

sw.Close();
