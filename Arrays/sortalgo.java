package Arrays;

public class sortalgo {
   
    public static void main(String[] args) {
           int[] a = { 54, 2, 0, 22, 13, 64 };
            int n = a.length;
        System.out.println("The array is :");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
        a=sort(a,0, n - 1);

        System.out.println("The sorted array is :");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }

    }

    static int[] sort(int[] arr,int l, int h) {

        if (!(l < h)) {
            return arr;
        }

        int max = arr[l];
        int min = arr[l];
        int maxindex = l;
        int minindex = l;
        for (int i = l; i <= h; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxindex = i;
            } else if (arr[i] < min) {
                min = arr[i];
                minindex = i;

            }

        }

        arr[minindex] = arr[l];
        arr[l] = min;

        arr[maxindex] = arr[h];
        arr[h] = max;

        return sort(arr,l + 1, h - 1);

    }
}