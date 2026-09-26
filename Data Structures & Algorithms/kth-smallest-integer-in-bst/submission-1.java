class Solution {
    List<Integer> ans = new ArrayList<Integer>();
    public List<Integer> inorder(TreeNode root){
        if(root==null){
            return ans;
        }
      inorder(root.left);
      ans.add(root.val);
      inorder(root.right);

      return ans;


    }
    public int kthSmallest(TreeNode root, int k) {
       if(root==null){
        return 0;
       }

       inorder(root);
       return ans.get(k-1);


    
    }
}
