import java.util.*;
public class boundryTraversalInBst {
    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data = data;
            this.left = this.right= null;
        }
    }
    public static ArrayList<Integer> boundry(Node root){


ArrayList<Integer> ans =  new ArrayList<>();
if(isLeaf(root)==false)
ans.add(root.data);
leftBoundry(root, ans);
addLeaves(root, ans);
rightBoundry(root, ans);
return ans;





    }
    public static boolean isLeaf(Node root){
        return root.left == null &&  root.right == null;
    }
    public static void  leftBoundry(Node root,ArrayList<Integer> ans){
        
        if(root==null) return;
        Node cur = root.left;
        while(cur!=null){
            if(isLeaf(cur)) ans.add(cur.data);
            if(cur.left != null) root = root.left;
            else
            root =  root.right;
        }
    }
    public static void rightBoundry(Node root , ArrayList<Integer> ans){
    if(root==null) return;
    ArrayList<Integer> temp  =  new ArrayList<>();
     Node cur =  root.right;
   while(root!=null){
    if(isLeaf(cur) == false){
    temp.add(root.data);
    }
    if(cur.right!=null){
        cur = cur.right;
    }
    else
    cur =  cur.left;
 }

 for(int i = temp.size()-1; i>=0; i--){
    ans.add(temp.get(i));
 }
    }

    public static void addLeaves(Node root , ArrayList<Integer> res){
        if(isLeaf(root)){
            res.add(root.data);
            return;
        }
     if(root.left!=null)   addLeaves(root.left, res);
      if(root.right!=null)  addLeaves(root.right, res);
    }





}
