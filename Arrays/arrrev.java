import java.util.Scanner;

public class arrrev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n;
        System.out.print("Enter the size of array : ");
        n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter the elements of array ");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int s = n - 1;
        i = 0;
        while (i < s) {
            int t = a[i];
            a[i] = a[s];
            a[s] = t;
            i++;
            s--;

        }
        System.out.println("The reversed array is :-");
        for (i = 0; i < n; i++) {
            System.out.println(a[i] + "\t");

        }
        sc.close();
        
    }
}
