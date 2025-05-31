package BinaryTree;

// approach1

// import java.util.ArrayList;
// import java.util.List;

// class NaryTree {
// True if the node is locked
//     boolean isLocked;
// Pointer to parent node
//     NaryTree parent;

//     List of child nodes
//     List<NaryTree> children;

//     NaryTree(NaryTree parent)
//     {
//         this.parent = parent;
//         this.isLocked = false;
//         this.children = new ArrayList<>();
//     }

//     void addChild(NaryTree child)
//     {
//         children.add(child);
//         child.parent = this;
//     }
// }

// class NaryTreeLock {
//     static boolean isLock(NaryTree node)
//     {
//         return node.isLocked;
//     }

//     static boolean hasLockedDescendants(NaryTree node)
//     {
//         for (NaryTree child : node.children) {
//             if (child.isLocked
//                 || hasLockedDescendants(child)) {
//                 return true;
//             }
//         }
//         return false;
//     }

//     static boolean Lock(NaryTree node)
//     {
//         Node is already locked
//         if (node.isLocked) {
//             return false;
//         }

//         Check all ancestors for locks
//         NaryTree current = node.parent;
//         while (current != null) {
//             if (current.isLocked) {
//                 return false;
//             }
//             current = current.parent;
//         }

//         Check all descendants for locks
//         if (hasLockedDescendants(node)) {
//             return false;
//         }

//         Lock the node
//         node.isLocked = true;
//         return true;
//     }

//     Unlock function simply sets isLocked to false (O(1))
//     static void unLock(NaryTree node)
//     {
//         node.isLocked = false;
//     }

//     public static void main(String[] args)
//     {
//         NaryTree root = new NaryTree(null);
//         NaryTree child1 = new NaryTree(root);
//         NaryTree child2 = new NaryTree(root);
//         NaryTree child3 = new NaryTree(child1);
//         NaryTree child4 = new NaryTree(child1);

//         Add children to the nodes
//         root.addChild(child1);
//         root.addChild(child2);
//         child1.addChild(child3);
//         child1.addChild(child4);

//         Test lock and unlock functionality
//         Lock child1
//         if (Lock(child1)) {
//             System.out.println(
//                 "child1 locked successfully.");
//         }
//         else {
//             System.out.println("Failed to lock child1.");
//         }

//         Try to lock child3, should fail since child1 is
//         locked
//         if (Lock(child3)) {
//             System.out.println(
//                 "child3 locked successfully.");
//         }
//         else {
//             System.out.println("Failed to lock child3.");
//         }

//         Unlock child1
//         unLock(child1);
//         System.out.println("child1 unlocked.");

//         Try to lock child3 again, should succeed now
//         if (Lock(child3)) {
//             System.out.println(
//                 "child3 locked successfully.");
//         }
//         else {
//             System.out.println("Failed to lock child3.");
//         }
//     }
// }

// Time Complexity:

// isLock() O(1)
// Lock() O(n), because there can be O(n) descendants.
// unLock() O(1)

import java.util.ArrayList;
import java.util.List;

class NaryTree {
    // True if the node is locked
    private boolean isLocked;

    // Pointer to parent node
    private NaryTree parent;

    // List of child nodes (n-ary tree structure)
    private List<NaryTree> children;

    // Count of locked descendants in the subtree
    private int lockedDescendantsCount;

    public NaryTree(NaryTree parent) {
        this.parent = parent;
        this.isLocked = false;
        this.lockedDescendantsCount = 0;
        this.children = new ArrayList<>();
    }

    public NaryTree() {
        this(null);
    }

    public void addChild(NaryTree child) {
        children.add(child);
        child.parent = this;
    }

    public boolean isLock() {
        return isLocked;
    }

    public boolean Lock() {
        // Node is already locked or has locked descendants
        if (isLocked || lockedDescendantsCount > 0) {
            return false;
        }

        // Check all ancestors for locks
        NaryTree current = parent;
        while (current != null) {
            // If any ancestor is locked, this node cannot
            // be locked
            if (current.isLocked) {
                return false;
            }
            current = current.parent;
        }

        // Lock the node
        isLocked = true;

        // Update locked descendants count for all ancestors
        current = parent;
        while (current != null) {
            current.lockedDescendantsCount++;
            current = current.parent;
        }

        return true;
    }

    public void unLock() {
        // Node is not locked, nothing to do
        if (!isLocked) {
            return;
        }

        // Unlock the node
        isLocked = false;

        // Update locked descendants count for all ancestors
        NaryTree current = parent;
        while (current != null) {
            current.lockedDescendantsCount--;
            current = current.parent;
        }
    }

    public static void main(String[] args) {
        NaryTree root = new NaryTree();
        NaryTree child1 = new NaryTree(root);
        NaryTree child2 = new NaryTree(root);
        NaryTree child3 = new NaryTree(child1);
        NaryTree child4 = new NaryTree(child1);

        // Add children to root and child1
        root.addChild(child1);
        root.addChild(child2);
        child1.addChild(child3);
        child1.addChild(child4);

        // Lock child1
        if (child1.Lock()) {
            System.out.println(
                    "child1 locked successfully.");
        } else {
            System.out.println("Failed to lock child1.");
        }

        // Try to lock child3, should fail since child1 is
        // locked
        if (child3.Lock()) {
            System.out.println(
                    "child3 locked successfully.");
        } else {
            System.out.println("Failed to lock child3.");
        }

        // Unlock child1
        child1.unLock();
        System.out.println("child1 unlocked.");

        // Try to lock child3 again, should succeed now
        if (child3.Lock()) {
            System.out.println(
                    "child3 locked successfully.");
        } else {
            System.out.println("Failed to lock child3.");
        }
    }
}

// Time Complexity:

// isLock() O(1)
// Lock() O(log n)
// unLock() O(log n)
// Auxiliary Space: O(1)