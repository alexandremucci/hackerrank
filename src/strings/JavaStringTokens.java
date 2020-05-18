package strings;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        // Write your code here.

        // avoid unnecessary spaces
        s = s.trim();

        // check constraints
        if (s.length() == 0) {
            System.out.println(0);
        } else {
            if (s.length() <= (4 * Math.pow(10,5))) {
                String[] tokens = s.split("[ !,?._'@]+");

                System.out.println(tokens.length);
                for (String token : tokens) {
                    System.out.println(token);
                }
            }
        }

        scan.close();
    }

}
