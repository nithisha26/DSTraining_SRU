import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class graph {
    static class Edge{
        int src;
        int dest;
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        //undirected graph
        // graph[0].add(new Edge(0,1,2));
        // graph[0].add(new Edge(0,2,1));
        // graph[1].add(new Edge(1,0,2));
        // graph[1].add(new Edge(1,3,3));
        // graph[2].add(new Edge(2,0,1));
        // graph[2].add(new Edge(2,4,3));
        // graph[3].add(new Edge(3,1,3));
        // graph[3].add(new Edge(3,4,4));
        // graph[3].add(new Edge(3,5,5));
        // graph[4].add(new Edge(4,2,2));
        // graph[4].add(new Edge(4,3,4));
        // graph[4].add(new Edge(4,5,2));
        // graph[5].add(new Edge(5,3,5));
        // graph[5].add(new Edge(5,4,2));
        // graph[5].add(new Edge(5,6,6));
        // graph[6].add(new Edge(6,5,6));
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));
        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));
        graph[6].add(new Edge(6,5));

    }

    public static void dfs(ArrayList<Edge> graph[],boolean[] vis,int start){
        System.out.print(start+" ");
        vis[start]=true;
        for(int i=0;i<graph[start].size();i++){
            Edge e=graph[start].get(i);
            if(vis[e.dest]==false)
            dfs(graph,vis,e.dest);
        }
    }
    public static void bfs(ArrayList<Edge> graph[],int v,int start){
        Queue<Integer> q=new LinkedList<>();
        boolean[] vis=new boolean[v];
        q.add(start);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(!vis[curr]){
                System.out.print(curr+" ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }

    }

    

    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);
        boolean[] vis=new boolean[v];
        for(int i=0;i<v;i++){
            if(!vis[i])
            dfs(graph, vis, i);
        }
        System.out.println();
        bfs(graph, v, 0);
        
    }

}
