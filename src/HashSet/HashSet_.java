/*
Set refers to a collection that cannot contain duplicate elements
Unique values only
Mainly used to model the mathematical set abstraction
3 structures - Hashset,LinkedHashset,TreeSet

---HashSet class creates a collection that use hash table for storage
---Hashset contains only unique elements and inherits the AbstractSet class and implements Set interface
---It uses a mechanisim hashing to store the elements

*/

package HashSet;
import java.util.HashSet;
import java.util.Iterator;


public class HashSet_ {
    
    public static void main(String[] args) {
        
        HashSet<String> set = new HashSet<>();
        //data is not added as indexing approach
        //we got hashcodes for elements which are being added
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
        set.add("one");
        
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
