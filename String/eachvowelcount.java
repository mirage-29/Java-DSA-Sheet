package String;

import java.util.HashMap;

public class eachvowelcount {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        String str = "Abcdefahijklmnopqrstuvwxyz";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
            }
        }
    }
}
