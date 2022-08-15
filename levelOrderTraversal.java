import java.util.*;

import javax.management.QueryEval;
public class levelOrderTraversal {
    // this is also known as the spiral order traversal or
    // Bfs.
    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data = data;
            this.left = this.right  = null;
        }
    }
    public static void bfs(Node root){
        Queue<Node> queue = new LinkedList<>();
    
        queue.offer(root);
        while(!queue.isEmpty()){
            int size =  queue.size();
            for(int i =0; i<size; i++){
                Node temp = queue.peek();
                queue.poll();
                if(temp.left!=null){
                    queue.offer(temp.left);
                }
                if(temp.right!=null){
                    queue.offer(temp.right);
                }
            }
        }
    
    
    }
}
