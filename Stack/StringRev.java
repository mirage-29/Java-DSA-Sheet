package Stack;

import java.util.ArrayList;

public class StringRev {
    static class Stack{
        ArrayList<Character> stack = new ArrayList<>();

        void push(char data) {
        stack.add(data);
    }

    char pop() {
        char top = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return top;
        
    }

    char peak() {
        if(stack.isEmpty()) return '~';
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
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        String str = "abcdefg";
        String revstr ="";
        for(int i =0;i<str.length();i++){
         stack.push(str.charAt(i));
        }
        while(!stack.isEmptyy()){
         revstr+=stack.pop();
        }
        System.out.println("reverse of string is : "+ revstr);
    }
}
