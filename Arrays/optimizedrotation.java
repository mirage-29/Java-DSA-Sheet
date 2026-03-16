package Arrays;

public class optimizedrotation {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 3;
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);
        System.out.println("Original Array : ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");

    }

    static void reverse(int[] arr, int i, int j) {
        int temp;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
}
