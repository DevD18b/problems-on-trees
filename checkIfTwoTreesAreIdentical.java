public class checkIfTwoTreesAreIdentical {
    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data = data;
            this.left=this.right =  null;
        }
    }
    public static boolean isIdentical(Node root1 , Node root2){

    if(root1==null && root2==null) return true;
    if(root1==null || root2==null) return false;
    if(root1.data!= root2.data)  return false;

    return isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);

    }
public static void main(String[] args) {
    Node root1 = new Node(1);
    root1.left = new Node(2);
    root1.right = new Node(3);

    Node root2 = new Node(1);
    root2.left = new Node(2);
    root2.right = new Node(3);
    root2.left.right = new Node(4);


    System.out.println(isIdentical(root1, root2));




}    
}
