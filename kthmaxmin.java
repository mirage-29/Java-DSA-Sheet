//package SearchandSort;

import java.util.Scanner;

public class kthmaxmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elemrnts of array : ");
        for (int i =0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
        arr = bubble(arr, n);
        System.out.print("Enter value of k : ");
        int k =sc.nextInt();
        System.out.println("k'th min = " + arr[k-1]);
        System.out.println("k'th max = " + arr[n-k]);
        
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
        return arr;
    }

}
