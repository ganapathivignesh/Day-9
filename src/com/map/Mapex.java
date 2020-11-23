package com.map;
import java.util.HashMap;
import java.util.Map;
public class Mapex {

	public static void main(String[] args) {
		
         HashMap hm=new HashMap();
        
         hm.put("a1234","Steve Jobs");
         
         hm.put("a1235","Scott McNealy");
         hm.put("a1236","Jeff Bezos");
         hm.put("a1237","Larry Ellison");
         hm.put("a1238","Bill Gates");
         
         
         hm.put("A1234","Steve Jobs");
         hm.put("A1235","Scott McNealy");
         hm.put("A1236","Jeff Bezos");
         hm.put("A1237","Larry Ellison");
         hm.put("A1238","Bill Gates");
         
         System.out.println(hm);
         System.out.println(hm.containsKey("a1235"));
         System.out.println(hm.containsKey("a1236"));
         System.out.println(hm.containsKey("a1237"));
         System.out.println(hm.containsKey("a1238"));
         System.out.println(hm.containsKey("a1239"));
         System.out.println(hm.get("a1235"));
         System.out.println(hm.get("a1236"));
         
         System.out.println(hm.get("A1237"));
         System.out.println(hm.get("a1238"));
         System.out.println(hm.keySet());
         System.out.println(hm.values());
         System.out.println(hm.get("a1233"));
         System.out.println(hm.get("a1237"));
         System.out.println(hm.get("a1230"));
       }
}
