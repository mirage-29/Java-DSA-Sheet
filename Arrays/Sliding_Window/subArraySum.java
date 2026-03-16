package Arrays.Sliding_Window;

public class subArraySum {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8,10,34};
        int k =4;
        int sum =0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int max = sum;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i];
            sum-=arr[i-k];
            if(sum>max){
                max=sum;
            }
        }
        System.out.println("Maximum sum of Substring = " +max);

    }
}
