/*
Implementation of List Interface 
Dinamically add or remove data
The size is increased dinamically
10 elements by default
Auto-growth by 50%
Allows null values
Allows duplicates
Slow manipulation(delete,insert)
non-syncronized
Not recommend when have to do many manipulations
*/

package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;


public class ArrayList_ {

    
    public static void main(String[] args) {
        
        ArrayList <String> list = new ArrayList();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        
        
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());    
        }
        
        
         System.out.println(list.size());
         list.remove(3);
         System.out.println(list);
         list.add(3, null);
         System.out.println(list);
         list.get(2);
         System.out.println(list.isEmpty());
         
        
        
    }
    
}
