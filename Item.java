public class Item {
    float weight;
    float profit;
    float ratio;

    public Item(float weight, float profit) {
        this.weight = weight;
        this.profit = profit;
        this.ratio = profit / weight;
    }   
    
}
