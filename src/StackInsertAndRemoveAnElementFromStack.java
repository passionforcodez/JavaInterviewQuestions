
import java.util.Stack;
public class StackInsertAndRemoveAnElementFromStack {
    public static void main (String args[]) {
        Stack stack = new Stack();
        stack.push("Apple");
        stack.push("Mango");
        stack.push("Guava");
        stack.push("Pear");
        stack.push("Orange");
        System.out.println("The stack elements are: " + stack);
        System.out.println("The element that was popped is: " + stack.pop());  //pop the element in Stack
        System.out.println("The stack elements are: " + stack);
    }
}

