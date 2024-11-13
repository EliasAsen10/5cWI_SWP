package at.ase.Exeption;

public class Engine {

    private String colour;
    private boolean hasError;

    public Engine(boolean hasError){
        this.hasError =hasError;
    
    }

    public void start()throws EngineExeption{
        System.out.println("Engine started");
        if(hasError){
            throw new EngineExeption("Engine error");
        }

    
        
    }


}
    

