public abstract class Vehicle implements Driveable 
{
    private String fuelType;
    private String manufacturer;

    public void start()
    {
        System.out.println("Vehicle is starting");
    }

    public void stop()
    {
        System.out.println("Vehicle is stopping");
    }
}
