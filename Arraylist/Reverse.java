package Arraylist;

import java.util.ArrayList;

public class Reverse {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int m = list.size()-1;
        int l =0;
       while(m>l){
           int temp = list.get(m);
           list.set(m,list.get(l));
           list.set(l,temp);
           m--;l++;
       }
       System.out.println(list);

    }

}
