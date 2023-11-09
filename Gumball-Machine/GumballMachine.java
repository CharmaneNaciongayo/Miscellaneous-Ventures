/**
	This program generates and initializes an imaginary gumball machine
	(GumballMachine) with a starting number of gumballs (totalGumballs),
	coins (coins), dispensed gumballs (dispensedGumballs), and gumball
	price (price). It also defines the refilling and selling process through
	arithmetic statements, some dependent on externally declared values,
	and returns key inventory and sales statistics based on the initialized
	values post-arithmetic. 
	
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

	public class GumballMachine{
		private int totalGumballs;
		private double coins;
		private int dispensedGumballs;
		private double price;

		public GumballMachine(){
			totalGumballs = 50;
			coins = 0;
			dispensedGumballs = 0;
			price = 7.50;
		}	
		
		public void addGumballs(int refill){
			totalGumballs += refill;
		}
		public void sellGumballs(int pieces){
			totalGumballs -= pieces;
			dispensedGumballs += pieces;
			coins += price * pieces;
		}	
		public int getGumballsLeft(){
			return totalGumballs;
		}
		public int getGumballsSold(){
			return dispensedGumballs;
		}
		public double getSales(){
			return coins;
		}
	}