package BinaryTree;

//approach1
// class Solution {
//     public int serializeSubtrees(TreeNode node, Map<String, Integer> tripletToId, Map<Integer, Integer> cnt,
//             List<TreeNode> res) {
//         if (node == null) {
//             return 0;
//         }
//         int left = serializeSubtrees(node.left, tripletToId, cnt, res);
//         int right = serializeSubtrees(node.right, tripletToId, cnt, res);

//         String triplet = left + "," + right + "," + node.val;
//         if (!tripletToId.containsKey(triplet)) {
//             tripletToId.put(triplet, tripletToId.size() + 1);
//         }
//         int id = tripletToId.get(triplet);
//         cnt.put(id, cnt.getOrDefault(id, 0) + 1);
//         if (cnt.get(id) == 2) {
//             res.add(node);
//         }

//         return id;

//     }

//     public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
//         Map<String, Integer> tripletToId = new HashMap<>();
//         Map<Integer, Integer> cnt = new HashMap<>();
//         List<TreeNode> res = new ArrayList<>();

//         serializeSubtrees(root, tripletToId, cnt, res);
//         return res;

//     }
// }

//approach2

class Solution {
    public String serializeSubtrees(TreeNode node, Map<String, Integer> subtrees, List<TreeNode> duplicates) {
        if (node == null)
            return "$";
        String left = serializeSubtrees(node.left, subtrees, duplicates);
        String right = serializeSubtrees(node.right, subtrees, duplicates);
        String s = left + "," + right + "," + node.val;
        int count = subtrees.getOrDefault(s, 0);
        if (count == 1)
            duplicates.add(node);
        subtrees.put(s, count + 1);
        return s;
    }

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        Map<String, Integer> subtrees = new HashMap<>();
        List<TreeNode> duplicates = new ArrayList<>();
        serializeSubtrees(root, subtrees, duplicates);
        return duplicates;
    }
}
