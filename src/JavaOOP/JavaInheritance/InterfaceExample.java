package JavaOOP.JavaInheritance;

// Interface
interface Vehicle {
    void start();
    void stop();
    int getSpeed();
}

// Superclass
class BaseVehicle implements Vehicle {
    private int speed;

    public BaseVehicle() {
        speed = 0;
    }

    public void start() {
        System.out.println("Vehicle is starting.");
    }

    public void stop() {
        System.out.println("Vehicle is stopping.");
        speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    protected void accelerate(int increment) {
        speed += increment;
        System.out.println("Vehicle is accelerating to " + speed + " kmph.");
    }
}

// Subclass
class Car extends BaseVehicle {
    public void accelerate(int increment) {
        super.accelerate(increment);
        System.out.println("Car is accelerating.");
    }

    public void honk() {
        System.out.println("Car is honking.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.accelerate(50);
        car.honk();
        System.out.println("Current speed: " + car.getSpeed());
        car.stop();
        System.out.println("Current speed: " + car.getSpeed());
    }
}