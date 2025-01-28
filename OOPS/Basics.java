public class Basics {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // p1 object , Pen() is a constructor
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "yellow";
        System.out.println(p1.color);

        // using getter and setter

        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("yellow");
        System.out.println(p1.getColor());
    }

}
// class pen
class Pen {
    String color;
    int tip;

    String getColor(){
       return this.color; // this keyword refers to the current object
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String color){
        this.color = color;
    }
    void setTip(int tip){
        this.tip = tip;
    }
    Pen(){ // constructor ,, if not then default
        System.out.println("Constructor called");
    }
} 
