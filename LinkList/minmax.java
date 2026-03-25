package LinkList;

import java.util.LinkedList;

public class minmax {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        LinkedList<Integer> list = new LinkedList<>();
        list.add(89);
        list.add(23);
        list.add(211);
        list.add(11);
        list.add(9);
        list.add(69);

        for(int i:list){
            if(i>max) max=i;
            if(i<min) min =i;
        }
        System.out.println("Min : "+min );

        System.out.println("Max : "+max );
    }
}
