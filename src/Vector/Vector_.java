/*
Vector implements a dinamic array and is not limited to a specific size
Vector is synchronized
Legacy class
Slow in performance
Default capacity 10
Auto-growth - 100%
Recommended for Thread safe enviroment
*/

package Vector;
import java.util.Vector;
import java.util.Iterator;
import java.util.ArrayList;


public class Vector_ {
    
    public static void main(String[] args) {
        
        Vector v = new Vector();
        
        v.add(1);
        v.add("Hello");
        v.add(false);
        v.add(true);
        v.add(12.44);
        
        ArrayList <String> list = new ArrayList();
        
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        
        Iterator itr =v.iterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
       
        System.out.println(v);
        
        v.add(4, "town");
        System.out.println(v);
        
        v.addAll(list);
        
        System.out.println(v);
        
        v.setSize(10);
        System.out.println(v);
        
        
    }
    
}
