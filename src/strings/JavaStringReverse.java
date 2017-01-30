package strings;

import java.util.Scanner;

public class JavaStringReverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner("madam");

		String A = sc.next();
        String reverseA = new StringBuffer(A).reverse().toString();
        
        System.out.println(A.equals(reverseA) ? "Yes" : "No");
        
        sc.close();
	}
}
