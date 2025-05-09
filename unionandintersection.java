import java.util.Scanner;

public class unionandintersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n;
        System.out.print("Enter the size of first array : ");
        n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter the elements of first array ");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the size of second array : ");
        n = sc.nextInt();

        int b[] = new int[n];
        System.out.println("Enter the elements of second array ");
        for (i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println("First Array is : ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");

        }
        System.err.println();
        System.out.println("Second Array is : ");
        for (i = 0; i < n; i++) {
            System.out.print(b[i] + "\t");

        }
        System.out.println();
        Union(a, b);
        Intersection(a, b);
    }

    static void Intersection(int[] a, int[] b) {
        System.out.println("Intersection of arrays is :");
        int i, j;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.print(a[i] + "\t");
                    break;
                }
            }
        }
        System.out.println();
    }

    static void Union(int[] a, int[] b) {
        System.out.println("Union of arrays is :");
        int c[] = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        int j = a.length;

        for (int i = 0; i < b.length; i++) {
            int k;
            for (k = 0; k < c.length; k++) {
                if (b[i] == c[k])
                    break;
            }
            if (k == c.length) {
                c[j] = b[i];
                j++;

            }

        }
        for (int i = 0; i < j; i++) {
            System.err.print(c[i] + "\t");

        }
        System.out.println();
    }
}