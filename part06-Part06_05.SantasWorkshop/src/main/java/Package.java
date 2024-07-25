import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Package {
    private ArrayList<Gift> gifts;

    public Package() {
        this.gifts = new ArrayList<Gift>();
    }
    public void addGift(Gift gift){
        this.gifts.add(gift);
    }
    public int totalWeight(){
        int weight = 0;
        for(Gift g: gifts){
            weight+=g.getWeight();
        }
        return weight;
    }
}
