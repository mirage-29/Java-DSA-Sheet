package LinkList;

import java.util.LinkedList;

public class searchele {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(89);
        list.add(23);
        list.add(211);
        list.add(11);
        list.add(9);
        list.add(69);
        int target =69;
        if(list.contains(69))
            System.err.println("True");
        else System.err.println("False");
    }
}
