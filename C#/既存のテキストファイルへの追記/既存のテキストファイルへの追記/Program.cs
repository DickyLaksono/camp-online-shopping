using System.Text;

StreamWriter sw = new StreamWriter(@"C:\Users\Public\Documents\log.txt", false, Encoding.UTF8);

DateTime dateTime = DateTime.Now;
sw.WriteLine(dateTime);
sw.Close();
