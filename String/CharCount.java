package String;

public class CharCount {
    static void main(String[] args) {
        String str = "sefsfsfsfsergrgouirhaeoidlkbuidewjkaddnoi";
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            char x = (char) (i + 'a');
            System.out.println(x +" - " + count[i]);

        }
    }
}
