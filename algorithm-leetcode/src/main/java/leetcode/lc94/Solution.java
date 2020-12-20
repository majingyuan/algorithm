package leetcode.lc94;



import java.util.ArrayList;
import java.util.List;

/**
 * 中序遍历
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result =  new ArrayList<>();
        midTraversal(result,root);

        return  result;
    }

    private void midTraversal(List<Integer> result, TreeNode node) {
        if(node == null){
            return;
        }
        midTraversal(result,node.left);
        result.add(node.val);
        midTraversal(result,node.right);
    }

    public static void main(String[] args){

    }
}
