import java.util.Scanner;

public class cyclicrotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Original Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.err.println();
        System.out.print("Times to rotate : ");
        int x = sc.nextInt();
        x=x%n;
        arr=rotatearray(arr,x);
        System.out.print("Rotate Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
     sc.close();
    }
    static int[] rotatearray(int[] arr,int n)
    {
        if(n==0)
        return arr;
        int temp=arr[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
            int temp2=arr[i];
            arr[i]=temp;
            temp=temp2;
        }
        n--;
       return rotatearray(arr,n);
    }

}
