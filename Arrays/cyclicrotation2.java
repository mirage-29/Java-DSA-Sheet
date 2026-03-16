package Arrays;
import java.util.Scanner;
public class cyclicrotation2 {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Enter nu of times to rotate : ");
        int k = new Scanner(System.in).nextInt();
        k = k%arr.length;
        int[] temp = new int[k];
        for (int i = arr.length-1,j=0; j <k; i++,j++)
        {
            temp[j] = arr[i];
        }
        for (int i = arr.length-k-1; i >=0; i--)
        {
            arr[i+k]=arr[i];
        }
        for(int j=0; j<k; j++){
            arr[j]=temp[j];
        }
        for(int j=0; j<arr.length; j++){
            System.out.print(arr[j]+" ");
        }

    }
}
