package stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	
	 Queue<Integer> queue;
	    
	    public StackUsingQueue()
	    {
	        this.queue=new LinkedList<Integer>();
	    }
	    
	    // Push element x onto stack.
	    public void push(int x) 
	    {
	       queue.add(x);
	       for(int i=0;i<queue.size()-1;i++)
	       {
	    	   int val = queue.poll();
	           queue.add(val);
	       }
	    }

	    // Removes the element on top of the stack.
	    public int pop() 
	    {
	       return queue.poll();
	    }

	    // Get the top element.
	    public int top() 
	    {
	        return queue.peek();
	    }

	    // Return whether the stack is empty.
	    public boolean empty() 
	    {
	        return queue.isEmpty();
	    }
	    // driver code
	    public static void main(String[] args)
	    {
	    	StackUsingQueue myStack = new StackUsingQueue();
	    	myStack.push(1);
	    	myStack.push(2);
	    	myStack.push(3);
	    	myStack.push(4);
	    	myStack.push(5);
	    	System.out.println(myStack.top());
	    	System.out.println(myStack.pop());
	    	System.out.println(myStack.empty());  	
	    }

}
