import java.lang.reflect.Array;
import java.util.*;
public class Tries {
    //Node class with map,flag and cnt of prefix words
    class Node{
        HashMap<Character,Node> map;
        int flag;
        int p;
        Node(){
            map=new HashMap<>();
            flag=0;
            p=0;
        }
    }
    private Node root;
    public Tries(){
        root=new Node();
    }
    //insert
    public void insert(String s){
        Node temp=this.root;
        for(char i : s.toCharArray()){
            if(!temp.map.containsKey(i)){
                Node newNode=new Node();
                temp.map.put(i,newNode);
            }
            temp=temp.map.get(i);
            temp.p+=1;
        }
        temp.flag=1;
    }
    //search for a string
    public boolean search(String s){
        Node temp=this.root;
        for(char i : s.toCharArray()){
            if(!temp.map.containsKey(i)){
                return false;
            }
            else{
                temp=temp.map.get(i);
            }
        }
        if(temp.flag==1)
        return true;
        else
        return true;
    }
    //no.of words with prefix s
    public int prefixCnt(String s){
        Node temp=this.root;
        for(char i : s.toCharArray()){
            if(!temp.map.containsKey(i)){
                return 0;
            }
            temp=temp.map.get(i);
        }
        return temp.p;
    }
    public void dfs(Node temp,String str){
        if(temp.flag==1){
            System.out.println(str);
            return;
        }
        for(Character ch : temp.map.keySet()){
            dfs(temp.map.get(ch),str+ch);
        }
    }
    //print prefix words with prefix s
    public void prefixWords(String s){
        Node temp=this.root;
        for(char i : s.toCharArray()){
            if(!temp.map.containsKey(i)){
                System.out.println("no words");
                return;
            }
            temp=temp.map.get(i);
        }
        dfs(temp,s);
    }
    public int dfs1(Node temp,String s){
        if(temp.flag==1){
            return 1;
        }
        int max=0;
        for(Character ch : temp.map.keySet()){
            max=Math.max(max,dfs1(temp.map.get(ch),s+ch));
        }
        return max;
    }
    //
    public int longPrefix(String s){
        Node temp=this.root;
        for(char i : s.toCharArray()){
            if(!temp.map.containsKey(i)){
                return 0;
            }
            temp=temp.map.get(i);
        }
        return dfs1(temp,s);
    }
    public static void main(String[] args) {
        Tries t=new Tries();
        t.insert("world");
        t.insert("words");
        t.insert("apple");
        t.insert("woo");
        t.insert("w");
        System.out.println(t.search("word"));
        System.out.println(t.prefixCnt("worlds"));
        System.out.println(t.prefixCnt("w"));
        t.prefixWords("wo");
        t.prefixWords("s");
        ArrayList<String> list=new ArrayList<>(Arrays.asList("wo","ap"));
        int max=0;
        for(int i=0;i<list.size();i++){
            max=Math.max(max,t.longPrefix(list.get(i)));
        }
        System.out.println(max);
    }
}
