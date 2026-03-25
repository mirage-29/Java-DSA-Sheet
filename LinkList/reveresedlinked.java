package LinkList;

import java.util.LinkedList;

public class reveresedlinked {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(89);
        list.add(23);
        list.add(211);
        list.add(11);
        list.add(9);
        list.add(69);
        System.err.println(list);
        int i =0;
        int j=list.size()-1;
        while(i<j){
            int temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
        System.err.println(list);
    }
}
