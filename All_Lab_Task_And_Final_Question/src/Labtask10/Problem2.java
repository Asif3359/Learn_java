package Labtask10;

import java.util.HashMap;
import java.util.Map;

public class Problem2 {
    public static void main(String[] args) {

        String st = "banana";
        HashMap<Character, Integer> mp = new HashMap<>();

        for (int i = 0; i < st.length(); i++) {
            if (mp.containsKey(st.charAt(i))) {
                int count = mp.get(st.charAt(i));
                count = count + 1;
                mp.put(st.charAt(i), count);
            } else {
                mp.put(st.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
