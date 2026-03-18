package Stack;
import java.util.Stack;
public class removegreaterthantarget {
    public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    
    int k =10;
    st.push(13);
    st.push(1);
    st.push(10);
    st.push(90);
    st.push(3); 
    Stack<Integer> stackk= removegreater(st, k);
    while(!stackk.isEmpty()){
     st.push(stackk.pop());
    }
    System.out.println(st);
    
  
  }
  static Stack<Integer> removegreater(Stack<Integer> st,int k){
    Stack<Integer> sta = new Stack<>();
   while(!st.isEmpty()){
    if(st.peek()>k){
     st.pop();
    continue;
     } 
     sta.push(st.pop());
    }
    return sta;
  }

}
