package Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverse3elments {
    public static void main(String[] args) {
        Integer[] a = {1,3,5,7,8,10};
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(a));
        Stack<Integer> st = new Stack<>();
        int k=3;
        for(int i=0;i<k;i++){
            st.push(queue.poll());
        }
       
        while(!st.isEmpty()){
            queue.add(st.pop());
        }
        while(k!=0){
            queue.add(queue.poll());
            k--;
        }
        System.out.println(queue);
        

        

        
    }
}
