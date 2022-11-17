package slash.code;

import java.util.List;

public class Main {



    public static void main(String[] args) {


	    Factorial factorial=new Factorial();
        int x=4;
        int z=factorial.factorial(x);
        System.out.println("-------factorial("+x+")-------");
        System.out.println(z);
        int y=factorial.factorialTail(4,1);
        System.out.println(y==z);

        System.out.println("-------fibonacci-------");
        Fibonnaci fibonnaci=new Fibonnaci();
        System.out.println(fibonnaci.fibonacci(20));

        StringSubSequence stringSubSequence=new StringSubSequence();
        System.out.println(stringSubSequence.getSubSequence("alpha"));

        Hanoï hanoï=new Hanoï();
        hanoï.tower(3,'X','Y','Z');
        ArrayProductSum arrayProductSum=new ArrayProductSum();
        List<Object> a1=List.of(2,3);
        List<Object> a2=List.of(2,4);
        List<Object> a3=List.of(a1,1);
        List<Object> array=List.of(1,2,a1,6,a3,7);
        System.out.println(array);
        System.out.println(arrayProductSum.prodSumObj(array,1));

        /*
        *            1
        *           / \
        *          2   3
        *         /\   /\
        *        4  5 6  7
        *
         */
        BinaryTree binaryTree=new BinaryTree();
        BinaryTree.Node root= new  BinaryTree.Node(1);
        root.left=new  BinaryTree.Node(2);
        root.right=new BinaryTree.Node(3);
        root.left.left=new BinaryTree.Node(4);
        root.left.right=new BinaryTree.Node(5);
        root.right.left=new BinaryTree.Node(6);
        root.right.right=new BinaryTree.Node(7);

        /*In order type (left-node-right)
        *           2
        *          / \
        *         4   5
        *
         */
        /*Preorder type (node -left -right)
        *    5
        *  /
        * 2-4
        *
         */

        BinaryTree.Node root2= new  BinaryTree.Node(2);
        root2.left=new  BinaryTree.Node(4);
        root2.right=new BinaryTree.Node(5);

        System.out.println(binaryTree.isSubtree(root,root2));

        BinaryTree.Node root3= new  BinaryTree.Node(3);
        root3.left=new  BinaryTree.Node(6);
        root3.right=new BinaryTree.Node(7);

        System.out.println(binaryTree.isSubtree(root,root3));



    }
}
