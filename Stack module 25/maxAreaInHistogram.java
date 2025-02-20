
import java.util.Stack;

public class maxAreaInHistogram {

    public static int maxArea(int heights[]){
        int maxArea = 0;
        int nsr[] = new int[heights.length];
        int nsl[] = new int[heights.length];

        // next smaller right
        Stack<Integer> s = new Stack<>();
        for(int j=heights.length-1;j>=0;j--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[j]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[j] = heights.length;
            }else{
                nsr[j] = s.peek();
            }
            s.push(j);
        }


        // next smaller left
        for(int i=0;i<heights.length;i++){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = heights.length;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // current area = height * width
        // width = nsr[i] - nsl[i] - 1;
        // j-i-1;
        for(int i=0;i<heights.length;i++){
            int height = heights[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int heights[] = {2,1,5,6,2,3};
        System.out.println(maxArea(heights));
    }
}
