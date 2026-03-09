import java.util.Scanner;

public class onestwoszeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n;
        System.out.print("Enter the size of array : ");
        n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter the elements of array (only 0,1 & 2) ");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Original Array : ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
        int count0 = 0, count1 = 0, count2 = 0;
        for (int j : a) {
            switch (j) {
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
            }
        }
        for (i = 0; i < n; i++) {
            if (count0 != 0) {
                a[i] = 0;
                count0--;
            } else if (count1 != 0) {
                a[i] = 1;
                count1--;
            } else 
                a[i] = 2;
               
        }
        System.out.println("Sorted Array : ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
        sc.close();
    }
}
