public class Main {
    public static void main(String[] args) {
        int[] numbers = {653, 5262, 67, 988, 32};
        int x = 8;
        int y = 4;
        restCalc(numbers);
        twoSmallest(numbers);
        System.out.println(ecuForm(x, y));
    }

    public static void restCalc(int[] arr) {
        String impossible = "The array length has to be at least 1";
        int x = 0;
        int y = Integer.MAX_VALUE;
        if (arr.length < 1) {
            System.out.println(impossible);
        } else {
            for (int number : arr) {
                if (number > x) {
                    x = number;
                }
            }
            for (int number : arr) {
                if (number < y) {
                    y = number;
                }
            }
            System.out.println(x - y);
        }
    }

    public static void twoSmallest(int[] arr) {
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        for (int number : arr) {
            if (number < x) {
                x = number;
            }
        }
        for (int number : arr) {
            if (number < y && number != x) {
                y = number;
            }
        }
        System.out.println(x + " is the smallest number");
        System.out.println(y + " is the second smallest number");
    }

    public static float ecuForm(float x, float y) {
        return (x * x) + (((4 * y) / 5) - x) * (((4 * y) / 5) - x);
    }
}