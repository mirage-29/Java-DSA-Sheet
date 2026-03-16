package String;

import java.util.Scanner;

public class vowelcount {
    static void main(String[] args) {
        int vcount = 0;

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vcount++;
            }
        }
        System.out.println(vcount);
        System.out.println(str.length()-vcount);
    }
}
