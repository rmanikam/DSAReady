package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
// class Solution {
//     public ArrayList<Integer> findDuplicates(int[] arr) {
// code here
//         int n = arr.length;

//         ArrayList<Integer> ans = new ArrayList<Integer>();

//         for(int i = 0; i < n; i++)
//         {
//              int count = 0;
//             for(int j = i + 1; j < n; j++)
//             {
//                 if(arr[i] == arr[j])
//                 {
//                     count++;
//                 }
//             }
//             if(count > 0)
//             {
//                 ans.add(arr[i]);
//             }
//         }
//         return ans;
//     }
// }

// class Solution {

//     static ArrayList<Integer> findDuplicates(int[] arr) {

// sort the array so that duplicates are adjacent
//         Arrays.sort(arr);

//         ArrayList<Integer> ans = new ArrayList<>();

// traverse the sorted array and check 
// for consecutive duplicates
//         for (int i = 1; i < arr.length; i++) {

// if current element is same as previous
//             if (arr[i] == arr[i - 1]) {

// avoid adding the same duplicate 
// multiple times
//                 if (ans.isEmpty() || 
//                         ans.get(ans.size() - 1) != arr[i]) {
//                     ans.add(arr[i]);
//                 }
//             }
//         }

//         return ans;
//     }
// class Solution {
//     public static  ArrayList<Integer> findDuplicates(int[] arr) {
// code here
//         int n = arr.length;

//         ArrayList<Integer> ans = new ArrayList<Integer>();
//         int [] freq = new int[n+1];

//         for(int num: arr)
//         {
//           freq[num]++; 
//         }
//         for(int i = 1; i<= n; i++)
//         {
//             if(freq[i] == 2)
//             {
//                 ans.add(i);
//             }
//         }

//         return ans;
//     }
class Solution {
    public static ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        int n = arr.length;

        ArrayList<Integer> ans = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            int idx = Math.abs(arr[i]) - 1;
            if (arr[idx] < 0) {
                ans.add(Math.abs(arr[i]));
            } else {
                arr[idx] = -arr[idx];
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 3, 1, 2, 3 };

        ArrayList<Integer> res = findDuplicates(arr);

        for (int ele : res) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}