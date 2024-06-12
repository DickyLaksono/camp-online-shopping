using System.Text;

StreamReader sr = new StreamReader(@"C:\Users\Public\Documents\messages.txt", Encoding.UTF8);

String mess = sr.ReadToEnd();

sr.Close();

Console.WriteLine(mess);
