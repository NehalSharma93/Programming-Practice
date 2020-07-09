/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class MaxWidthOfBinaryTree {
    int maxWidth = 0;
    Map<Integer, Integer> map;

    public int widthOfBinaryTree(TreeNode root) {

        if(root == null) return 0;

        this.map = new HashMap<Integer, Integer>();

        this.maxWidth(root, 0, 0);

        return this.maxWidth;

    }

    public void maxWidth(TreeNode root, int depth, int position){

        if(root == null) return;

        this.map.computeIfAbsent(depth, x -> position);

        this.maxWidth = Math.max(this.maxWidth, position - this.map.get(depth) + 1);

        this.maxWidth(root.left, depth + 1 , position * 2);

        this.maxWidth(root.right, depth + 1 , position * 2 + 1);

    }
}