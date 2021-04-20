package sesson8;

public class FightTicket {
    Date departureDate;
    Time departureTime;
    double totalPrice;
    double price = 1000;
    byte noOfTickets;
    byte typeOfCabin;

    public FightTicket(Date departureDate, Time departureTime, byte noOfTickets, byte typeOfCabin) {
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.price = price;
        this.noOfTickets = noOfTickets;
        this.typeOfCabin = typeOfCabin;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(byte day,byte month, short year) {
        this.departureDate = departureDate;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public byte getNoOfTickets() {
        return noOfTickets;
    }

    public double getTotalPrice() {
        return totalPrice=noOfTickets*price;
    }

    public void displayTicketInformation(){
        System.out.println("Following is the information about the ticket(s) booked:");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Departure Date:" +departureDate);
        System.out.println("Departure time:" +departureTime );
        System.out.println("Number of tickets: "+getNoOfTickets());
        if(typeOfCabin==1){
            System.out.println("Type of cabin: Business class");
            this.price=3000;
        }else if (typeOfCabin==2){
            System.out.println("Type of cabin: First class");
            this.price=2000;
        }else {
            System.out.println("Type of cabin: Economy class");
            this.price=1000;
        }
        System.out.println("Total cost of the ticket: $"+ getTotalPrice());
    }
}
