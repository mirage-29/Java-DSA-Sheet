package LinkList;

import java.util.LinkedList;

public class linkedlistmerge {
    public static void main(String[] args) {
                LinkedList<Integer> list = new LinkedList<>();
        list.add(89);
        list.add(23);
        list.add(211);
        list.add(11);
        list.add(9);
        list.add(69);
        System.err.println(list);

                LinkedList<Integer> listt = new LinkedList<>();
        listt.add(89);
        listt.add(23);
        listt.add(211);
        listt.add(11);
        listt.add(9);
        listt.add(69);
        System.err.println(list);
        list.addAll(listt);
        System.out.println(list);
    }
}
