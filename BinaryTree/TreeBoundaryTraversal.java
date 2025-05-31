package BinaryTree;

class Solution {
    boolean isLeaf(Node node) {

        return (node != null && node.left == null && node.right == null);

    }

    void addLeftBoundary(Node node, ArrayList<Integer> res) {
        Node curr = node.left;
        while (curr != null) {
            if (isLeaf(curr) == false) {
                res.add(curr.data);
            }
            if (curr.left != null) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }

        }
    }

    void addLeavesNode(Node node, ArrayList<Integer> res) {
        if (isLeaf(node) == true) {
            res.add(node.data);
            return;
        }
        if (node.left != null)
            addLeavesNode(node.left, res);
        if (node.right != null)
            addLeavesNode(node.right, res);

    }

    void addRightBoundary(Node node, ArrayList<Integer> res) {
        Node curr = node.right;
        ArrayList<Integer> temp = new ArrayList<Integer>();

        while (curr != null) {
            if (isLeaf(curr) == false) {
                temp.add(curr.data);
            }
            if (curr.right != null) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }

        }
        for (int i = temp.size() - 1; i >= 0; i--) {
            res.add(temp.get(i));
        }

    }

    ArrayList<Integer> boundaryTraversal(Node node) {
        // code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (isLeaf(node) == false) {
            res.add(node.data);
        }
        addLeftBoundary(node, res);
        addLeavesNode(node, res);
        addRightBoundary(node, res);
        return res;

    }
}