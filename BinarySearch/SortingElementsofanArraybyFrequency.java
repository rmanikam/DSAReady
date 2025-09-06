package BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class SortingElementsByFrequency {
    public static int[] sortByFrequency(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : arr) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);

        }

        List<Integer> uniqueElements = new ArrayList<>(hm.keySet());

        Collections.sort(uniqueElements, (a, b) -> {

            int freqA = hm.get(a);
            int freqB = hm.get(b);
            if (freqA != freqB) {
                return freqB - freqA;
            } else {
                return a - b;
            }

        });

        List<Integer> res = new ArrayList<>();

        for (int num : uniqueElements) {
            for (int i = 0; i < hm.get(num); i++) {
                res.add(num);
            }
        }

        int[] output = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            output[i] = res.get(i);
        }
        return output;
    }

    public static void main(String[] args) {
        // code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int[] sortedArray = sortByFrequency(arr);
            for (int num : sortedArray) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}