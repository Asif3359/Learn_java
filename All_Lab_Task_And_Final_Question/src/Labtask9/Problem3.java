package Labtask9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Problem3 {
    public static void main(String[] args) {
        List<Integer> lst = List.of(1, 1, 2, 2, 3, 3, 4, 5);

        HashSet<Integer> ht = new HashSet<>(lst);

        for (Integer h : ht) {
            System.out.print(h+" ");
        }
    }
}
