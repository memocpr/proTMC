
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition){


        Money newMoney=new Money(euros+addition.euros, cents+addition.cents);

        return newMoney;
    }

    public boolean lessThan(Money compared){
        if ((euros<compared.euros) || (euros==compared.euros && cents<compared.cents)){
            return true;
        }else{
            return false;
        }
    }

    public Money minus(Money decreaser){
        int newEuro=0;
        int newCent=0;
        if (euros-decreaser.euros>=0){
            newEuro=euros-decreaser.euros;
            if(cents-decreaser.cents>=0){
                newCent=cents-decreaser.cents;
            } else {
                newEuro--;
                newCent=(100+cents-decreaser.cents);
            }
        }



        Money newMoney=new Money(newEuro, newCent);

        return newMoney;
    }

}
