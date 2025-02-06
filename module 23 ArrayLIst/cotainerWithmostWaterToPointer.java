import java.util.ArrayList;

public class cotainerWithmostWaterToPointer {

    public static int MostWater(ArrayList<Integer> Height){
        int maxWater = 0;
        int lp = 0;
        int rp = Height.size()-1;

        while(lp<rp){
            // calc water area
            int ht = Math.min(Height.get(lp),Height.get(rp));
            int width = rp-lp;
            int water = ht*width;
            maxWater = Math.max(maxWater, water);
            // update ptr
            if(Height.get(lp)<Height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
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
        System.out.println(MostWater(Height));
    }
}
