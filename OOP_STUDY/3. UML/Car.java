public class Car extends Vehicle implements Driveable 
{
    private final int numDoors = 4;
    private final String colour = "Blue";
    
    public void drive()
    {
        super.start();
    }

    public void park()
    {
        super.stop();
    }
}
