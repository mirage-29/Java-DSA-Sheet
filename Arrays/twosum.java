package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target;
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[]  arr = new int[n];
        System.out.println("Enter " +n+" numbers:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        System.out.println("Enter the target number:");
        target = sc.nextInt();
       int i=0;
       int j =n-1;
       while(i<j){
           if(arr[i]+arr[j]==target) {
               System.out.println("Pair Present");
               break;
           }
           else if(arr[i]+arr[j]>target)
               j--;
           else i++;
       }
       if(i==j){
           System.out.println("Pair Not present");
       }


    }
}
