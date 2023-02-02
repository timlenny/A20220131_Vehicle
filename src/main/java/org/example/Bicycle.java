package org.example;

public class Bicycle extends Vehicle{

    public int accelerate(int kmh){

        //Beschleunigen um übergebene km/h
        int newSpeed = (super.getVelocity() + kmh);
        if(newSpeed < 35){
            super.setVelocity(newSpeed);
            System.out.println("Das Fahrrad beschläunigt auf " + newSpeed + " kmh");
        }else{
            System.out.println("Max. Geschwindigkeit von 35 kmh erreicht!");
        }

        return super.getVelocity();

    }

}
