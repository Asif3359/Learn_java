package Labtask9;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public static List<String> LongestWord(String input) {

        String[] words = input.split(" ");

        List<String> ans = new ArrayList<>();
        int maxLength = 0;
        for (String word : words) {

            if (maxLength < word.length()) {
                maxLength = word.length();
                ans.clear();
                ans.add(word);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String input = "Java is versatile ";

        List<String> ans = LongestWord(input);

        System.out.println(ans);

    }
}
