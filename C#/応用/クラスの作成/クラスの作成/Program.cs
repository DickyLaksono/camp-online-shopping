using System.Text;

Console.OutputEncoding = Encoding.UTF8;

Car car = new Car();

car.CarModel = "leaf";
Console.WriteLine($"車種{car.CarModel}");    

car.StartEngine();
//car.TurnOff();  
string drivingStatus = car.GetDrivingStatus();
Console.WriteLine(drivingStatus);

Console.WriteLine("加速する速度を入力してください");
int value = int.parse(Console.ReadLine());
car.Accelerate(value);

drivingStatus  = car.GetDrivingStatus();
Console.WriteLine(drivingStatus);

double mileage = 1000;
double fuelContumtionQuality = car.CalculateFuelConsumtion(mileage);

Console.Write($"走行距離{mileage}kmの燃料消費量は{fuelContumtionQuality}L");