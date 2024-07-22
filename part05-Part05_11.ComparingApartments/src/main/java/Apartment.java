
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        if (this.squares > compared.squares){
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        if ((squares * princePerSquare) - (compared.squares * compared.princePerSquare) > 0){
            return (squares * princePerSquare) - (compared.squares * compared.princePerSquare);
        }
        return ((squares * princePerSquare) - (compared.squares * compared.princePerSquare)) * -1;
    }
    
     public boolean moreExpensiveThan(Apartment compared){
         if ((squares * princePerSquare) - (compared.squares * compared.princePerSquare) > 0) {
             return true;
         }
         return false;
     }
}
