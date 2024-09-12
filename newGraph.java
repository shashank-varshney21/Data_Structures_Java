import java.util.*;
public class newGraph {

    //making edge of the graph
    static class Edge
    {
        int src;
        int dest;
        int wt;

        //making the constructor of the edge

        public Edge(int s, int d, int w)
        {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    // making the createGraph method

    public static void createGraph(ArrayList<Edge> graph[])
    {
      for (int i =0;i<graph.length;i++)
      {
        graph[i] = new ArrayList<Edge>();
      }
      graph[0].add(new Edge(0,2,1));

      graph[1].add(new Edge(1,2,2));
      graph[1].add(new Edge(1,3,3));

      graph[2].add(new Edge(2,0,2));
      graph[2].add(new Edge(2,1,3));
      graph[2].add(new Edge(2,3,1));

      graph[3].add(new Edge(3,1,-8));
      graph[3].add(new Edge(3,2,5));
    }
    //making the main class
    
    public static void main (String[] args)
    {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        //printing 2's neighbours and weight

        for  (int i=0; i<graph[2].size();i++)
        {
            Edge e = graph[2].get(i);
            System.out.println(e.dest + " " + e.wt );
        }

    }
    
}
