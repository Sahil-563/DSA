public class interfaces{
    public static void main(String args[]){
        King k = new King();
        k.moves();
    }
}
interface chessplayer{
    void moves();
}
class vjeer implements chessplayer{
    public void moves(){
        System.out.println("Moves diagonally in all four directions");
    }

}
class King implements chessplayer{
    public void moves(){
        System.out.println("Moves one step up,down,left,right(in all four directions)");
    }

}
class Hathi implements chessplayer{
    public void moves(){
        System.out.println("Moves horizontal and vertical in all four directions");
    }

}