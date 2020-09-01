package com.careerdevs;

public class Toyota extends VolksWagen{
    private String steeringWheeelLocation;

    public Toyota(){
        super();
        steeringWheeelLocation = "Right";
    }

    public Toyota(int numberOfTires, int numberOfDoors, int numberOfSeats) {
        super(numberOfTires, numberOfDoors, numberOfSeats);
        super.setSlogan("You'll Love It!");
        steeringWheeelLocation = "Right";
    }

    public Toyota(int numberOfTires, int numberOfDoors, int numberOfSeats, String newSlogan) {
        super(numberOfTires, numberOfDoors, numberOfSeats, newSlogan);
    }

    public Toyota(int numberOfTires, int numberOfDoors, int numberOfSeats, String newSlogan, String newSteeringWheeelLocation) {
        super(numberOfTires, numberOfDoors, numberOfSeats, newSlogan);
        this.steeringWheeelLocation = newSteeringWheeelLocation;
    }

    public void showToyota(){
        System.out.println("I am a Toyota!");
    }

    @Override
    public void whatKindOfCar() {
        super.whatKindOfCar();
        super.getSlogan();
        System.out.println("This is steering wheel location is: " + this.steeringWheeelLocation);
    }
}
