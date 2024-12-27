package Labtask10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem1 {
    public static void main(String[] args) {

        String st = "apple orange apple";
        String[] list = st.split(" ");

        HashMap<String, Integer> mp = new HashMap<>();

        for (String word : list) {
            if (mp.containsKey(word)) {
                int count = mp.get(word);
                count = count + 1;
                mp.put(word, count);
            } else {
                mp.put(word, 1);
            }
        }
        // Print word counts
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
