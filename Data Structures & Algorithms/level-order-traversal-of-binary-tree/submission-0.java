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

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();   // Create an ArrayList of ArrayLists 
        if (root == null) return result; 

        Queue<TreeNode> queue = new LinkedList<>(); // Creae a Queue and add root to it
        queue.offer(root); // queue holds nodes waiting to be processed

        // Keep going as long as there are nodes to process. 
        // Each iteration of this while loop processes one entire level.
        while (!queue.isEmpty()) {
            int levelSize = queue.size(); 
            // Create a list for the current level
            List<Integer> level = new ArrayList<>();

            // traverse through the level
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll(); 
                level.add(node.val); 
                if (node.left != null) queue.offer(node.left); 
                if (node.right != null) queue.offer(node.right); 
            }
            result.add(level);
        }
        return result; 
    }
}