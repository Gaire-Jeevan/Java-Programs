import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        /*
        int[][] grades = new int[3][4];

        grades[0][0]= 72;
        grades[0][1]= 74;
        grades[0][2]= 79;
        grades[0][3]= 80;

        grades[1][0]= 72;
        grades[1][1]= 75;
        grades[1][2]= 89;
        grades[1][3]= 85;

        grades[2][0]= 70;
        grades[2][1]= 78;
        grades[2][2]= 77;
        grades[2][3]= 88;
 
        System.out.println("\tHarry: " + Arrays.toString(grades[0]));
        System.out.println("\tRon: " + Arrays.toString(grades[1]));
        System.out.println("\tHermione: " + Arrays.toString(grades[2]));
       */

        int [][] grades = {
            {72, 74, 79, 80},
            {72, 75, 89, 85},
            {70, 78, 77, 88}
        };

        System.out.println("\tHarry: " + grades[0][0] + " "+ grades[0][1] + " " + grades[0][2] + " " + grades[0][3]);
        System.out.println("\tRon: " + grades[1][0] + " "+ grades[1][1] + " " + grades[1][2] + " "+ grades[1][3]);
        System.out.println("\tHermione: " + grades[2][0] + " "+ grades[2][1] + " " + grades[2][2] + " "+ grades[2][3]);
    }

}
