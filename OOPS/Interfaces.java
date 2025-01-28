public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}
interface ChessPlayer{
    void moves();

}
 // derived class of interface
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, right, left, diagonal");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, right, left");
    }
}

// multiple inheritance

interface Herbivore{
    // properties and methods
}
interface Carnivore{
    // properties and methods
}
class Bear implements Herbivore, Carnivore{
    // properties and methods
}
