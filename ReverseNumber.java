public class ReverseNumber {

    public static int reverse(int num) {
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;          // Get last digit
            reversed = reversed * 10 + digit;
            num = num / 10;                // Remove last digit
        }

        return reversed;
    }

    public static void main(String[] args) {
        int num = 12345;

        System.out.println("Reversed Number: " + reverse(num));
    }
}
