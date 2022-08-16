
import java.util.Arrays;

public class maxPathSumInBst {

static class Node{
    Node left;
    Node right;
    int data;
    Node(int data){
        this.data = data;
        this.left = this.right= null;
    }
}
public static int maxPathSum(Node root){

    int [] max =  new int[1];
    Arrays.fill(max, -1);
    
    helper(root, max);
    return max[0];

}
public static int helper(Node root , int [] arr){
    if(root==null) return 0;
  int leftMaxPath  = Math.max(0 , helper(root.left, arr));
  int rightMaxPath = Math.max(0, helper(root.right, arr));

  arr[0] = Math.max(arr[0] , leftMaxPath+rightMaxPath+root.data);

  return Math.max(leftMaxPath, rightMaxPath)+root.data;
}


    public static void main(String [] args){
       Node root = new Node(1);
       root.left = new Node(2);
       root.right = new Node(3);
       root.right.left = new Node(7);
       System.out.println(maxPathSum(root));
    }


}
