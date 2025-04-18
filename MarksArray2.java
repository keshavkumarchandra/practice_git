public class MarksArray2 {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 1;

        // Print each array element separately
        System.out.println("Marks obtained:");
        System.out.println("marks[0] = " + marks[0]);
        System.out.println("marks[1] = " + marks[1]);
        System.out.println("marks[2] = " + marks[2]);

        // Calculate total marks manually
        int sum = marks[0] + marks[1] + marks[2];
        System.out.println("Total marks: " + sum);
    }
}
