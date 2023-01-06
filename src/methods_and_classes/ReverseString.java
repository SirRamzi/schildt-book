package methods_and_classes;

public class ReverseString {
    public static void reverse(String s) {
        rev(s, s.length() - 1);
    }

    private static void rev(String s, int index) {
        System.out.print(s.charAt(index--));
        if (index >= 0)
            rev(s, index);
    }
}
