package data_types;

public class Bubble {
    public static int[] SortInt(int[] numbers) {
        int temp;
        for (int i = 1; i < numbers.length; i++) {
            for (int j = numbers.length - 1; j >= i; j--) {
                if (numbers[j - 1] > numbers[j]) {
                    temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }

    public static String[] SortString(String[] strings) {
        String temp;
        for (int i = 1; i < strings.length; i++) {
            for (int j = strings.length - 1; j >= i; j--) {
                if (strings[j - 1].compareTo(strings[j]) > 0) {
                    temp = strings[j - 1];
                    strings[j - 1] = strings[j];
                    strings[j] = temp;
                }
            }
        }
        return strings;
    }
}