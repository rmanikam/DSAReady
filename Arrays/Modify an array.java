package Arrays;
// public class Main {
//     public static void rearrange(int[] arr) {
//         int n = arr.length;
        
//          Create an auxiliary array to store new values
//         int[] newArr = new int[n];
        
//         Place each element at its correct index
//         for (int i = 0; i < n; i++) {
//             newArr[arr[i]] = i;
//         }
        
//         Copy modified values back to the original array
//         for (int i = 0; i < n; i++) {
//             arr[i] = newArr[i];
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {2, 0, 1, 4, 5, 3};
//         rearrange(arr);
//         System.out.println(java.util.Arrays.toString(arr));
//     }
// }

// optimal approach
public class Main {

    // Rearrange arr[] so that arr[j] becomes i if arr[i] is j
    public static void rearrange(int[] arr) {

        int n = arr.length;

        // Store new values using modulo
        for (int i = 0; i < n; i++) {
            arr[arr[i] % n] += i * n;
        }

        // Extract new values
        for (int i = 0; i < n; i++) {
            arr[i] /= n;
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 0, 1, 4, 5, 3};

        rearrange(arr);

        System.out.println(Arrays.toString(arr));
    }
}
