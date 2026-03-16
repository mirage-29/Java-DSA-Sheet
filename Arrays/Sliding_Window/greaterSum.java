package Sliding_Window;

public class greaterSum {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8,10,34};
        int k =4;
        int x =15;
        int count = 0;
        int sum = 0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(sum>x){
            count++;
        }
        for(int i=k;i<arr.length;i++){
            sum+=arr[i];
            sum-=arr[i-k];
            if(sum>x){
                count++;
            }
        }
        System.out.println("count of subarray having sum greater than " +k +" is " +count);

    }
}
