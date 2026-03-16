package String;

public class nonrepeatingchar {
    static void main(String[] args) {
        String str = "sefsfsfsfsergrgouirhaeoidlkbuidewjkaddnoi";
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] == 1) {
                char ch = (char)(i + 'a');
                System.out.println(ch);
                break;
            }
        }

    }
}
