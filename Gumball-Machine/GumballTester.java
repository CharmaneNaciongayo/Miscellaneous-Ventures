/**
	This program creates two imaginary gumball machines named bubble
	and ramble, then it tests these by declaring values for
	refill and pieces for the GumballMachine.java methods to use.
	The returned values get printed out.

	@author Naciongayo, Maria Charmane Rose E. (214152)
	@version October 21, 2022
**/

/*
	I have not discussed the Java language code in my program 
	with anyone other than my instructor or the teaching assistants 
	assigned to this course.

	I have not used Java language code obtained from another student, 
	or any other unauthorized source, either modified or unmodified.

	If any Java language code or documentation used in my program 
	was obtained from another source, such as a textbook or website, 
	that has been clearly noted with a proper citation in the comments 
	of my program.
*/

public class GumballTester{
	public static void main(String[] args) {
		GumballMachine bubble = new GumballMachine();
		GumballMachine ramble  = new GumballMachine();

		bubble.addGumballs(70);
		ramble.sellGumballs(19);
		ramble.addGumballs(24);
		bubble.sellGumballs(48);
		ramble.sellGumballs(14);
		bubble.sellGumballs(14);

		System.out.println("----- BUBBLE MACHINE -----");
		System.out.println("Gumballs Sold: " + bubble.getGumballsSold());
		System.out.println("Remaining Gumballs: " + bubble.getGumballsLeft());
		System.out.printf("Total Sales: PHP " + "%.2f\n", bubble.getSales());
		System.out.println("\n----- RAMBLE MACHINE -----");
		System.out.println("Gumballs Sold: " + ramble.getGumballsSold());
		System.out.println("Remaining Gumballs: "+ ramble.getGumballsLeft());
		System.out.printf("Total Sales: PHP " + "%.2f", ramble.getSales());
	}
}