
import java.util.HashMap;

public class MapQ3_Itinerary_FRom_Tickets {

    public static String getStart(HashMap<String, String> map){
        HashMap<String, String> RevMap = new HashMap<>();

        for(String key : map.keySet()){
            RevMap.put(map.get(key), key);
        }
        for(String key : map.keySet()){
            if(!RevMap.containsKey(key)){
                return key; // starting point
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("Chennai", "Benagluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");

        String start = getStart(map);
        System.out.print(start);
        for(String key : map.keySet()){
            System.out.print(" -> " + map.get(start));
            start = map.get(start);
        }
        System.out.println();
    }   
}
