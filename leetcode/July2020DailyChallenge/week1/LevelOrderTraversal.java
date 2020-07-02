package week1;

public class LevelOrderTraversal{
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if(root == null)
            return result;


        Queue<TreeNode> queue = new LinkedList<TreeNode>();


        queue.add(root);
        queue.add(null);

        List<Integer> temp = new ArrayList<Integer>();

        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node == null){
                result.add(temp);
                temp = new ArrayList<Integer>();
                if(queue.isEmpty())
                    break;
                queue.add(null);
            }
            else{
                temp.add(node.val);
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
            }
        }

        Collections.reverse(result);

        return result;
    }
}