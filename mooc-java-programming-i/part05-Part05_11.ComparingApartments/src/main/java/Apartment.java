
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
        if (squares>compared.squares){
            return true;
        }else {
            return false;
        }
    }

    public int priceDifference(Apartment compared){
        int x=squares*princePerSquare-compared.squares*compared.princePerSquare;
        if(x<0){
            x*=(-1);
        }
      return x;
    }

    public boolean moreExpensiveThan(Apartment compared){
        if (squares*princePerSquare>compared.squares*compared.princePerSquare){
            return true;
        }else {
            return false;
        }
    }

}
