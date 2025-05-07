public class sortalgo {
    static int[] a = { 5, 1, 54, 2, 0, 22, 13, 14, 64 };
    static int n = a.length;

    public static void main(String[] args) {
        System.out.println("The array is :");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
        System.err.println();
        sort(0, n - 1);

        System.out.println("The sorted array is :");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }

    }

    static void sort(int l, int h) {

        if (!(l < h)) {
            return;
        }

        int max = a[l];
        int min = a[h];
        int maxindex = l;
        int minindex = l;
        for (int i = l; i <= h; i++) {
            if (a[i] > max) {
                max = a[i];
                maxindex = i;
            } else if (a[i] < min) {
                min = a[i];
                minindex = i;

            }

        }

        a[minindex] = a[l];
        a[l] = min;

        a[maxindex] = a[h];
        a[h] = max;

        sort(l + 1, h - 1);

    }
}