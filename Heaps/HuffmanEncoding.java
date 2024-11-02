import java.util.*;
class Solution {
    class Node implements Comparable<Node>{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
        public int compareTo(Node temp){
            if(this.data == temp.data){
                return 1;
            }
            return this.data - temp.data;
        }
    }
    public void preorder(Node root, String str, ArrayList<String> res){
        if(root.left == null && root.right == null){
            res.add(str);
            return;
        }
        preorder(root.left, str + "0", res);
        preorder(root.right, str + "1", res);
        
    }
    public ArrayList<String> huffmanCodes(String S, int f[], int N)
    {
        ArrayList<String> res = new ArrayList<>();
        PriorityQueue<Node> pq = new PriorityQueue<>();
        for(int ele: f){
            Node temp = new Node(ele);
            pq.add(temp);
        }
        while(pq.size() > 1){
            Node left = pq.poll();
            Node right = pq.poll();
            Node parent = new Node(left.data + right.data);
            parent.left = left;
            parent.right = right;
            pq.add(parent);
        }
        Node root = pq.poll();
        preorder(root, "", res);
        return res;
    }
}