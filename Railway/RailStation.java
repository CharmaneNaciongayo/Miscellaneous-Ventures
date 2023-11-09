import java.util.ArrayList;

public class RailStation {
    
    TicketGate gates[];
    ArrayList<Ticket> ticketList;
    int userGates = 0;

    public RailStation (int numGates) {
        gates = new TicketGate[numGates];

        for(int i=0; i < numGates; i++) {
            gates[i] = new TicketGate();
        }

        ticketList = new ArrayList<Ticket>();
        System.out.println("RailStation created.");
    }

    public void addTicket(Ticket t) {
        ticketList.add(t);
        System.out.printf("Ticket %d added\n", ticketList.indexOf(t));
    }

    public void addTicketGate() {

        if(userGates < gates.length) {
            gates[userGates] = new TicketGate();
            System.out.printf("TicketGate %d added.\n", userGates);
            userGates += 1;

        } else {
            System.out.println("Cannot add new TicketGate.");
        }
    }

    public void collectFare(int gateNum, int ticketNum, double fare) {
        gates[gateNum].collectFare(ticketList.get(ticketNum), fare);
    }

    public void topUp(int ticketNum, double amount) {
        
        if (ticketList.get(ticketNum).isStoredValue() == true) {
            ticketList.get(ticketNum).topUp(amount);
            System.out.printf("Ticket %d topped up with PHP %.2f, credit is now PHP %.2f.\n", ticketNum, amount, ticketList.get(ticketNum).getCredit());
        
        } else {
            System.out.printf("Ticket %d cannot be topped up.\n", ticketNum);
        }
    }

    public void printReport() {
        System.out.println("---------- RAIL STATION REPORT ----------");
        System.out.println("| Gate   |      Fares | SJT | SVT | LRB |");
        System.out.println("-----------------------------------------");
        
        for (int i = 0; i < gates.length; i++) {
            System.out.printf("| Gate %d | Php %.2f |   %d |   %d |   %d |\n", i, gates[i].getCollections(), gates[i].getSJT(), gates[i].getSVT(), gates[i].getBonuses());
        }
        
        System.out.println("-----------------------------------------");
    }
}