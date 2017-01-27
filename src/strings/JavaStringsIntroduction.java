package strings;

import java.util.Scanner;

public class JavaStringsIntroduction {

	public static void main(String[] args) {

		String content = "hello \r\n" + "java";
		Scanner sc = new Scanner(content);

        String A = sc.next();
        String B = sc.next();
        
        /* Enter your code here. Print output to STDOUT. */
        
        // sum of lengths
        System.out.println(A.length() + B.length());
        
		// lexicographic test
		String lexiTest = (A.compareTo(B) > 0) ? "Yes" : "No"; 
		System.out.println(lexiTest);
        
        // capitalize first letter of both A and B and then print them separated by a space
        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(A + " " + B);
		
		sc.close();
	}
}
