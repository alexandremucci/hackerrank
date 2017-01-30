package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JavaSubstring {

	public static void main(String[] args) {
		
		String conteudo = "welcometojava" + "\r\n" + "3";
		
		Scanner scanner = new Scanner(conteudo);
        String text = scanner.next();
        int subsLength = scanner.nextInt();
        
        List<String> list = new ArrayList<>();
        final int maxLoop = text.length() - subsLength;
        
        for (int i = 0; i <= maxLoop; i++) {
       		list.add(text.substring(i,i + subsLength));
        }
        
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        
        scanner.close();
	}
}
