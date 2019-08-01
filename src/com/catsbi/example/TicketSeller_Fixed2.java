package com.catsbi.example;

public class TicketSeller_Fixed2 {
    private TicketOffice ticketOffice;

    public TicketSeller_Fixed2(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }
    
    /*remove getter*/
    /*public TicketOffice getTicketOffice() {
        return ticketOffice;
    }*/

    public void sellTo(Audience_Fixed audience_fixed){
       ticketOffice.plusAmount(audience_fixed.buy(ticketOffice.getTicket()));
    }

}
