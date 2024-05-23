using System.Text;

Console.OutputEncoding = Encoding.UTF8;

string[] colors = ["赤", "緑", "青"];
for (int i = 0; i < colors.Length; i++)
{
    if (colors[i] == "緑")
    {
        Console.WriteLine("緑色");
    }
}
