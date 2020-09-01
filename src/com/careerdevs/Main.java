package com.careerdevs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car  myCar = new Car();

        myCar.test();

        myCar.setDoors(4);
        myCar.setSeats(2);
        myCar.setTires(3);

        myCar.whatKindOfCar();

        VolksWagen myVdub = new VolksWagen(4,2,5);

        //VolksWagen myVdub = new VolksWagen();

        myVdub.showVolksWagen();
        myVdub.whatKindOfCar();

    }
}
