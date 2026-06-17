public class Node {
    float weight;
    float profit;
    float bound;
    int level;
    int solution_size; 
    int solution[];

    public Node(float weight, float profit, float bound, int level) {
        this.weight = weight;
        this.profit = profit;
        this.bound = bound;
        this.level = level;
        this.solution_size = 0;
        this.solution = new int[items.size()]; // Assuming 'items' is accessible
    }

    }
