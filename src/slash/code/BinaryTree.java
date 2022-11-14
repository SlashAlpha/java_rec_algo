package slash.code;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class BinaryTree {
    //example of functional interface using lambda and Functions
    MyFunctionalInterface replaceInterface =(list)->list.replace("[","").replace("]","").replace(",","");
    Function<List<Integer>,String> rawString=List::toString;
    Function<String,String> refine = s ->s.replace("[","").replace("]","").replace(",","" );
    Function<List<Integer>,String> result=rawString.andThen(refine);
    //to check if subtree
    public  boolean isSubtree(Node tree,Node sub){
        if (sub==null) return true;
        if (tree==null) return false;
        List<Integer> first=new ArrayList<>() ;
        inOrder(tree,first);
        List<Integer> second=new ArrayList<>() ;
        inOrder(sub,second);
        System.out.println(first);
        System.out.println(second);
      //  if (!replaceInterface.replaceChar(listToString(first)).contains(replaceInterface.replaceChar(listToString(second)))) return false;
        if (!result.apply(first).contains(result.apply(second))) return false;

        first.clear();
        second.clear();

        preOrder(tree,first);
        preOrder(tree,second);
//        return replaceInterface.replaceChar(listToString(first)).contains(replaceInterface.replaceChar(listToString(second)));
        return result.apply(first).contains(result.apply(second)) ;


    }


//    public  String listToString(List<Integer>list) {
//        System.out.println(list);
//       return func.apply(list);
//    }


    //to store in order traversal in list
    public  void inOrder(Node node, List<Integer> list){
        if (node==null) return;
        inOrder(node.left,list);
        list.add(node.data);
        inOrder(node.right,list);
    }


    //to store preorder traversal in list
    public  void preOrder(Node node, List<Integer> list){
        if (node==null) return;
        list.add(node.data);
        preOrder(node.left,list);
        preOrder(node.right,list);

    }

    static class Node{
        int data;
        Node left = null , right= null;

        public Node(int data) {
            this.data = data;
        }
    }
}
@FunctionalInterface
interface MyFunctionalInterface{

    public  String replaceChar(String list);


}