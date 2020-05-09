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
class CousinsInBinaryTree {
  
    public boolean isCousins(TreeNode root, int x, int y) {
        //level order traversal
        int height = 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        int k = -1;
        int parent = -1;
        if(root == null)
            return false;
        queue.add(root);
        queue.add(null);
        
        while(queue.size() != 0){
           TreeNode temp = queue.poll();
           if(temp == null){
               height++;
                if(queue.size() != 0)
                    queue.add(null);
           } 
            else{
                if(temp.left != null){
                    queue.add(temp.left);
                    if(temp.left.val == x || temp.left.val == y){
                        if(k == -1){
                            parent = temp.val;
                            k = height;
                        }
                        else{
                            if(height == k)
                                if(parent == temp.val)
                                    return false;
                                else
                                    return true;
                        }  
                    }
                }
                if(temp.right != null){
                    queue.add(temp.right);
                    if(temp.right.val == x || temp.right.val == y){
                        if(k == -1){
                            parent = temp.val;
                            k = height;
                        }
                        else{
                            if(height == k)
                                if(parent == temp.val)
                                    return false;
                                else
                                    return true;
                        }  
                    }
                }
               
            }
        }
        return false;
        
    }
}