import java.util.*;

public class PQ_For_Objects {
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank; 
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("Neeraj", 3)); // O(logn)
        pq.add(new Student("ritesh", 8));
        pq.add(new Student("rohit", 1));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name +" -> "+pq.peek().rank); //O(1)
            pq.remove(); //O(logn)
        }
    }
}
