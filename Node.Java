public class Node {
    float weight;
    float profit;
    float bound;
    int level;

    public Node(float weight, float profit, float bound, int level) {
        this.weight = weight;
        this.profit = profit;
        this.bound = bound;
        this.level = level;
    }

}