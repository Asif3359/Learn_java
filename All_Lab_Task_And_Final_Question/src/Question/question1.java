package Question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class question1 {
    private static String reverseString(String s) {
        int size = s.length();
        String tempString = "";

        for(int i = size - 1; i >= 0; --i) {
            tempString = tempString + s.charAt(i);
        }

        return tempString;
    }

    private static void Q3() {
        List<String> colors = new ArrayList();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Blue");
        colors.add("Yellow");
        System.out.println((String)colors.set(4, "Orange"));
        System.out.println((String)colors.get(4));
        System.out.println(colors.indexOf("Purple"));
        colors.remove("Blue");
        System.out.println((String)colors.get(2));
        System.out.println(colors.contains("Blue"));
        System.out.println(colors.subList(1, 3));
    }

    private static int countUniqueElements(int[] nums) {
        HashSet<Integer> uniqueElements = new HashSet();
        int[] var2 = nums;
        int var3 = nums.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int num = var2[var4];
            uniqueElements.add(num);
        }

        return uniqueElements.size();
    }

    private static void frequencyCount(String s) {
        HashMap<Character, Integer> mp = new HashMap();
        int size = s.length();
        char[] var3 = s.toCharArray();
        int var4 = var3.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            char ch = var3[var5];
            if (mp.containsKey(ch)) {
                int count = (Integer)mp.get(ch);
                ++count;
                mp.put(ch, count);
            } else {
                mp.put(ch, 1);
            }
        }

        Iterator var8 = mp.keySet().iterator();

        while(var8.hasNext()) {
            char c = (Character)var8.next();
            System.out.println("" + c + "-" + String.valueOf(mp.get(c)));
        }

    }

    public static void main(String[] args) {
        String s = "Hello";
        String s2 = reverseString(s);
        System.out.println(s2);
        Q3();
        int[] nums = new int[]{1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 9, 5};
        int uniqueCount = countUniqueElements(nums);
        System.out.println(uniqueCount);
        frequencyCount(s);
    }
}
