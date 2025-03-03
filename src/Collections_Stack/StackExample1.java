package Collections_Stack;

import java.util.Stack;

public class StackExample1 {
	public static void main(String[] args) {
        
		// Creating a Stack
        Stack<Integer> stack = new Stack<>();

        // 1. Pushing elements onto the stack
        stack.push(10);
        stack.push(60);
        stack.push(50);
        stack.push(40);
        System.out.println("Stack after push operations: " + stack);

        // 2. Peeking at the top element
        System.out.println("Top element (peek): " + stack.peek());

        // 3. Popping an element (removes top)
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after pop: " + stack);

        // 4. Searching for an element
        int position = stack.search(60);
        if (position != -1) {
            System.out.println("Position of 20 in stack (from top): " + position);
        } else {
            System.out.println("Element not found");
        }

        // 5. Checking if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // 6. Getting the size of the stack
        System.out.println("Stack size: " + stack.size());

        // 7. Iterating through the stack
        System.out.println("Stack elements:");
        for (int num : stack) {
            System.out.println(num);
        }
    }
}
