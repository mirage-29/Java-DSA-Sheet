package RunningSum;

public class RunningSum {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8,10,34};
        int sum =0;
        int[] prefixsum = new int[arr.length];
        for(int i =0 ;i<arr.length;i++)
        {
            sum += arr[i];
            prefixsum[i] = sum;
        }
        System.out.print("{");
        for (int i = 0; i < prefixsum.length; i++) {
            if(i!=prefixsum.length-1)
            System.out.print(prefixsum[i] + ",");
            else System.out.print(prefixsum[i]);
        }
        System.out.println("}");
    }
}
