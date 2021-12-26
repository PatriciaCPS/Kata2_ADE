
package kata2;


import java.util.Map;


public class Kata2 {

    public static void main(String[] args) {
        
      int data[] = {1, 3, 4, 6, 8, 9, 8, 9, 6, 15, 20, 30, 45, 5, 15};
      
     /* HashMap<Integer, Integer> hashMap = new HashMap <>();
       */ 
      /*
        for (int i = 0; i < data.length; i++) {
            
            
            if(hashMap.containsKey(data[i])){
                hashMap.put(data[i], hashMap.get(data[i])+1);
            } else{
                hashMap.put(data[i], 1);
                
            }   
        }
        */
        
      Histogram histo =new Histogram(data);
      
     Map<Integer,Integer> histogr = histo.getHistogram();
      
        histogr.keySet().forEach((key) -> {
            Integer value = histogr.get(key);
            System.out.println(key + "==>" + value);
        });

        
    }
    
}
