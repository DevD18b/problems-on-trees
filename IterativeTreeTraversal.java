import java.util.Stack;

public class IterativeTreeTraversal {
    // we basically use  stack to do iterative 
    // tree traversal.
    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    // we use stack.
    // its a last in first out ds.
    // we follow an algorithm for the inorder traversal iterative.
    // left -->root--> right.
    public static void inorder(Node root){
Stack<Node> stack =  new Stack<>();

while(true){
    Node cur = root;
    if(cur!=null){
        stack.push(cur);
          cur = cur.left;
    }
    else{
        if(stack.isEmpty()){
            break;
        }
        cur = stack.peek();
        System.out.print(cur.data + " ");
        stack.push(cur.right);
    }
}
}
// now lets discuss how to print the preorder traversal in binary tree.
public static void preorder(Node root){
    Stack<Node> stack = new Stack<>();
    stack.push(root);
    while(!stack.isEmpty()){
        Node temp = stack.peek();
        stack.pop();
        System.out.println(temp);
        if(temp.right!=null){
            stack.push(temp.right);
        }
        if(temp.left!=null){
            stack.push(temp.left);
        }
    }


// now comes last post order traversal.
// iterative post order traversal is kind of the tough practise
// to do.because it can be implemented using either with single stack.
// or double stack...



}
public static void postOrder(Node root){
    Stack<Node> stack1 = new Stack<>();
    Stack<Node> stack2  = new Stack<>();

    Node cur = root;
    stack1.push(cur);
      while(!stack1.isEmpty()){
        Node temp = stack1.peek();
        stack1.pop();
        stack2.push(temp);
        if(temp.left!=null
        ){
            stack1.push(temp.left);
        }
        if(temp.right!=null)
        {
            stack1.push(temp.right);
        }

      }
      while(!stack2.isEmpty()){
        Node temp = stack2.peek();
        System.out.println(temp.data + " ");
        stack2.pop();

      }
}    
    

}
