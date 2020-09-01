package com.careerdevs;

public class Car {

    private int tires;
    private int doors;
    private int seats;

    public Car(){
        this.tires = 0;
        this.doors = 0;
        this.seats = 0;
    }

    public Car(int numberOfTires, int numberOfDoors, int numberOfSeats){
        this.tires = numberOfTires;
        this.doors = numberOfDoors;
        this.seats = numberOfSeats;
    }

    public void test(){
        System.out.println("I am a car");
    }

    public void whatKindOfCar(){
        System.out.println(" I have " + this.tires + " tires, I have " + this.doors + " doors, and this many " + seats + " seats");
    }

    public void setTires(int numberOfTires){
        tires = numberOfTires;
    }

    public void setDoors(int doors){
        this.doors = doors;
    }

    public void setSeats(int numberOfSeats){
        this.seats = numberOfSeats;
    }

    public void clear(){
        this.tires = 0;
        this.doors = 0;
        this.seats = 0;
    }
}
