import java.util.Scanner;

public class posnegsort {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int i, n;
        System.out.print("Enter the size of array : ");
        n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of array (positive and negative) ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
System.out.println("Original Array : ");
        for ( i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        arr = bubble(arr, n);
        System.out.println("Sorted  Array : ");
        for ( i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
      sc.close();
    }

    static int[] bubble(int arr[], int n) {
        int i;
        for (i = 0; i < n - 1; i++) {
            int count = 0;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                }
            }
            if (count == 0)
                break;

        }
        System.out.println(i);
        return arr;
    }

}


