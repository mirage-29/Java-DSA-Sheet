import java.util.Scanner;

public class maxmin {
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
        int maxindex = 0;
        int minindex = 0;
        for (i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
                maxindex = i;
            } else if (a[i] < min) {
                min = a[i];
                minindex = i;

            }

        }
        System.out.println("The maximum elemrnt of array is " + max + " and is at index number " + maxindex);
        System.out.println("The minimum elemrnt of array is " + min + " and is at index number " + minindex);
        
        sc.close();
    }
   
}