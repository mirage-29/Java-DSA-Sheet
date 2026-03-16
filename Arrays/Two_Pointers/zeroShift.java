package Arrays.Two_Pointers;

public class zeroShift {
    static void main(String[] args) {
        int[] arr = {0,0,0,1,0,2,7,0,0,4,5,1,0,0,23,0,32,4,423,23,0};
        int l=0;
        int r=0;
        while(r<arr.length){
            if(arr[r]!=0) {
                int temp = arr[r];
                arr[r] = arr[l];
                arr[l] = temp;
                l++;
            }
            r++;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}

