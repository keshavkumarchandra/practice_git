public class MarksArray {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;

        // Print the array elements
        System.out.println("Marks obtained:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks[" + i + "] = " + marks[i]);
        }

        // Calculate the total marks
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        System.out.println("Total marks: " + sum);
    }
}
