import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueMain {

	public static void main(String[] args) {
		System.out.println();
		
		Queue<String> pq = new PriorityQueue<>(); 
		  
        pq.add("Data Structures"); 
        pq.add("For"); 
        pq.add("Fun"); 
        pq.add("Apps");
  
        System.out.println(pq);
        
        System.out.println("Initial Queue " + pq); 
        
        pq.remove("Apps"); 
  
        System.out.println("After Remove " + pq); 
  
        System.out.println("Poll Method " + pq.poll()); 
  
        System.out.println("Final Queue " + pq); 
        
        Iterator<String> iterator = pq.iterator(); 
        
        while (iterator.hasNext()) { 
            System.out.print(iterator.next() + " "); 
        } 

        
        System.out.println();
     // Creating empty priority queue 
        Queue<Integer> pQueue 
            = new PriorityQueue<Integer>(); 
  
        // Adding items to the pQueue 
        // using add() 
        pQueue.add(10); 
        pQueue.add(20); 
        pQueue.add(15); 
  
        // Printing the top element of 
        // the PriorityQueue 
        System.out.println(pQueue.peek()); 
  
        // Printing the top element and removing it 
        // from the PriorityQueue container 
        System.out.println(pQueue.poll()); 
  
        // Printing the top element again 
        System.out.println(pQueue.peek()); 
	}

}
