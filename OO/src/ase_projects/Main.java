package ticket;


public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Ticket ticket = printer.PrintTicket();
        System.out.println("id"+ ticket.getId() + "createdTimestamp:" + ticket.getCreatedTimeStamp() + " PayedStamp" + ticket.getPayedTimeStamp());
    }
}