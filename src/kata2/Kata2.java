
package kata2;

import java.util.HashMap;


public class Kata2 {

    public static void main(String[] args) {
        
      int data[] = {1, 3, 4, 6, 8, 9, 8, 9, 6, 15, 20, 30, 45, 5, 15};
      
      HashMap<Integer, Integer> hashMap = new HashMap <Integer, Integer>();
        
      /*
        for (int i = 0; i < data.length; i++) {
            
            
            if(hashMap.containsKey(data[i])){
                hashMap.put(data[i], hashMap.get(data[i])+1);
            } else{
                hashMap.put(data[i], 1);
                
            }   
        }
        */
        for (int key : data) {
            hashMap.put(key, hashMap.containsKey(key) ? hashMap.get(key)+1 : 1);
        }
      
      
        for (Integer key : hashMap.keySet()) {
            
            Integer value = hashMap.get(key);
            System.out.println(key + "==>" + value);
            
        }
        
        
        
      
            
        
        
    }
    
}
