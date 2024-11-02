


class Solution {
    static void convertMinToMaxHeap(int N, int arr[]) {
        // Start from the last non-leaf node and heapify each node
        for (int i = N / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, N, i);
        }
    }

    // Function to maintain the max heap property
    static void maxHeapify(int arr[], int N, int i) {
        int largest = i;       // Initialize largest as root
        int left = 2 * i + 1;  // Left child index
        int right = 2 * i + 2; // Right child index

        // If left child is larger than root
        if (left < N && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < N && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            // Swap arr[i] with arr[largest]
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected subtree
            maxHeapify(arr, N, largest);
        }
    }
}
