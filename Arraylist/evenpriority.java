package Arraylist;

import java.util.ArrayList;

public class evenpriority {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(4);
        sortArrayByParity(list);
        System.out.println(list);
    }
    public static void sortArrayByParity(ArrayList<Integer> list) {
        int l=0;
        int r=0;
        while(r<list.size()){
            if(list.get(r)%2==0)
            {
                int temp=list.get(r);
                list.set(r,list.get(l));
                list.set(l,temp);
                l++;
            }
            r++;
        }

    }
}

