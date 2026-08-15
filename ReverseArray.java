public class ReverseArray {

    // Reverse integer array
    static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    // Reverse String array
    static void reverse(String[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"A", "B", "C", "D", "E"};

        reverse(numbers);
        reverse(names);

        for (int n : numbers) {
            System.out.print(n + " ");
        }

        System.out.println();

        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}
