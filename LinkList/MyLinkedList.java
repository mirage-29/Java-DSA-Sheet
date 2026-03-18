package LinkList;
public class MyLinkedList<T extends Comparable<T>> {

    // Node class (inner class)
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data; 
            this.next = null;
        }
    }

    private Node<T> head;
    private int size;

    // Constructor
    public MyLinkedList() {
        head = null;
        size = 0;
    }

    // ================= BASIC OPERATIONS =================

    // Add at beginning
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Add at end
    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        Node<T> curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
        size++;
    }

    // Add at index
    public void add(int index, T data) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();

        if (index == 0) {
            addFirst(data);
            return;
        }

        Node<T> newNode = new Node<>(data);
        Node<T> curr = head;

        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next = newNode;
        size++;
    }

    // ================= DELETE OPERATIONS =================

    public T removeFirst() {
        if (head == null)
            throw new RuntimeException("List is empty");

        T removed = head.data;
        head = head.next;
        size--;
        return removed;
    }

    public T removeLast() {
        if (head == null)
            throw new RuntimeException("List is empty");

        if (head.next == null) {
            T removed = head.data;
            head = null;
            size--;
            return removed;
        }

        Node<T> curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }

        T removed = curr.next.data;
        curr.next = null;
        size--;
        return removed;
    }

    public T remove(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        

        if (index == 0)
            return removeFirst();

        Node<T> curr = head;

        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }

        T removed = curr.next.data;
        curr.next = curr.next.next;
        size--;
        return removed;
    }

    // ================= SEARCH =================

    public int indexOf(T key) {
        Node<T> curr = head;
        int index = 0;

        while (curr != null) {
            if (curr.data.equals(key))
                return index;
            curr = curr.next;
            index++;
        }

        return -1;
    }

    public boolean contains(T key) {
        return indexOf(key) != -1;
    }

    // ================= UTILITY =================

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // Reverse linked list
    public void reverse() {
        Node<T> prev = null;
        Node<T> curr = head;

        while (curr != null) {
            Node<T> next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    // Print list
    public void print() {
        Node<T> curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }

        System.out.println("null");
    }

    // Mid Element 
    public T mid() {
        if (head == null)
            throw new RuntimeException("List is empty");

        Node<T> slow = head;
        Node<T> fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    // Merge two sorted Array

     public static  <T extends Comparable<T>> MyLinkedList<T> mergetwosortedArrayLink(MyLinkedList list1,MyLinkedList list2){
        Node<T> pointer = list1.head;
        Node<T> pointer1 = list2.head;
        MyLinkedList<T> mergelist = new MyLinkedList<>();


        while(pointer!=null&&pointer1!= null)
        {
            if(pointer.data.compareTo(pointer1.data)>=0)
            {
                mergelist.addLast(pointer1.data);
                pointer1=pointer1.next;
            }
            else{
                mergelist.addLast(pointer.data);
                pointer=pointer.next;
            }
          

        }
        if(pointer!=null){
            while(pointer!=null){
                mergelist.addLast(pointer.data);
                pointer = pointer.next;
            }
        }
        else{
            while(pointer1!=null){
                mergelist.addLast(pointer1.data);
                pointer1 = pointer1.next;
            }
        }
        return mergelist;
        }

        public static void swap(int i,int j) {
            
        }

    }



