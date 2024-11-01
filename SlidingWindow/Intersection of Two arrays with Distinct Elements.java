package SlidingWindow;
import java.util.HashSet;
import java.util.Arrays;
// 2 pointer approach
// Time Complexity: 𝑂(𝑛logn+𝑚log𝑚)
// Space Complexity: O(1)

// class Solution {
//     public static int numberofElementsInIntersection(int a[], int b[]) {
//         // Your code here
       
//         int i = 0;
//         int j = 0;
//         int n = a.length;
//         int m = b.length;
//         int count = 0;
//         Arrays.sort(a);
//         Arrays.sort(b);
//         while(i < n && j < m)
//         {
//             if(a[i] < b[j])
//             {
//                 i++;
//             }
//             else if(b[j] < a[i])
//             {
//                 j++;
//             }
//             else
//             {
//                 count++;
//                 i++;
//                 j++;
//             }
//         }
//         return count;
        
//     }
// }
class Solution {
    public static int numberofElementsInIntersection(int a[], int b[]) {
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        // Add elements from array a to the set
        for (int num : a) {
            setA.add(num);
        }

        // Count the intersection elements
        for (int num : b) {
            if (setA.contains(num)) {
                intersection.add(num);
            }
        }

        return intersection.size();
    }
}

// Time Complexity: 𝑂(𝑛 + m)
// Space Complexity: O(n + min(n,m))