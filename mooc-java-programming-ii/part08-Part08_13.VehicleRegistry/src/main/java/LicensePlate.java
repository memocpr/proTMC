
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    public boolean equals(Object comparedObject){

        if (this==comparedObject){
            return  true;
        }

        if (!(comparedObject instanceof LicensePlate)){
            return false;
        }

        LicensePlate comparedDate=(LicensePlate) comparedObject;

        if (this.liNumber==comparedDate.liNumber && this.country==comparedDate.country){
            return true;
        }

        return false;
    }

    public int hashCode() {

        int num=0;

        if (this.country == null) {
            String[] arr=liNumber.split("-");
            num=Integer.valueOf(arr[1]);
            return num;
        }

        return  num + this.country.hashCode();
    }

}
