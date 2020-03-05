/*
First in,first out approach
First element is removed first and the last element is removed at the end
*/

package Queue;
import java.util.PriorityQueue;



public class Queue_ {
    
    public static void main(String[] args) {
        
        PriorityQueue <Integer> queue = new PriorityQueue<>();
        
        for (int i = 10; i > 0; i--) {
            queue.add(i);
        }   
            //Queue : (Front) 10 9 8 7 6 5 4 3 2 1 0 (END)
            //PriorityQueue sorts the data for us
            //Queue: (Front) 1 2 3 4 5 6 7 8 9 10 (END) --- Sorted Queue
            
            //Peeking--> Obtaining the head of Queue
            //Polling--> Remove the head of Queue
            
            
            System.out.println("Queue size is: " + queue.size());
            System.out.println("Head of the queue is: " + queue.peek());//head of Queue: 1
            queue.poll();//remove the head
            System.out.println("Queue size after the poll: " + queue.size());
            System.out.println("Head of the queue is: "  + queue.peek());//new head 2
        }
    }
    

