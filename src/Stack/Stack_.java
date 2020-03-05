/*
Stack is subclass of Vector that implements standard last-in,first-out stack
All the methods of Vector but has own methods too:
--push()- To insert into stack at top position
--pop() - Delete topmost element
--peek() - Return topmost element
--search() - Search elements in stack
--empty() - To check if the stack is empty or not

 */
package Stack;
import java.util.Stack;

public class Stack_ {
    
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        
        System.out.println("The stack size is: " + stack.size());
        System.out.println("The top element of the stack is: " + stack.peek());
        
        while(!stack.isEmpty()){
            System.out.println("Popped Item: " + stack.pop());
            
        }
        
    }
    
}
