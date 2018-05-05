import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
        HashMap <Character, String> test=new HashMap <>();
        test.putIfAbsent('a', "Andrew");
        test.putIfAbsent('t', "Tanya");
        test.putIfAbsent('t',"tat");
        System.out.println(test.get('a'));
        System.out.println(test.get('t'));
        System.out.println(test.get('k'));
*/



        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        Trie myTree= new Trie();
        for (int i=0;i<n;i++){
            String op=sc.next();
            String line=sc.next ();
            switch (op){
                case "add": myTree.addWord(line); break;
                case "find":
                            System.out.println(myTree.findHowManyTimes(line));
                            break;
            }
        }
        sc.close();
    }
}
