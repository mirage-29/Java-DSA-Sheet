package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class binaryrepresentation {
    public static void main(String[] args) {
        
        int n = 4;
        Queue<String> queue = new LinkedList<>();
        String start = "1";
        if (n == 0) {
            System.err.println(0);
            return;
        }
        queue.add(start);
        for (int i = 0; i < n; i++) {
            String curr = queue.poll();
            System.out.println(curr);
            queue.add(curr + "0");
            queue.add(curr + "1");
        }

    }
}
