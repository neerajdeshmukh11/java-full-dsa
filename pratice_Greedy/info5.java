
import java.util.*;

// job sequencing
public class info5 {
    static class Job{
        int deadline, profit, id;
        public Job(int i, int d, int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String[] args) {
        int jobsInfo[][] = {{4,20},
                            {1,10},
                            {1,40},
                            {1,30}
                        };

        ArrayList<Job> jobs = new ArrayList<>();
        
        for(int i =0;i<jobsInfo.length;i++){
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        Collections.sort(jobs, (a,b) -> b.profit - a.profit); // descending order

        ArrayList<Integer> seq = new ArrayList<>();

        int maxProfit = 0;
        int endTime = 0;

        for(int i=0;i<jobs.size();i++){
            Job curr = jobs.get(i);
            if(curr.deadline > endTime){
                seq.add(curr.id+1);
                maxProfit+=curr.profit;
                endTime++;
            }
        }
        System.out.println(endTime);
        for(int i =0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
        System.out.println("The max Prrofit is: "+maxProfit);
    }
}
