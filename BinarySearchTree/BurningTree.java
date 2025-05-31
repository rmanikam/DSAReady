package BinarySearchTree;

class Solution {
    public static int findMaxDistance(Node target, Map<Node, Node> parentMap) {
        Queue<Node> q = new LinkedList<>();
        q.offer(target);
        Map<Node, Boolean> vis = new HashMap<>();
        vis.put(target, true);
        int maxi = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            boolean fl = false;
            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                if (node.left != null && !vis.containsKey(node.left)) {
                    fl = true;
                    vis.put(node.left, true);
                    q.offer(node.left);
                }
                if (node.right != null && !vis.containsKey(node.right)) {
                    fl = true;
                    vis.put(node.right, true);
                    q.offer(node.right);
                }
                if (parentMap.containsKey(node) && !vis.containsKey(parentMap.get(node))) {
                    fl = true;
                    vis.put(parentMap.get(node), true);
                    q.offer(parentMap.get(node));
                }
            }
            if (fl) {
                maxi++;
            }
        }
        return maxi;

    }

    public static Node bfsToMapParent(Node root, Map<Node, Node> mpp, int target) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        Node res = null;
        while (!q.isEmpty()) {
            Node node = q.poll();
            if (node.data == target) {
                res = node;
            }
            if (node.left != null) {
                mpp.put(node.left, node);
                q.offer(node.left);
            }
            if (node.right != null) {
                mpp.put(node.right, node);
                q.offer(node.right);
            }
        }
        return res;

    }

    public static int minTime(Node root, int target) {
        // code here

        Map<Node, Node> mpp = new HashMap<>();
        Node targetNode = bfsToMapParent(root, mpp, target);
        int maxi = findMaxDistance(targetNode, mpp);
        return maxi;
    }
}
