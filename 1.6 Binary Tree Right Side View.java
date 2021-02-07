/**
 Binary Tree Right Side View


 Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

 */

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
    
    
    // void func(List<Integer> arr,TreeNode root){
    //     arr.add(root.val);
    //     if(root.right!=null && root.left!=null){
    //         func(arr,root.right);
    //        // func(arr,root.left);
    //     }
    //     else if(root.right!=null){
    //         func(arr,root.right);
    //     }
    //     else if(root.right==null&&root.left!=null){
    //         func(arr,root.left);
    //     }
    //     return;
    // }
    
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        if(root==null) return arr;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        TreeNode curr=null;
        while(!queue.isEmpty()){
            int n=queue.size();
            for(int i=0;i<n;i++){
                 curr=queue.remove();
                if(i==n-1){
                    arr.add(curr.val);
                }
                if(curr.left!=null){
                queue.add(curr.left);
            }
            if(curr.right!=null){
                queue.add(curr.right);
            }
            }
            
        }
        return arr;
    }
}