package LinkList;



public class linklist1 {
   
    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();
        MyLinkedList<Integer> list2 = new MyLinkedList<>();


        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.add(1, 15);

        list.print(); 

        list.remove(2);
        list.print(); 

        System.out.println(list.contains(15));

        list.reverse();
        list.reverse();
        list.print();
        
        list2.addFirst(25);
        list2.addLast(35);
        list2.addLast(45);
      

        list2.print(); 

        MyLinkedList list3 =MyLinkedList.mergetwosortedArrayLink(list,list2);
        list3.print();
    }
   

}
