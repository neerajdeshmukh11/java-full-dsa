
public class staticKeyword {
    public static void main(String[] args) {
        Student s = new Student();
        s.SchoolName = "cps";
        Student s1 = new Student(); 
        Student s2 = new Student(); 
        s2.SchoolName = "cpscccc";
        System.out.println(s2.SchoolName);
        System.out.println(s1.SchoolName);
    }
}
class Student{
    int rollno;
    String name;
    static String SchoolName;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
