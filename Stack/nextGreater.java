package Stack;
import java.util.*;

public class nextGreater {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,7,9};
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]+" ");
        }
        System.out.println("");
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            int j=i+1;
            for(;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    st.push(arr[j]);
                    break;
                }
            }
            if(j==arr.length) st.push(-1);

        }

        System.err.println(st);
       
        

    }
}
