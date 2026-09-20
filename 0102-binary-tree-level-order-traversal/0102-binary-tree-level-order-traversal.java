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
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null){
            return ans;
        }
        q.add(root);
       
        while(!q.isEmpty()){
             List<Integer>curr=new ArrayList<>();
            int size=q.size();
            while(size>0){
                TreeNode node=q.remove();
                curr.add(node.val);
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                q.add(node.right);
                }
                size--;

            }
            ans.add(curr);
            
        }
        return ans;


        
    }
}