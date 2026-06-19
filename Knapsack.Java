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


    public void solve_knapsack(){
        """
                Knapsack problem using branch and bound method with Bfs. 
                Inputs Nodes: (weight, profit, bound, level)
        """
        Array List<Node> queue = new ArrayList<Node>();
        int number_items = items.size();
        Node u = new Node(0,0,0,-1,5),;
        float max_profit = 0; 
        ArrayList<Integer> best_solution = new ArrayList<Integer>();
        Node v; 


        queue.add(u);

        While(queue.empty() == false){
           v = queue.remove(0);

           if (v.level == items.size() - 1){
                continue;
           }
 """
         Node(float weight, float profit, float bound, int level)
         """;
           u = new Node(0,0,0,0,5)
           u.Level = v.level + 1 
           u.weight = v.weight + items.get(u.level).weight;
           u.profit = v.profit + items.get(u.level).profit;
           u.bound = this.define_bound(u);
           u.solution = v.solution;
           u.solution[u.level] = 1


           if (u.weight <= capacity && u.profit > max_profit){
                max_profit = u.profit;
                best_solution = u.solution;
           }

           if (u.bound > max_profit){
                queue.add(u);
           }

           v.level = v.level + 1;
           v.weight = v.weight;
           v.profit = v.profit;
           v.bound = this.define_bound(v);
           v.solution = v.solution;          

           if (v.bound > max_profit){
                queue.add(v);
           }
        }

        System.out.println("the best solution is: ", best_solution)
        System.out.println("The max profit is: ", max_profit)




    }




    
}