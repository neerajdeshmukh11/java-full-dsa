
import java.util.ArrayList;

public class ContainerWithMostWaterBrute {

    public static void Mostwater(ArrayList<Integer> Height){
        int maxWater = 0;
        for(int i=0;i<Height.size();i++){
            for(int j=i+1;j<Height.size();j++){
                int height = Math.min(Height.get(i), Height.get(j));
                int width = j-i;
                int water = height*width;
                maxWater = Math.max(maxWater, water);
            }
        }
        System.out.println(maxWater);
    }
    public static void main(String[] args) {
        ArrayList <Integer> Height = new ArrayList<>();
        Height.add(1);
        Height.add(8);
        Height.add(6);
        Height.add(2);
        Height.add(5);
        Height.add(4);
        Height.add(8);
        Height.add(3);
        Height.add(7);
        Mostwater(Height);
    }
}
