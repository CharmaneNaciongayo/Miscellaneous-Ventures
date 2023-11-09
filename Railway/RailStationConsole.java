import java.util.Scanner;

public class RailStationConsole
{
    public static void main( String[] args) {
        try (Scanner userInput = new Scanner(System.in)) {
            String command = userInput.next();
            int number = userInput.nextInt();
            RailStation rs = new RailStation(number);

            while(!command.equalsIgnoreCase("quit")) {
                switch(command) {

                    case "addGate":
                        rs.addTicketGate();
                        break;

                    case "createSVT":
                        Ticket SVT = new Ticket(true);
                        rs.addTicket(SVT);
                        break;

                    case "createSJT":
                        Ticket SJT = new Ticket(false);
                        rs.addTicket(SJT);
                        break;

                    case "gate":
                        int gateNum = userInput.nextInt();
                        int ticketNum = userInput.nextInt();
                        double fare = userInput.nextDouble();
                        rs.collectFare(gateNum, ticketNum, fare);
                        break;

                    case "topUp":
                        int userTicketNum = userInput.nextInt();
                        double userTopUpAmount = userInput.nextDouble();
                        rs.topUp(userTicketNum, userTopUpAmount);
                        break;
                }
                command = userInput.next();
            }
            rs.printReport();
        }
    }
}