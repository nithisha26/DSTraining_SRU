import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.PriorityQueue;
//import java.util.Queue;

public class GraphCost {
    static class Edge{
        int src;
        int dest;
        int cost;
        Edge(int src,int dest,int cost){
            this.src=src;
            this.dest=dest;
            this.cost=cost;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        //undirected graph
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,1));
        graph[1].add(new Edge(1,0,2));
        graph[1].add(new Edge(1,3,3));
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,3));
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,4,4));
        graph[3].add(new Edge(3,5,5));
        graph[4].add(new Edge(4,2,3));
        graph[4].add(new Edge(4,3,4));
        graph[4].add(new Edge(4,5,2));
        graph[5].add(new Edge(5,3,5));
        graph[5].add(new Edge(5,4,2));
        graph[5].add(new Edge(5,6,6));
        graph[6].add(new Edge(6,5,6));

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
    

    public static int cntOfPaths(ArrayList<Edge> graph[],boolean[] vis,int start,int end,int cnt){
        if(start==end){
            cnt+=1;
            return cnt;
        }
        for(int i=0;i<graph[start].size();i++){
            Edge e=graph[start].get(i);
            if(vis[e.dest]==false){
                vis[start]=true;
                cnt=cntOfPaths(graph,vis,e.dest,end,cnt);
                vis[start]=false;
            }
        }
        return cnt;
    }
     
    //all paths
    public static void allPaths(ArrayList<Edge> graph[],boolean[] vis,int start,int end,String ans){
        if(start==end){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<graph[start].size();i++){
            Edge e=graph[start].get(i);
            if(vis[e.dest]==false){
                vis[start]=true;
                allPaths(graph,vis,e.dest,end,ans+e.dest);
                vis[start]=false;
            }
        }
    }
    //least path cost
    public static int leastPath(ArrayList<Edge> graph[],boolean[] vis,int start,int end,int cnt,int min){
        if(start==end){
            min=Math.min(min,cnt);
            return min;
        }
        for(int i=0;i<graph[start].size();i++){
            Edge e=graph[start].get(i);
            if(vis[e.dest]==false){
                vis[start]=true;
                min=leastPath(graph,vis,e.dest,end,cnt+e.cost,min);
                vis[start]=false;
            }
        }
        return min;
    }

    public static class Pair implements Comparable<Pair>{
        int node;
        int d;
        public Pair(int node,int d){
            this.node=node;
            this.d=d;
        }
        @Override
        public int compareTo(Pair p2){
            return this.d-p2.d;//ascending sorting
            //return p2.dist-this.dist //descending sorting
        }
    }

    public static void dijkstras(ArrayList<Edge> graph[],int V,int start){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int[] dist=new int[V];
        for(int i=0;i<V;i++){
            if(i!=start)
            dist[i]=Integer.MAX_VALUE;
        }
        boolean vis[]=new boolean[V];
        pq.add(new Pair(start,0));
        //bfs
        while(!pq.isEmpty()){
            Pair p=pq.remove();
            if(!vis[p.node]){
                vis[p.node]=true;
                for(int i=0;i<graph[p.node].size();i++){
                    Edge e=graph[p.node].get(i);
                    int u=e.src;
                    int v=e.dest;
                    if((dist[u]+e.cost)<dist[v]){
                        dist[v]=dist[u]+e.cost;
                        pq.add(new Pair(v,dist[v]));
                    }
                }
            }
        }
        for(int i=0;i<V;i++)
        System.out.print(dist[i]+" ");
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
        boolean[] vis1=new boolean[v];
        allPaths(graph, vis1, 2, 5, "2");
        boolean[] vis2=new boolean[v];
        System.out.println(cntOfPaths(graph, vis2, 2, 5, 0));
        boolean[] vis3=new boolean[v];
        System.out.println(leastPath(graph, vis3, 2, 5, 0, Integer.MAX_VALUE));
        dijkstras(graph, v, 0);
        
    }

}

