import java.util.ArrayList;
import java.util.Scanner;

public class Dijkstras {
    public static void main(String[] args) {
        ArrayList<ArrayList<GraphEdge>> graph = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nodes size :");
        int n = sc.nextInt();
        for (int i=0;i<n;i++) graph.add(new ArrayList<>());

        System.out.println("Enter the edges number :");
        int edge = sc.nextInt();
        System.out.println("Enter the start node, end node and weight");
        for(int i=0;i<edge;i++) {
            int snode = sc.nextInt();
            int enode = sc.nextInt();
            int weight = sc.nextInt();
            graph.get(snode).add(new GraphEdge(enode,weight));
        }

    }
}
