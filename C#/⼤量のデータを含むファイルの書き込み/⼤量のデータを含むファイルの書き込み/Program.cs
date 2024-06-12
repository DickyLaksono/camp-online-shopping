using System.Text;

StreamWriter sw = new StreamWriter(@"C:\Users\Public\Documents\large.txt", false, Encoding.UTF8);

for (int i = 1; i <= 100; i++)
{
    sw.WriteLine(i);
}

sw.Close();
