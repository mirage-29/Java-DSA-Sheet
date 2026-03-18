package Stack;
import java.util.Stack;

public class palindromestack {
    public static void main(String[] args) {
       Stack<Integer> stak = new Stack<>(); 
       stak.push(1);
       stak.push(2);
       stak.push(3);
       stak.push(3);
       stak.push(2);
       stak.push(1);
       boolean ans = stak.equals(checkpalindrome(stak));
       System.out.println(ans);
    }
    static Stack<Integer>  checkpalindrome(Stack<Integer> stack){
        Stack<Integer> temp = new Stack<>();
        for(int i: stack){
            temp.push(i);
        }
        return temp;
    }
}
