package leetcode;

public class TreeNode<T> {
     T value;
     TreeNode<T> leftNode;
     TreeNode<T> rightNode;

     public TreeNode(T value){
         this.value = value;
         leftNode = null;
         rightNode = null;
     }

}
