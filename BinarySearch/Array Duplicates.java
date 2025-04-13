package BinarySearch;
// class Solution {
    // brute force
    // public List<Integer> findDuplicates(int[] arr) {
    //     
    //     List<Integer> dupele = new ArrayList<Integer>();
    //     for(int i = 0; i < arr.length; i++)
    //     {
    //         for(int j = i + 1; j <arr.length; j++)
    //         {            
    //             if(arr[i] == arr[j])
    //             {
    //             dupele.add(arr[i]);
    //             }
    //         }
    //     }
    //     return dupele;
        
    // }
    


// }
// better 

// class Solution {
//     public List<Integer> findDuplicates(int[] arr) {
//     
//         List<Integer> dupele = new ArrayList<Integer>();
//         HashMap<Integer, Integer> hm = new HashMap<>();
        
//         for(int i = 0; i < arr.length; i++)
//         {
//             if(hm.containsKey(arr[i]))
//             {
//                 dupele.add(arr[i]);
//             }
//             else
//             {
//                 hm.put(arr[i], 1);
//             }
//         }
//         return dupele;
        
//     }
// }

// optimal

class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        // code here
          Arrays.sort(arr); // Binary search requires a sorted array
        List<Integer> dupele = new ArrayList<>();
        
        for (int i = 0; i < arr.length - 1; i++) {
            // Perform binary search in the right half to check for duplicates
            if (binarySearch(arr, i + 1, arr.length - 1, arr[i])) {
                // Avoid adding duplicate elements multiple times
                if (dupele.isEmpty() || dupele.get(dupele.size() - 1) != arr[i]) {
                    dupele.add(arr[i]);
                }
            }
        }
        return dupele;
        
    }
    private boolean binarySearch(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}