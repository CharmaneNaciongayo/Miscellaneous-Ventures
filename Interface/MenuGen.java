import java.util.ArrayList;
import java.util.Scanner;

public class MenuGen {

  Operation[] oVector = null;
  int exitKey;

  public MenuGen(Operation[] o) {
    oVector = o;
  }

  public void run() {
    int x;
    ArrayList<Integer> list;
    Scanner s = new Scanner(System.in);

    while(true) {
      printMenu();

      x = s.nextInt();

      System.out.println();

      if(x < 0 || x > exitKey) {
        System.out.println("INVALID INPUT!");
      }
      else if(x < exitKey) {
        System.out.println("=============================================");
        System.out.println("You've chosen the" + oVector[x].getOperationName().toUpperCase() + " operation.");
        System.out.println("=============================================");

        list = new ArrayList<Integer>();
        String input;

        while(true) {
          System.out.print("Input an integer: ");
          input = s.next();

          if(input.equals("e")) {
            break;
          } else {
            try {
              list.add(Integer.parseInt(input));
            } catch(NumberFormatException e) {
              System.out.println("INVALID INPUT!");
            }
          }
        }

        Integer arr[] = new Integer[list.size()];
        list.toArray(arr);

        System.out.println("=============================================");
        System.out.print("RESULT: ");
        oVector[x].operate(arr);
        System.out.println("=============================================");
      } else {
        break;
      }
    }
  }

  private void printMenu() {
    System.out.println();
    System.out.println("CHOOSE AN OPERATION");
    exitKey = 0;
    if(oVector == null) {
      System.out.println("[0] Exit");
      System.out.print("Enter option: ");
      return;
    }

    while(exitKey < oVector.length) {
      System.out.println("[" + exitKey + "]" + oVector[exitKey].getOperationName());
      exitKey++;
    }

    System.out.println("[" + exitKey + "] Exit");
    System.out.print("Enter choice number: ");
  }

  public static void main(String[] args) {
    Operation arr[] = new Operation[1];
    arr[0] = new Sum();
    MenuGen mg = new MenuGen(arr);
    mg.run();
  }

}
