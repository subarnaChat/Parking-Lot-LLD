public class EntryGate {
    int gateNo;

    public EntryGate(int gateNo){
        this.gateNo=gateNo;
    }

    public Ticket printTicket(String issuedAt){
        return new Ticket(gateNo, issuedAt,TicketType.GENERATED);
    }
}
