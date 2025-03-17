package com.example.abstractfactory.main.models;

public class Car {
    
    IEngine engine;
    IvehicleFactory carfFactory;

    Car(IvehicleFactory Factory){
        this.carfFactory = Factory;
    }

    public void drivecar(){
        carfFactory.createEngine();
        System.out.println("mil gayi gaadii ... chill maaroo..");
    }
}
