import java.util.Scanner;

public class frequencyofchar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = "";
        char[] temp = str.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            char k = temp[i];
            int j, count = 0;
            for (j = 0; j < temp.length; j++) {
                if (str2.indexOf(k) != -1)
                    break;
                if (temp[j] == k) {
                    count++;
                }
            }
            if (j != temp.length)
                continue;

            str2 += k;
            System.out.print(k);
            System.out.print(count);

        }
        sc.close();
    }
}
