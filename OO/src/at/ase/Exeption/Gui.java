package at.ase.Exeption;

import at.ase.Exeption.CarExeption;
import at.ase.Exeption.EngineExeption;


public class Gui {
    public static void main(String[] args) {
        Engine e1 = new Engine(true);
        Car c1 = new Car(e1);
        try {
            c1.startEngine();
        } catch (CarExeption e) {
            System.out.println(e);
        }
        catch (EngineExeption e) {
            System.out.println(e);
        }
        catch (Exception e) {
        System.out.println(e);
        }
        
    }
    
}
