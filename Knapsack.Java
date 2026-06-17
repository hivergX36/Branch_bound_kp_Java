public class Knapsack {

    float capacity;
    ArrayList<Item> items;
    ArrayList<Node> nodes;

    public Knapsack(float capacity, ArrayList<Item> items, ArrayList<Node> nodes) {
        this.capacity = capacity;
        this.items = items;
        this.nodes = nodes;
    }

    public float define_bound(Node node){
        float bound = node.profit;
        If (node.weight >= capacity){
            return 0
        }
        j = node.level + 1;
        while (j < items.size() && node.weight + items.get(j).weight <= capacity){
            node.weight += items.get(j).weight;
            bound += items.get(j).profit;
            j++;
        }
        if (j < items.size()){
            bound += (capacity - node.weight) * items.get(j).ratio;
        }
        return bound;

    }



    
}