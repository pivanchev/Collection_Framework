/*
TreeSet class implements the Set interface that uses a tree for storage
Objects of this class are unique and are stored in ascending order
Always gives values in sorted format
It inherits AbstractSet class and implements NavigableSet interface
Low compared to hashSet
Sorted version of HashSet
*/

package TreeSet;

import java.util.TreeSet;
import java.util.Iterator;


public class TreeSet_ {
    
      public static void main(String[] args) {
        
        TreeSet<String> set = new TreeSet<>();// data is unordered but its alphabetically sorted
          
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
        set.add("one");
        set.add("alpha");
        
        //data is unique,no redundancy
        //data is unordered in output due to hashing
        System.out.println("Set is: " + set);
        
        Iterator<String> itr = set.iterator();
        
        while(itr.hasNext()){
            String str = itr.next();
            System.out.println(str);
        }
        
        System.out.println("Size is: " + set.size());
        
        if(set.contains("one")){
            System.out.println("One is in the set");
        }
        
        set.remove("one");
        System.out.println("Size is: " + set.size());
    }
  
    
}
