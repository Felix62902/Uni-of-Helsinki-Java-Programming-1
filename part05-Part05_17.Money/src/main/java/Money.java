
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
        Money newMoney = new Money(this.euros+addition.euros,this.cents+ addition.cents);
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        int tcents = this.cents + this.euros*100;
        int ccents = compared.cents + compared.euros*100;
        if(tcents<ccents){
            return true;
        }
        return false;
    }
    
    public Money minus(Money decreaser) {
        int tcents = this.cents + this.euros*100;
        int dcents = decreaser.cents + decreaser.euros*100;
        int neuro = 0;
        int ncent = 0;
        if (tcents-dcents >=0){
            neuro = (tcents-dcents)/100;
            ncent = (tcents-dcents)%100;
        }
        Money newM = new Money(neuro,ncent);
        return newM;
        
        
       
    }

}
