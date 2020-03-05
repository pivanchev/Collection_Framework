/*
Sequence of links which contain items
Each link contains a connection to another link
Fast data manipulation
Non-sync
Creates links
In singly LinkedList each element in this list will stores the data of the element and a pointer or reference to the next element in the list
In doubly LinkedList has two references : one to the next and one to the previous element
*/

package LinkedList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Iterator;



public class LinkedList_ {
    
    public static void main(String[] args) {
        
        LinkedList <Integer> ll = new LinkedList<>();
        ll.add(12);
        ll.add(1);
        ll.add(5);
        ll.add(7);
        ll.add(17);
        
        Iterator itr = ll.iterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.containsAll(ll));
        
        ll.sort(Comparator.reverseOrder());
        System.out.println("After reversed sorting:  " + ll);
        
        ll.sort(Comparator.naturalOrder());
        System.out.println("After natural order sorting: " + ll);
        
        LinkedList ll2 = new LinkedList();
        
        ll2 = (LinkedList)(ll.clone());
        
        System.out.println("Cloned list is: " + ll2);
        
        ll.removeFirst();
        
        System.out.println(ll);
        
        
        
        
        
        
        
        
        
    }
    
}
