/** 
 Trim a Binary Search Tree

 Given the root of a binary search tree and the lowest and highest boundaries as low and high, trim the tree so that all its 
 elements lies in [low, high]. Trimming the tree should not change the relative structure of the elements that will remain 
 in the tree (i.e., any node's descendant should remain a descendant). It can be proven that there is a unique answer.

Return the root of the trimmed binary search tree. Note that the root may change depending on the given bounds.
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
    
    TreeNode printTrimBST(TreeNode root,int low,int high){
        if(root==null){
            return null;
        }
        root.left=printTrimBST(root.left,low,high);
        root.right=printTrimBST(root.right,low,high);
        
        if(root.val<low){
            TreeNode node=root.right;
            root=null;
            return node;
        }
        if(root.val>high){
            TreeNode node=root.left;
            root=null;
            return node;
        }
        return root;
    }
    
    public TreeNode trimBST(TreeNode root, int low, int high) {
        TreeNode node=printTrimBST(root,low,high);
        return node;
    }
}