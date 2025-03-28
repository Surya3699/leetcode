// 2 TreeNode check if sum of left and right node is equal to the root node ( 3 node tree)
   
public class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode() {
    
  }
  TreeNode(int val) { 
    this.val = val; 
  }
  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

class Solution {
    public boolean checkTree(TreeNode root) {
        return (root.val == root.left.val + root.right.val);
    }
}
