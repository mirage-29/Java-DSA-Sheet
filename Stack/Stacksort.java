import java.util.Stack;

public class Stacksort {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(13);
        st.push(1);
        st.push(10);
        st.push(90);
        st.push(3);
        System.out.println(st);
        sortStack(st);

        System.out.println(st);
    }

    static void sortStack(Stack<Integer> st) {
        Stack<Integer> temp = new Stack<>();

        while (!st.isEmpty()) {
            int curr = st.pop();

            while (!temp.isEmpty() && temp.peek() < curr) {
                st.push(temp.pop());
            }

            temp.push(curr);
        }

        while(!temp.isEmpty())
        {
            st.push(temp.pop());
        }
        
    }
}