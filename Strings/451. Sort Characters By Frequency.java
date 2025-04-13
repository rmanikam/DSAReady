package Strings;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
class Solution {
    public String frequencySort(String s) {

        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        List<Character> charList = new ArrayList<>(frequencyMap.keySet());

        charList.sort((char1, char2) -> frequencyMap.get(char2) - frequencyMap.get(char1));

        StringBuilder result = new StringBuilder();
        for (char character : charList) {
            int frequency = frequencyMap.get(character);
            for (int i = 0; i < frequency; i++) {
                result.append(character);
            }
        }

        return result.toString();
    }

    
}