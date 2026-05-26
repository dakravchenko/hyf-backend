package com.vehicles;

import com.vehicles.model.Car;
import com.vehicles.model.Motorcycle;
import com.vehicles.model.Vehicle;

public class Main {

    public static void main(String[] args) {
        Vehicle car = new Car("Renault", "random", 1999, 4);
        Vehicle moto = new Motorcycle("something", "model", 2033, true);


        car.accelerate(3.9);
        moto.accelerate(99.0);

        car.brake(0.2);
        moto.brake(100.0);

        System.out.println(car);
        System.out.println(moto);
    }

}
