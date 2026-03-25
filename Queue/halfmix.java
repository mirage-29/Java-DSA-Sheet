package Queue;

import java.util.Arrays;
import java.util.LinkedList;
import  java.util.Queue;


public class halfmix {
    public static void main(String[] args) {
        Integer[] a={1,2,3,4,5,6};
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(a));
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> ans = new LinkedList<>();
        int size = queue.size();
        for(int i=0;i<size/2;i++){
            queue1.add(queue.poll());
        }
        System.out.println(queue);
        System.out.println(queue1);
        while(!queue.isEmpty()){
            ans.add(queue1.poll());
            ans.add(queue.poll());
        }

        System.out.println(ans);

    }
}
