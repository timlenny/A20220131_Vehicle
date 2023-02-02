package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Wählen Sie Fahrrad oder Auto?");

        String input1 = "";
        String input2 = "";

        Car audi = new Car();

        while (!input1.equals("exit") || !input2.equals("exit")){

            input1 = scan.next();

            if(input1.equals("Fahrrad")){
                Bicycle myBike = new Bicycle();

                System.out.println("Wählen Sie Accelerate oder Break?");

                while (!input2.equals("exit")) {
                    input2 = scan.next();
                    if (input2.equals("Accelerate")) { //Beschleunigen
                        myBike.accelerate(10);
                    } else if (input2.equals("Break")) { //Bremsen
                        myBike.Break();
                    }
                }

            } else if (input1.equals("Auto")) {
                Car myCar = new Car();

                System.out.println("Wählen Sie 1 für Beschleunigen und 2 für Bremsen:");

                while (!input2.equals("exit")) {
                    input2 = scan.next();
                    if (input2.equals("Accelerate")) { //Beschleunigen
                        myCar.accelerate(100);
                    } else if (input2.equals("Break")) { //Bremsen
                        myCar.Break();
                    }
                }
            }
        }

        System.out.println("Programm beendet");

    }

}