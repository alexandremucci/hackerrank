package strings;

import java.util.Arrays;

public class JavaAnagrams {

    public static void main(String[] args) {

        String a = "Anagram";
        String b = "margana";

        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

    }

    static boolean isAnagram(String a, String b) {
        // Complete the function

        // won't check nulls due to problem constraints

        if (a.length() != b.length()) {
            return false;
        } else {

            // avoid case sensitive problem
            a = a.toLowerCase();
            b = b.toLowerCase();

            // set up a map with each character as a key and its frequency as value
            java.util.Map<Character, Integer> mapA = new java.util.HashMap<>();

            // iterate over string a chars and fill the map
            for (int i = 0; i < a.length(); i++) {
                char x = a.charAt(i);

                if (!mapA.containsKey(x)) {
                    mapA.put(x, 1);
                } else {
                    Integer charFrequency = mapA.get(x);
                    mapA.put(x, ++charFrequency);
                }
            }

            // iterate over string b chars and compare with mapA
            for (int j = 0; j < b.length(); j++) {
                char x = b.charAt(j);

                // if the mapA does not contain the char, return false
                if (!mapA.containsKey(x)) {
                    return false;
                }

                // otherwise, get the frequency
                Integer charFrequency = mapA.get(x);

                // reduce the frequency on mapA, but if it is already zero, return false
                if (charFrequency == 0) {
                    return false;
                } else {
                    mapA.put(x, --charFrequency);
                }
            }

            return true;
        }

    }
}
