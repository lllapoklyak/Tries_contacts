import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Tatiana Sedneva
 */
public class Trie {
    private Node root=new Node();
    Trie(){};
     public void addWord(String word){
         char[] arrWord=word.toCharArray();
         Node tree=root;
         for (char a:arrWord) {
             tree.putChild(a);

             tree=tree.getChild(a);
             tree.size++;
         }

     }
     public int findHowManyTimes(String word){
         Node tree=root;
         if(tree==null){
             return 0;
         }
         char [] arrWord=word.toCharArray();

         for(int i=0; i<arrWord.length; i++){
             // size=tree.size;
             tree=tree.getChild(arrWord[i]);
             if(tree==null){
                 return 0;
             }
         }
          return  tree.size;
     }


    private class Node{

        private HashMap<Character, Node> children=new HashMap<>();
        public int size; //how many times we have this letter

        private void putChild(char ch){
            //if we already have this letter inside , nothing gonna happened
            children.putIfAbsent(ch, new Node());
        }
        private Node getChild(char ch){

            return children.get(ch);
        }
    }

}