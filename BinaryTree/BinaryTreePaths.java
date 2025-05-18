package BinaryTree;

class Solution {
    public void helper(TreeNode root, List<Integer> res, List<String> finalResult)
    {
        if(root == null)
        {
            return;
        }
        
        res.add(root.val);
        if(root.left == null && root.right == null)
        {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < res.size(); i++) {
                sb.append(res.get(i));
                if (i < res.size() - 1) {
                    sb.append("->");
                }
            }
            finalResult.add(sb.toString());
            
        }
        else
        {
            helper(root.left, res, finalResult);
            helper(root.right, res, finalResult);
        }
        res.remove(res.size()-1);
      
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> finalResult = new ArrayList<>();
        helper( root, new ArrayList<>(), finalResult);
        return finalResult;
    }
}
