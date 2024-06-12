public class Car
{
    private bool runningEngine = false; 
    private int speed = 0;

    private string carModel = string.Empty;
    
    public string CarModel
    {
        set
        {
            this.carModel = value;  
        }
        get
        {
            return this.carModel;   
        }
    }
    public void StartEngine()
    {
        if(runningEngine)
        {
            Console.WriteLine("すでにエンジンがついています");
        }
        else
        {
            runningEngine = true;
            Console.WriteLine("エンジンを付けました");
        }

    }

    public void TurnOff()
    {
        if (runningEngine)
        {
            runningEngine = false;
            Console.WriteLine("エンジンんを切りました");
        }
        else
        {
            Console.WriteLine("すでにエンジンが切れています");
        }
    }

    public string GetDrivingStatus()
    {
        string message = $"現在{this.speed}で走行中です。";
        return message;
    }

    public void Accelerate(int value)
    {
        if (runningEngine)
        {
            speed += value;
        }
    }

    public void Decelerate(int value)
    {
        if (runningEngine) { 
            speed -= value; 
        }

        if(speed < 0)
        {
            speed = 0;
        }
    }

    public double CalculateFuelConsumtion(double mileage)
    {
        double fuelEfficienty = 0.1;
        double fuelConsumtionQuality = mileage * fuelEfficienty;
        return fuelConsumtionQuality;

    }
}