/**
	This Java file contains the respective definitions of the
    getOperationName() and operate() methods unique to the Uniqueness
    program option. operate() determines whether the Integer
    array that is passed through has no repeating numbers.
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

public class Uniqueness implements Operation{

    private int count;
    private String operationName;
    int characterMatches = 0;

    public Uniqueness() {
        operationName = " Uniqueness";
    }

    public String getOperationName() {
        return operationName;
    }

    public void operate(Integer[] a) {
        if (a.length == 0) {
            System.out.println("There are no elements.");
        } else {
            unique: while (count < a.length) {
                characterMatches = 0;
                for (Integer x : a) {
                    if (a[count] == x) {
                        characterMatches++;
                    }
                }
                characterMatches --;
                if (characterMatches > 0) {
                    System.out.println("NOT all the elements are unique.");
                    count = 0;
                    break unique;
                } else if (count < a.length - 1) {
                    count++;
                } else if (count == a.length - 1) {
                    System.out.println("All the elements are unique.");
                    count = 0;
                    break unique;
                }
            } 
        }
    }
}
