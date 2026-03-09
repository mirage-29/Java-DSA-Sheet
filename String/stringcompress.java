import java.util.Scanner;

public class stringcompress {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with repeated chars : ");
        String str = sc.nextLine();
        String str2 = "";

        char[] temp = str.toCharArray();
        int i = 0;
        while (i < temp.length) {
            char k = temp[i];
            int j, count = 0;
            for (j = i; j < temp.length; j++) {

                if (temp[j] == k) {
                    count++;
                } else
                    break;
            }

            i = j;
            str2 += k;
            str2 += Integer.toString(count);
        }
        System.out.println(str2);
        sc.close();

    }
}
