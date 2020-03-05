/*
Random order data retrieval
Works with entry interface to get key and values
 */
package Map;

import java.util.HashMap;

public class HashMap_ {
   
    public static void main(String[] args) {
        
        int a = 10;
        int b = 8;
        int c = 33;
        
        HashMap<String,Integer> hash = new HashMap<>();
        hash.put("a", 10);//key,value
        hash.put("b",8);
        hash.put("c",33);
        
        System.out.println(hash.get("c"));
        
        HashMap<String,String> example = new HashMap();
        example.put("Plamen", "123456");
        example.put("Andy", "qwerty");
        
        System.out.println(example);
        System.out.println(example.replace("Plamen", "00000"));
        System.out.println(example);
        
        System.out.println(example.values());
        System.out.println(example.keySet());
        
        
        
        
    }
     
    
}
