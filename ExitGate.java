public class ExitGate {
    int gateNo;

    public ExitGate(int gateNo){
        this.gateNo=gateNo;
    }

    public void scanTicket(Ticket ticket,String paidAt){
        processPayment(ticket);
        ticket.setPaidAt(paidAt);
        ticket.setType(TicketType.PAID);
    }

    public void processPayment(Ticket ticket){
        System.out.println("Payment processed for ticket "+ticket.getNo());
    }
}
