import java.util.ArrayList;
import java.util.List;

public class MyStack {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        // Push elements onto the stack
        myStack.push(5);
        myStack.push(10);
        myStack.push(15);
        myStack.push(20);
        myStack.push(25);
        myStack.push(30);
        // Check if the stack is empty
        System.out.println("Is the stack empty? " + myStack.isEmpty());
        // Get the size of the stack
        System.out.println("Size of the stack: " + myStack.size());
        // Pop elements from the stack
        System.out.println("Popped element: " + myStack.pop());
        System.out.println("Popped element: " + myStack.pop());
        System.out.println("Popped element: " + myStack.pop());
        // Check if the stack is empty again
        System.out.println("Is the stack empty? " + myStack.isEmpty());
        // Get the size of the stack after popping
        System.out.println("Size of the stack: " + myStack.size());
    }
    
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
