/**
	This Java file contains the respective definitions of the
    getOperationName() and operate() methods unique to the Greatest Sum
    program option. operate() determines the largest sum that can be
    obtained by adding 3 consecutive integers in the Integer list.
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
    Collections.sort(): https://www.geeksforgeeks.org/collections-sort-java-examples/
    intValue(): https://www.geeksforgeeks.org/integer-intvalue-method-in-java/
*/

import java.util.*;

public class GreatestSum implements Operation {
    private String operationName;
    private int greatestSum = 0;
    private int tentativeSum = 0;

    public GreatestSum() {
        operationName = " Greatest Sum";
    }
    
    public void operate(Integer[] a) {
        ArrayList<Integer> sumList = new ArrayList<>();
        if (a.length <= 3) {
            for (Integer x : a) {
                greatestSum += x.intValue();
            }
		} else {
            int count = 0;
            while (count < a.length - 2) {
                for (Integer x : a) {
                    tentativeSum = a[count].intValue() + a[count + 1].intValue() + a[count + 2].intValue();
                    sumList.add(tentativeSum);
                }
                count++;
            }
            Collections.sort(sumList);
            greatestSum = sumList.get(sumList.size() - 1);
        }
        System.out.println("The greatest sum is " + greatestSum);
    }

    public String getOperationName() {
        return operationName;
    }
}