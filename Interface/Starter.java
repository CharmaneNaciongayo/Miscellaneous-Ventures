/**
	This Java file instatiates a new MenuGen class and "adds" the
    newly-defined classes to MenuGen as process options for the
    user to execute indirectly through running this file.  
	
	@author Maria Charmane Rose E. Naciongayo
	@version February 1, 2023
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

public class Starter {
    public static void main(String args[]) {
        Operation arr[] = new Operation[3];
        arr[0] = new Uniqueness();
        arr[1] = new LargestIntegers();
        arr[2] = new GreatestSum();
        MenuGen mg = new MenuGen(arr);
        mg.run();
    }
}