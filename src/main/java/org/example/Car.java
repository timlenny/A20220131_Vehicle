package org.example;

public class Car extends Vehicle{

    public int accelerate(int kmh){

        //Beschleunigen um übergebene km/h
        super.setVelocity(super.getVelocity() + kmh);

        System.out.println("Das Auto beschläunigt auf " + super.getVelocity() + " kmh");

        return super.getVelocity();

    }

}
