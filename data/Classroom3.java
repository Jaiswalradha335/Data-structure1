// //find itenerary from tickets
// import java.util.*;
// public class Classroom3 { 
//     public static String getStart(HashMap<String, String> tick) {
//         HashMap<String, String> revMap = new HashMap<>();
//         for(String key : tick.keySet()) {
//             revMap.put(tick.get(key), key);

//         }
//         for(String key : tick.keySet()) {
//             if(!revMap.containsKey(key)) {
//                 return key;
//             }
//         }
//         return null;

//     }
//     public static void main(String[] args) {
//         HashMap<String, String> tickets = new HashMap<>();
//         tickets.put(key:"chennai", value:"bengaluru");
//         tickets.put(key:"mumbai", value:"Delhi");
//         tickets.put(key:"Goa", value:"chennai");
//         tickets.put(key:"Delhi", value:"Goa");
//         String start = getStart(tickets);
         

//         while (tickets.containsKey(start)) {
//             System.out.println(start);
//             start = tickets.get(start);
//         }
//         System.out.println(start);

//     }
    
// }
// interview question from microsoft and ola company
import java.util.*;

public class Classroom3 { 
    public static String getStart(HashMap<String, String> tick) {
        HashMap<String, String> revMap = new HashMap<>();
        for(String key : tick.keySet()) {
            revMap.put(tick.get(key), key);
        }
        for(String key : tick.keySet()) {
            if(!revMap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        if (start != null) {
            while (tickets.containsKey(start)) {
                System.out.print(start+ "->");
                start = tickets.get(start);
            }
            System.out.println(start);
        } else {
            System.out.println("No valid itinerary found.");
        }
    }
}
