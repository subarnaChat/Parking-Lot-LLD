public class Ticket {
    private int ticketNo;
    private String issuedAt;
    private String paidAt;
    private double amount;
    private TicketType type;

    public Ticket(int ticketNo,String issuedAt,TicketType type){
        this.ticketNo=ticketNo;
        this.issuedAt=issuedAt;
        this.type=type;
    }

    public int getNo(){
        return ticketNo;
    }

    public void setPaidAt(String paidAt){
        this.paidAt=paidAt;
    }

    public void setType(TicketType type){
        this.type=type;
    }

}
