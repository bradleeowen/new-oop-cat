package Abstraction;

public class Fan extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("Fan is spinning now!");
    }
}
