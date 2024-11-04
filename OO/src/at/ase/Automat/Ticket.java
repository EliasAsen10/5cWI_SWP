import java.util.Random;


public class Ticket {
    private int id;
    private long createdTimeStamp;
    private long payedTimeStamp;
    private Random random = new Random();

    public Ticket()
    {
        createdTimeStamp = System.currentTimeMillis();
        id = random.nextInt();
    }

    public int getId() {
        return id;
    }

    public long getCreatedTimeStamp() {
        return createdTimeStamp;
    }

    public void setCreatedTimeStamp(long createdTimeStamp) {
        this.createdTimeStamp = createdTimeStamp;
    }

    public long getPayedTimeStamp() {
        return payedTimeStamp;
    }

    public void setPayedTimeStamp(long payedTimeStamp) {
        this.payedTimeStamp = payedTimeStamp;
    }

    
}