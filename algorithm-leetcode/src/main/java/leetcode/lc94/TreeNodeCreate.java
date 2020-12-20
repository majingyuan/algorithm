package leetcode.lc94;



public class TreeNodeCreate {
    public  TreeNode create(){
        TreeNode root =  new TreeNode(10);

        TreeNode l = new TreeNode(7);
        TreeNode l2 = new TreeNode(5);
        TreeNode l3 = new TreeNode(9);


        l.left=l2;l.right = l3;

        TreeNode r = new TreeNode(15);
        TreeNode r2 = new TreeNode(11);
        TreeNode r3 = new TreeNode(18);
        r.left=r2;r.right = r3;
        TreeNode r4 = new TreeNode(16);
        r3.left = r4;

        root.right = r;
        root.left=l;

        return root;
    }
}
