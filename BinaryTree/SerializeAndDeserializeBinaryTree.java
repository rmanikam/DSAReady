package BinaryTree;

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

        if (root == null)
            return "";
        Queue<TreeNode> q = new LinkedList<>();
        StringBuilder s = new StringBuilder();

        q.add(root);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node == null) {
                s.append("n ");
                continue;
            }
            s.append(node.val + " ");
            q.add(node.left);
            q.add(node.right);
        }
        return s.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == "")
            return null;
        Queue<TreeNode> q = new LinkedList<>();
        String[] arr = data.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        q.add(root);
        for (int i = 1; i < arr.length; i++) {
            TreeNode parent = q.poll();
            if (!arr[i].equals("n")) {

                TreeNode left = new TreeNode(Integer.parseInt(arr[i]));
                parent.left = left;
                q.add(left);
            }
            if (!arr[++i].equals("n")) {

                TreeNode right = new TreeNode(Integer.parseInt(arr[i]));
                parent.right = right;
                q.add(right);
            }
        }
        return root;

    }
}