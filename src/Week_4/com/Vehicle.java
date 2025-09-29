package Week_4.com;

abstract class Vehicle {
    abstract void start();
    abstract void stop();
    void  fuel()
    {
        System.out.println("Both are needed Fuel");
    }
}

class Car extends   Vehicle{

    @Override
    void start()
    {
        System.out.println("Start the Car");
    }

    @Override
    void stop()
    {
        System.out.println("Stop the Car");
    }
}

class  Bike extends  Vehicle{

    @Override
    void start()
    {
        System.out.println("Start the Bike");
    }

    @Override
    void stop()
    {
        System.out.println("Stop the Bike");
    }

}
class VehicleMain {
    public static void main(String[] args) {
         Vehicle vehicle;
         vehicle = new Car();
         vehicle.start();
         vehicle.stop();

        System.out.println("-------------------------------------");
         vehicle = new Bike();
         vehicle.stop();
         vehicle.fuel();
    }
}