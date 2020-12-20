package leetcode.lc98;

public class Solution {
    Integer beforeValue = null;
    public boolean isValidBST(TreeNode root) {
        return check(root);
    }

    private boolean check(TreeNode root) {
        if(root != null ) {

            boolean left =check(root.left);
            boolean mid =  true;
            if(beforeValue !=null && beforeValue >= root.val){
                return false;
            }else{
                beforeValue = root.val;
            }


            boolean rigth = check(root.right);
            return left&&mid&&rigth;
        }else{
            return true;
        }
    }
}
