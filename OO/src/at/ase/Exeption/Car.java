package at.ase.Exeption;

import java.util.Random;



public class Car {
    private String colour;
    private Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }
    public void startEngine() throws CarExeption, Exception{
        Random r = new Random();
        if(r.nextBoolean()){
         throw new CarExeption("Error CarExeption");
        }
        if(r.nextBoolean()){
            throw new Exception("Error NullPointerExeption");
           }
        engine.start();

    }

    

    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    
}