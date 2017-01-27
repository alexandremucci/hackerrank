package datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {

		String content = "5                 \r\n" + 
		                 "5 41 77 74 22 44  \r\n" + 
				         "1 12              \r\n" +
		                 "4 37 34 36 52     \r\n" + 
				         "0                 \r\n" + 
		                 "3 20 22 33        \r\n" + 
				         "5                 \r\n" + 
		                 "1 3               \r\n" + 
				         "3 4               \r\n" + 
		                 "3 1               \r\n" + 
				         "4 3               \r\n" + 
		                 "5 5			    \r\n";

		Scanner scanner = new Scanner(content);
		List<String> list = new ArrayList<String>();

		while (scanner.hasNextLine()) {
			list.add(scanner.nextLine());
		}

		// number of queries
		Integer lineStartQueries = Integer.parseInt(list.get(0).trim()) + 2;

		Integer x;
		Integer y;

		for (int i = lineStartQueries; i < list.size(); i++) {
			x = Integer.parseInt(list.get(i).split(" ")[0].trim());
			y = Integer.parseInt(list.get(i).split(" ")[1].trim());

			try {
				System.out.println(list.get(x).split(" ")[y].trim());
			} catch (IndexOutOfBoundsException e) {
				System.out.println("ERROR!");
			}
		}

		scanner.close();
	};
}
