// Input: words = ["leet","code"], x = "e"
// Output: [0,1]
// Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.

import java.util.*;

public class ArrayListPrograme {
    public static void main(String[] args) {
        String[] words = {"leet","code"};
        char x = 'e';
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == x) {
                    ans.add(i);
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
