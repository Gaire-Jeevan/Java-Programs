public class ArrayLoopExamples {

    public static void main(String[] args) {
        
        // Example 1: Print every element of an integer array
        int[] numbers = {22, 24, 26, 29, 30};
        
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("\n");

        // Example 2: Print every element of an string array
        String[] strArray = {"apple", "banana", "cherry"};
        
        for (String string : strArray) {
            System.out.println(string);
        }
        System.out.println("\n");

        // Example 3: Print every second element of an integer array
        int[] grades = {95, 80, 85, 70, 90, 60, 88, 78};
        for (int i = 0; i < grades.length; i+=2) {
            System.out.println(grades[i]);
        }
        System.out.println("\n");
        

        // Example 4: Double the elements of an integer array
        int[] values = {3, 5, 7, 9, 11};
        
        for (int i = 0; i < values.length; i++) {
            values[i] = values[i] * 2;
            System.out.println(values[i]);
        }
        System.out.println("\n");


        // Example 5: Capitalize the elements of a string array
        String[] colors = {"red", "green", "blue"};
        
        for (int j = 0; j < colors.length; j++) {
            colors[j] = colors[j].toUpperCase();
            System.out.println(colors[j]);
        }
        System.out.println("\n");


        // Example 6: Find the index of a specific value in an integer array
        int[] data = {4, 7, 4, 1, 4, 9, 4};
        int targetValue = 4;
        
        for (int k = 0; k < data.length; k++) {
            if ( data[k] == 4) {
                System.out.println(k);
            }
        }
    }
}
