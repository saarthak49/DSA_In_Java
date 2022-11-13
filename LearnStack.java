
import java.util.*;


public class LearnStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(4);
        System.out.println(stack);
        stack.pop();
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.contains(5));
        System.out.println(stack);
        System.out.println(stack.peek());
        while(!stack.empty())
        {
            stack.pop();
        }
        System.out.println(stack.peek());
    }
}
