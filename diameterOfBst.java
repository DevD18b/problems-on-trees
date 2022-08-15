import java.util.Arrays;
import java.util.NoSuchElementException;

public class diameterOfBst {
    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static int diameter(Node root){

        int [] diameter =  new int[1];
        Arrays.fill(diameter , Integer.MIN_VALUE);
        height(root,  diameter);
        
        return diameter[0];
    }
public static int height(Node root , int [] diamter){
    if(root==null) return 0;
    int left = height(root.left, diamter);
    int right = height(root.right, diamter);
    diamter[0] = Math.max(diamter[0], left+right);
  return 1+Math.max(left,right);
}
public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.right.left = new Node(4);
    root.right.right = new Node(5);
    //root.right.left =  new Node(6);
    
    System.out.println(diameter(root));
}    
}
