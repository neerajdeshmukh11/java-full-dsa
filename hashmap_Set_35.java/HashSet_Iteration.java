import java.util.*;
public class HashSet_Iteration {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("delhi");
        cities.add("nagpur");
        cities.add("pune");
        cities.add("mumbai");

        Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("\n");

        for(String city : cities){
            System.out.println(city);
        }
    }
}
