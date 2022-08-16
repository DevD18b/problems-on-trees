import java.util.*;
public class zigzagOrderTraversal {
    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data = data;
            this.left = this.right= null;
        }
    }
    public static List<List<Integer>> zigzagTraversal(Node root){


        Stack<Node> stack = new Stack<>();
        stack.push(root);
        List<List<Integer>> ans = new ArrayList<>();
         int level = 1;
        while(!stack.isEmpty()){
            int size = stack.size();
            List<Integer> list =  new ArrayList<>();
            Stack<Node> s = new Stack<>();
            while(size-->0){  
                Node temp = stack.peek();
                stack.pop();
                list.add(temp.data);
                if(level%2==1){
                if(temp.left!=null){
                    s.push(temp.left);
                }
                if(temp.right!=null){
                    s.push(temp.right);
                }
            }
            else{
                if(temp.right!=null){
                    s.push(temp.right);
                }
                if(temp.left!=null){
                    s.push(temp.left);
                }
            }
            }
            stack = s;
            ans.add(list);
            level++;
            
        }
        return ans;
    }
    public static void main(String[] args) {
        Node root =  new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right =  new Node(7);
        System.out.println(zigzagTraversal(root));
    }
}
