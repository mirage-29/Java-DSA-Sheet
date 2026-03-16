package String;

public class firstrepeatingchar {
    static void main(String[] args) {
        String str = "sefsfsfsfsergrgouirhaeoidlkbuidewjkaddnoi";
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            if(count[str.charAt(i) - 'a']!=0)
            {
                System.out.println(str.charAt(i));
                return;
            }
            count[str.charAt(i) - 'a']++;
        }

    }
}
