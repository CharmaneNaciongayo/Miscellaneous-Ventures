public class TicketGate {

    private Ticket toScan;
    private double totalFare;
    private int storedValueTickets;
    private int singleJourneyTickets;
    private int bonusRides;

    public TicketGate() {
        toScan = null;
        totalFare = 0;
        storedValueTickets = 0;
        singleJourneyTickets = 0;
        bonusRides = 0;
    }

    public void collectFare(Ticket currentTicket, double fare) {
        toScan = currentTicket;

        if (toScan.isStoredValue()) {
            System.out.println("Thank you for using your Stored-Value Ticket.");

            if (toScan.getCredit() >= fare) {
                totalFare += fare;
                toScan.deductFare(fare);
                System.out.printf("    You have paid PHP %.2f in fare.\n    Your remaining stored credit is PHP %.2f.\n", fare, currentTicket.getCredit());
                storedValueTickets += 1;
            
            } else {

                if (toScan.getCredit() > 0) {
                    totalFare += toScan.getCredit();
                    System.out.printf("    You have used your Last Ride Bonus.\n    Your remaining credit of PHP %.2f has been collected. Please top up soon.\n", currentTicket.getCredit());
                    toScan.deductFare(toScan.getCredit());
                    bonusRides += 1;
                    storedValueTickets += 1;

                } else if (toScan.getCredit() == 0){
                    System.out.println("    You are not eligible for the Last Ride Bonus as your remaining credit is PHP 0.00.\n    Please top up then try again.");
                }
            }
            

        } else {
            totalFare += fare;
            System.out.printf("Single-Journey Ticket: You paid PHP %.2f in fare.\n", fare);
            singleJourneyTickets += 1;
        }
    }

    public double getCollections() {
        return totalFare;
    }

    public int getSJT() {
        return singleJourneyTickets;
    }

    public int getSVT() {
        return storedValueTickets;
    }

    public int getBonuses() {
        return bonusRides;
    }
}