package LinkList;

import java.util.LinkedList;

public class evenoddindex {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(89);
        list.add(23);
        list.add(211);
        list.add(11);
        list.add(9);
        list.add(69);
        System.err.println(list);
        int i = 0;
        if (list.size() % 2 == 0)
            i = list.size() - 1;
        else
            i = list.size() - 2;
        for(;i>0;i--){
            int temp = list.get(i);
            list.set(i,list.get(i-1));
            list.set(i-1,temp);
        }
        System.err.println(list);

    }

}
