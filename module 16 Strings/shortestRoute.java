public class shortestRoute {

    public static float  GetShortestPath(String str){
        int x=0, y=0;
        for(int i=0;i<str.length();i++){
            char dir = str.charAt(i);

            if(dir == 'S'){
                y--;
            }
            else if(dir == 'N'){
                y++;
            }
            else if(dir == 'E'){
                x++;
            }
            else if(dir == 'W'){
                x--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        String str = "SN";
        System.out.println(GetShortestPath(str));
        // time complexity O(n);
    }
}
