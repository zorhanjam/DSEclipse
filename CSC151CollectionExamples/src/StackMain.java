// Java code for stack implementation 


import java.util.*; 

class StackMain 
{ 
	// Pushing element on the top of the stack 
	static void stack_push(Stack<Integer> stack) 
	{ 
		for(int i = 0; i < 5; i++) 
		{ 
			stack.push(i); 
		} 
	} 
	
	// Popping element from the top of the stack 
	static void stack_pop(Stack<Integer> stack) 
	{ 
		System.out.println("Pop Operation:"); 

		for(int i = 0; i < 5; i++) 
		{ 
			Integer y = (Integer) stack.pop(); 
			System.out.println(y); 
		} 
	} 

	// Displaying element on the top of the stack 
	static void stack_peek(Stack<Integer> stack) 
	{ 
		Integer element = (Integer) stack.peek(); 
		System.out.println("Element on stack top: " + element); 
	} 
	
	// Searching element in the stack 
	static void stack_search(Stack<Integer> stack, int element) 
	{ 
		Integer pos = (Integer) stack.search(element); 

		if(pos == -1) 
			System.out.println("Element not found"); 
		else
			System.out.println("Element is found at position: " + pos); 
	} 


	public static void main (String[] args) 
	{ 
		Stack<Integer> stack = new Stack<Integer>(); 

		stack_push(stack); 
		stack_pop(stack); 
		stack_push(stack); 
		stack_peek(stack); 
		stack_search(stack, 2); 
		stack_search(stack, 6); 
		
		
		System.out.println();
		// Default initialization of Stack 
        Stack stack1 = new Stack(); 
  
        // Initialization of Stack 
        // using Generics 
        Stack<String> stack2 = new Stack<String>(); 
  
        // pushing the elements 
        stack1.push(4); 
        stack1.push("Hello"); 
        stack1.push("World"); 
  
        stack2.push("Fun"); 
        stack2.push("Data"); 
        stack2.push("Structures"); 
  
          // Printing the Stack Elements 
        System.out.println(stack1); 
        System.out.println(stack2); 
        
        
     // Displaying the Stack 
        System.out.println("Initial Stack: " + stack2); 
  
        // Fetching the element at the head of the Stack 
        System.out.println("The element at the top of the stack is: " + stack2.peek()); 
  
        // Displaying the Stack after the Operation 
        System.out.println("Final Stack: " + stack2);
        
     // Creating an empty Stack 
        Stack<Integer> stack3 = new Stack<Integer>(); 
  
        // Use add() method to add elements 
        stack3.push(10); 
        stack3.push(15); 
        stack3.push(30); 
        stack3.push(20); 
        stack3.push(5); 
  
        // Displaying the Stack 
        System.out.println("Initial Stack: " + stack3); 
  
        // Removing elements using pop() method 
        System.out.println("Popped element: " + stack3.pop()); 
        System.out.println("Popped element: " + stack3.pop()); 
  
        // Displaying the Stack after pop operation 
        System.out.println("Stack after pop operation "+ stack3); 
        System.out.println();
        System.out.println();
        main2();
        
	} 
	/**
	 * Please note that the Stack class in Java is 
	 * a legacy class and inherits from Vector in Java. 
	 * It is a thread-safe class and hence involves 
	 * overhead when we do not need thread safety. 
	 * It is recommended to use ArrayDeque for stack implementation as 
	 * it is more efficient in a single-threaded environment.
	 */
	public static void main2() {
		Deque<Character> stack = new ArrayDeque<Character>(); 
        stack.push('A'); 
        stack.push('B'); 
        System.out.println(stack.peek()); 
        System.out.println(stack.pop()); 
	}
} 
