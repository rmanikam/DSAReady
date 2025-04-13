package Strings;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
// class Solution {
//     public String frequencySort(String s) {

//         Map<Character, Integer> frequencyMap = new HashMap<>();
//         for (char c : s.toCharArray()) {
//             frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
//         }

//         List<Character> charList = new ArrayList<>(frequencyMap.keySet());

//         charList.sort((char1, char2) -> frequencyMap.get(char2) - frequencyMap.get(char1));

//         StringBuilder result = new StringBuilder();
//         for (char character : charList) {
//             int frequency = frequencyMap.get(character);
//             for (int i = 0; i < frequency; i++) {
//                 result.append(character);
//             }
//         }

//         return result.toString();
//     }

    
// }

class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        StringBuilder str = new StringBuilder();
        int n = s.length();
        for(int i = 0; i < n; i++)
        {
            Character ch = s.charAt(i);
            if(hm.containsKey(ch))
            {
               int count = hm.get(ch);
               hm.put(ch, count + 1);
            }        
            else
            {
                hm.put(ch, 1);
            }
        }
        List<Character> chars = new ArrayList<>(hm.keySet());
        chars.sort((a,b) -> hm.get(b) - hm.get(a));
        for(Character ch: chars)
        {
            int count = hm.get(ch);
            for(int i = 0; i < count; i++)
            {
                str.append(ch);
            }
        }
       
        return str.toString();
        

    }
}