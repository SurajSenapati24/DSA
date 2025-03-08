package Trees.BinaryTree;
import java.util.*;
class Node{
    int key;
    Node left,right;
    public Node(int val){
        key=val;
        left=right=null;
    }
}
public class BinaryTree {
    public static void main(String[] args) {
        Node n1=new Node(3);
        Node n2=new Node(1);
        Node n3=new Node(7);
        Node n4=new Node(10);
        n1.left=n2;
        n1.right=n3;
        n2.left=n4;
    }
}
