package com.careerdevs;

public class VolksWagen extends Car{

    private String slogan;

    public VolksWagen(){
        super();
        slogan = "farfegnugen";
    }

    public VolksWagen(int numberOfTires, int numberOfDoors, int numberOfSeats) {
        super(numberOfTires, numberOfDoors, numberOfSeats);
        slogan = "farfegnugen";
    }

    public VolksWagen(int numberOfTires, int numberOfDoors, int numberOfSeats, String newSlogan) {
        super(numberOfTires, numberOfDoors, numberOfSeats);
        this.slogan = newSlogan;
    }

    public void showVolksWagen(){
        System.out.println("I am a VolksWagen!");
    }

    @Override
    public void whatKindOfCar() {
        super.whatKindOfCar();
        System.out.println("This is my slogan: " + this.slogan);
    }

    public void setSlogan(String newSlogan){
        this.slogan = newSlogan;
    }

    public String getSlogan() {
        return slogan;
    }
}
