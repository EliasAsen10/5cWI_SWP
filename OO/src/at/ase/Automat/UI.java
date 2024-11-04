
public class UI {
    Controller controller;
    Scanner scanner;
    
    private double moneyInserted;

    public UI (Controller controller, Scanner scanner)
    {
        this.controller = controller;
        this.scanner = scanner;
        
    }

    public void ButtonPressed()
    {
        System.out.println("Pressed the Button:     ");
        controller.CreateTicket();
    }

    public void InsertMoney(double betrag)
    {
        moneyInserted += betrag;
        System.out.println(betrag + "€ eingeschmissen");
        if(moneyInserted >= scanner.getPrice()){
            scanner.getTicket().setPayedTimeStamp(System.currentTimeMillis()); 
        } 
        else{
            System.out.println("Zu zahlen: " + (scanner.getPrice() - moneyInserted));
        }
    }
}