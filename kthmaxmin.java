import java.util.Scanner;

public class kthmaxmin {
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
        int max = a[0];
        int min = a[0];

        for (i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];

            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.print("Enter value of k : ");
        int k = sc.nextInt();
        int kmax, kmin;
        kmax = Integer.MIN_VALUE;
        kmin = Integer.MAX_VALUE;
        i = 0;
        while (i < k - 1) {
            for (int m = 0; m < n; m++) {
                if (a[m] > kmax && a[m] < max)
                    kmax = a[m];
                if (a[m] < kmin && a[m] > min)
                    kmin = a[m];

            }
            i++;
            if (i < k - 1) {
                max = kmax;
                min = kmin;
                kmax = a[0];
                kmin = a[0];
            }

        }
        System.out.println(k + " Max = " + kmax);
        System.out.println(k + " Min = " + kmin);
        sc.close();
    }
}
