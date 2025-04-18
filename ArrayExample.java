public class ArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Print the array elements
        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Find the sum of the array elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("\nSum of array elements: " + sum);
    }
}

