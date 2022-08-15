import java.util.LinkedList;

import javax.xml.stream.EventFilter;

import java.util.*;
public class heightOfBinaryTree {
    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static int heightOfBst(Node root){
        if(root==null) return 0;
         
        return 1+Math.max(heightOfBst(root.left), heightOfBst(root.right));
    }
   public static void main(String[] args) {
    Node root =  new Node(5);
        root.left = new Node(2);
        root.right = new Node(1);
        root.left.right  = new Node(10);
        root.right.left = new Node(3);
        root.right.right = new Node(4);
        root.right.left.left = new Node(8);
        root.right.left.left = new Node(11);

    

        System.out.println(height(root));
   }
// how to solve it using the level order traversal..
// height deep down means ki.
// kitna max path root seh leh kr leaves tk hum cover kr sakte hai.

public static int height(Node root){
    Node cur = root;
    Queue<Node> queue =  new LinkedList<>();
  queue.offer(root);
  int level =0 ;
  while(!queue.isEmpty()){
    int size = queue.size();
    // level =0;
    while(size-->0){
    Node temp = queue.peek();
    queue.poll();
    if(temp.left!=null){
        queue.offer(temp.left);
    }
    if(temp.right!=null){
        queue.offer(temp.right);
    }
}
level++;
  }
  return level;
}



    
}
