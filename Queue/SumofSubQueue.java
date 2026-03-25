package Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SumofSubQueue {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        int k=3;
        int min =Integer.MAX_VALUE;
       
        Integer[] a ={4,3,5,7,1,9,2};
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(a));
        Queue<Integer> queue1 = new LinkedList<>();
        for(int i=0;i<k;i++){
            queue1.offer(queue.peek());
            sum+=queue.poll();
        }
        max=sum;
        min=sum;
        while(!queue.isEmpty()){
            sum-=queue1.poll();
            queue1.offer(queue.peek());
            sum+=queue.poll();
            if(sum>max) max=sum;
            if(sum<min) min=sum;
        }

        System.out.println(max);
        System.out.println(min);



    }
    
}
