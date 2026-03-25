package Stack;

import java.util.ArrayList;

public class Stackmake {

    private ArrayList<Integer> stack = new ArrayList<>();

    void push(int data) {
        stack.add(data);
    }

    int pop() {
        int top = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return top;
        
    }

    int peak() {
        if(stack.isEmpty()) return -1;
        return stack.get(stack.size()-1);
    }

    int size() {
        return stack.size();
    }

    boolean isEmptyy() {
        if (stack.isEmpty())
            return true;
        return false;
    }

    void showfullStack(){
        System.err.println("\n\n");
        for(int i:stack){
            System.out.println(" | "+i + " | ");
        }
        System.out.println(" |____|  ");
    }

    public static void main(String[] args) {
        Stackmake stack = new Stackmake();
        stack.push(78);
        stack.push(58);
        stack.push(43);
        stack.push(67);
        stack.push(455);
        stack.push(833);

        int top = stack.peak();
        System.out.println("Top of stack is : " +top );
        stack.pop();
        stack.pop();
        stack.showfullStack();

    }

}
