public class heightBalancedTree {
    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
      // we keep check on leftHeight and rightHeight explicitely.
     // what are we going to do we simply 
     // need to apply two checks  in the height of the bst wala logic. that is 
    // if lefheight == -1
    // return -1 and so is true for the right height.
    // if abs difference of left and right subtree is > 1 return -1...

    public static int heightOfBst(Node root){
        if(root==null) return 0;
         int leftHeight = heightOfBst(root.left);
         if(leftHeight==-1) return -1;
         int righthHeight = heightOfBst(root.right);
         if(righthHeight==-1) return -1;
        if(Math.abs(leftHeight-righthHeight)>1) return -1;
        else
        return 1+Math.max(leftHeight, righthHeight);
    }
    public static boolean isHeightBalancedBst(Node root){
        return heightOfBst(root)!=-1;
    }
    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(7);
        root.right = new Node(8);
        root.right.left = new Node(1);
        root.right.right = new Node(0);

        System.out.println(isHeightBalancedBst(root))   ;
    }    
}
