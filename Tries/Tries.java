package Tries;
class TrieNode{
    char data;
    boolean isTerminal;
    TrieNode childeren [];
    int childcount;
    public TrieNode(char data){
        this.data=data;
        this.isTerminal=false;
        this.childeren=new TrieNode[26];
        this.childcount=0;
    }

}

public class Tries {
    private TrieNode root;
    public Tries(){
        root=new TrieNode('\0');
    }
    private void addhelper(TrieNode root,String  word){
        if(word.length()==0){
            root.isTerminal=true;
            return;
        }
      int childindex=word.charAt(0)-'A';
      TrieNode child=root.childeren[childindex];
      if(child==null){
          child=new TrieNode(word.charAt(0));
          root.childeren[childindex]=child;
          root.childcount++;
      }
      addhelper(child,word.substring(1));
    }
    public void add(String word){
      addhelper(root,word);
    }
    private boolean searchhelper(TrieNode root,String word){
        if(word.length()==0){
            return root.isTerminal;
        }
        int childindex=word.charAt(0)-'A';
        TrieNode child=root.childeren[childindex];
        if(child==null){
            return false;
        }
        return searchhelper(child,word.substring(1));
    }
    public boolean search(String word){
        return searchhelper(root,word);
    }
    private void removehelper(TrieNode root,String word){
        if(word.length()==0){
            root.isTerminal=false;
            return;
        }
        int childindex=word.charAt(0)-'A';
        TrieNode child=root.childeren[childindex];
        if(root==null){
            return;
        }
        removehelper(child,word.substring(1));
        if(!child.isTerminal&&child.childcount==0){
            root.childeren[childindex]=null;
            root.childcount--;
        }
    }
    public void remove(String word){
        removehelper(root,word);

    }
    public static void main (String[]args){
        Tries t=new Tries();
        t.add("NOTE");
        t.add("AND");
        System.out.println(t.search("AND"));
        t.remove("AND");
        System.out.println(t.search("AND"));
    }
}
