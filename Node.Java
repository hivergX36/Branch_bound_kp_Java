public class Node {
    float weight;
    float profit;
    float bound;
    int level;
    int solution_size; 
    int solution[];

    public Node(float weight, float profit, float bound, int level, int number_items) {
        this.weight = weight;
        this.profit = profit;
        this.bound = bound;
        this.level = level;
        this.solution_size = number_items;
        this.solution = new int[items.size()]; // Assuming 'items' is accessible
    }

    }
