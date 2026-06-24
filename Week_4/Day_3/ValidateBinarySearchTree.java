package Week_4.Day_3;

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
    return valid(root, null, null);
    }
    public boolean valid(TreeNode root, TreeNode min, TreeNode max) {
        if(root == null) {
            return true;
        }
        if(min != null && root.val <= min.val) {
            return false;
        }else if(max != null && root.val >= max.val) {
            return false;
        }
        return valid(root.left, min , root) && valid(root.right, root ,max);
    }
}
