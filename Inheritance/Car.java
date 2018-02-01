package Inheritance;
/**
 * Write a description of class Car here.
 *
 * @author Joshua Hergenroeder
 * @version 01 February 2018
 */
public class Car extends Vehicle
{
    int wheels;
    int cylinders;
    boolean engineOn;
    int doors;
    /**
     * Constructor for objects of class Car
     */
    public Car(int seats, double speed, String name, int wheels, int cylinders, int doors){
        super(seats, speed, name);
        engineOn = false;
        this.wheels = wheels;
        this.cylinders = cylinders;
        this.doors = doors;
    }
    public void turnOn(){
        if (engineOn){
            System.out.println("The engine is already on.");
        }else{
            System.out.println("You turn the key and the engine turns on.");
            engineOn = true;
        }
    }
    public void turnOff(){
        if (engineOn){
            System.out.println("The engine turns off. You can now remove the key.");
            engineOn = false;
        }else{
            System.out.println("The engine is already off.");
        }
    }
}