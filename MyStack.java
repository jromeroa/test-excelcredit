import java.util.ArrayList;
import java.util.List;

public class MyStack {

    private List<Integer> stack;

    public MyStack() {
        stack = new ArrayList<>();
    }
    // Add an element to the top of the stack.
    public void push(int element) {
        stack.add(element);
    }
    // Remove and return the element at the top of the stack.
    public int pop() {
        if (!isEmpty()) {
            int topElement = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            return topElement;
        } else {
            throw new RuntimeException("Stack is empty. Cannot pop from an empty stack.");
        }
    }
    // Check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    // Get the number of elements in the stack
    public int size() {
        return stack.size();
    }
    
}
