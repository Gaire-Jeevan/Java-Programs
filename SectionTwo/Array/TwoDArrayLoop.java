public class TwoDArrayLoop {
    public static void main(String[] args) {
        int [][] grades = {
            {72, 74, 79, 80},
            {72, 75, 89, 85},
            {70, 78, 77, 88}
        };

        /*
        for (int j = 0; j < grades[0].length; j++) {
            System.out.print(grades[0][j] + " ");
        }
        System.out.println("\n");
        for (int j = 0; j < grades[1].length; j++) {
            System.out.print(grades[1][j] + " ");
        }
        System.out.println("\n");
        for (int j = 0; j < grades[2].length; j++) {
            System.out.print(grades[2][j] + " ");
        }
        */

        for (int i = 0; i < grades.length; i++) {
            switch(i) {
                case 0: System.out.print("\tHarry: "); break;
                case 1: System.out.print("\tRon: "); break;
                case 2: System.out.print("\tBilton: "); break;
            }
            for (int j =0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
