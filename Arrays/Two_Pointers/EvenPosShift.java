package Arrays.Two_Pointers;

public class EvenPosShift {
    static void main(String[] args) {
        int[] arr = {-1, 2, -8, 0, 65, 5, 54, -3, -6,4,8,10};
        int l = 0;
        int r = 0;
        while (r < arr.length) {
            if (arr[r] > 0 && arr[r] % 2 == 0) {
                int temp = arr[r];
                arr[r] = arr[l];
                arr[l] = temp;
                l++;
            }
            r++;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
