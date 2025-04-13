package Stacks;

import java.util.*;


class LRUCache {
    
    private class Node {
        int key, value;
        Node prev, next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity;
    private final Map<Integer, Node> cache;
    private final Node head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        // Initialize the dummy head and tail
        this.head = new Node(0, 0);
        this.tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        // Move the accessed node to the front (head)
        Node node = cache.get(key);
        remove(node);
        insertAtFront(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            // Remove the existing node
            remove(cache.get(key));
        } else if (cache.size() == capacity) {
            // Remove the least recently used node
            cache.remove(tail.prev.key);
            remove(tail.prev);
        }
        // Insert the new node at the front
        Node newNode = new Node(key, value);
        cache.put(key, newNode);
        insertAtFront(newNode);
    }

    // Remove a node from the doubly linked list
    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // Insert a node at the front of the doubly linked list
    private void insertAtFront(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
}