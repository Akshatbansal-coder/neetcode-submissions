class Solution {
    public static int height(TreeNode root){
        if(root==null){
            return 0;
        }

        return Math.max(height(root.left),height(root.right))+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
else{

        int x = diameterOfBinaryTree(root.right);
        int y=diameterOfBinaryTree(root.left);
    int k=height(root.left)+height(root.right);
    
      return Math.max(Math.max(x,y),k);

     
}        
   }
}