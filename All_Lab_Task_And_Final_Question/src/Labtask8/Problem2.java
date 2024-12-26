package Labtask8;

public class Problem2 {
    public static void main(String[] args) {

        String st = "mouse";

        StringBuilder tempSt = new StringBuilder();
        for (int i = st.length() - 1; i >= 0; i--) {
            tempSt.append(st.charAt(i));
        }
        String reverse = tempSt.toString();
        System.out.println("Reverse String is : " + reverse);
    }
}
