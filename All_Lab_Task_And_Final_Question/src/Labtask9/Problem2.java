package Labtask9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Problem2 {
    public static void main(String[] args) {

        List<String> stringList = List.of("apple", "banana", "orange", "apple");

        HashSet<String> set = new HashSet<>();

        for (String s : stringList) {
            set.add(s);
        }
//        HashSet<String> set = new HashSet<>(stringList);
        if (set.size() != stringList.size()) {
            System.out.println("Have Duplicate");
        } else {
            System.out.println("No Duplicate");
        }
    }
}
