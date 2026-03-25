package LinkList;

import java.util.LinkedList;

public class targetsort {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(89);
        list.add(23);
        list.add(211);
        list.add(11);
        list.add(9);
        list.add(69);

        System.out.println("Before: " + list);

        int target = 1;
        int pivot = list.get(target);

        // Step 1: move pivot to end
        int last = list.size() - 1;
        int temp = list.get(target);
        list.set(target, list.get(last));
        list.set(last, temp);

        // Step 2: partition
        int storeIndex = 0;
        for (int i = 0; i < last; i++) {
            if (list.get(i) < pivot) {
                int t = list.get(i);
                list.set(i, list.get(storeIndex));
                list.set(storeIndex, t);
                storeIndex++;
            }
        }

        // Step 3: place pivot correctly
        int t = list.get(storeIndex);
        list.set(storeIndex, list.get(last));
        list.set(last, t);

        System.out.println("After: " + list);
        System.out.println("Pivot final index: " + storeIndex);
    }
}