//Code for the graph with no disconnected components

import java.util.*;
public class bfs
{
        static class Edge
{
    int src;
    int dest;

    public Edge(int s,int d)
    {
        this.src = s;
        this.dest = d;
    }

}

public static void createGraph(ArrayList<Edge> graph[])
{
    for(int i=0;i<graph.length;i++)
    {
        graph[i] = new ArrayList<>();
    }
    graph[0].add(new Edge(0,2));

    graph[1].add(new Edge(1,2));
    graph[1].add(new Edge(1,3));

    graph[2].add(new Edge(2,0));
    graph[2].add(new Edge(2,1));
    graph[2].add(new Edge(2,3));

    graph[3].add(new Edge(3,1));
    graph[3].add(new Edge(3,2));
}

//Traversing the grapg using BFS

    public static void bfs_traverse(ArrayList<Edge> graph[],int V)
    {
        Queue<Integer> q = new LinkedList<>(); 
        boolean vis[] = new boolean[V];
        q.add(0);                 //Inserting the starting node in the queue
        while (!q.isEmpty())
        {
           int curr = q.remove();
           if (vis[curr] == false)
           {
            System.out.println(curr + " ");
            vis[curr] = true;
            for (int i=0;i<graph[curr].size();i++)
            {
               Edge e = graph[curr].get(i);
               q.add(e.dest);
            }
           }

        }

    }

    // DFS Traversal

    public static void dfs_traversal(ArrayList<Edge> graph[],int current, boolean visited[])
    {
               System.out.println(current + " ");
               visited[current] = true;
               for (int i=0;i<graph[current].size();i++)
               { 
                Edge e = graph[current].get(i);
                if (visited[e.dest] == false)
                  {
                    dfs_traversal(graph,e.dest,visited);
                  }
               }
    }


    public static void main(String[] args)
    {   
       int V = 4; 
       ArrayList<Edge> graph[] = new ArrayList[V];
       createGraph(graph);

       bfs_traverse(graph,V);
       boolean visited[] = new boolean[V];
       dfs_traversal(graph,0,visited);
    }
}
