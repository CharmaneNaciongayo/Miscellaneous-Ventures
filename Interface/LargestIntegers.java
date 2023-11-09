/**
	This Java file contains the respective definitions of the
    getOperationName() and operate() methods unique to the Largest Integers
    program option. operate() determines the three largest integers in
    the Integer list that is passed through.
    getOperationName() returns the name of operate()'s defined process. 
	
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

/*
    External sources:
    Arrays.sort(): https://www.geeksforgeeks.org/arrays-sort-in-java-with-examples/
 */
import java.util.*;

public class LargestIntegers implements Operation {
    
    private String operationName;

    public LargestIntegers() {
        operationName = " Largest Integers";
    }

    public String getOperationName() {
        return operationName;
    }

    public void operate(Integer[] a) {
        Arrays.sort(a);
        if (a.length >= 3) {
            System.out.print("The largest integers are " + a[a.length - 3] + ", " + a[a.length - 2] + ", and " + a[a.length - 1] + ".\n");
        } else if (a.length == 2) {
            System.out.print("The largest integers are " + a[0] + " and " + a[1] + ".\n");
        } else if (a.length == 1) {
            System.out.print("The largest integer is " + a[0] + ".\n");
        } else if (a.length == 0) {
            System.out.print("There are no integers.\n");
        }
    }
}