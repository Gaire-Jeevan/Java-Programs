import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
       
        // Reference trap
        String[] staffThisYear = staffLastYear;
        staffThisYear[1] = "Abbay"; // this update the last year data too

        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));

        // Solution of Reference Trap
        
        System.out.println("\n");
        /*
        String[] newStaffThisYear = new String[5];
        for (int i = 0; i < staffLastYear.length; i++) {
            newStaffThisYear[i] = staffLastYear[i];
        }
        newStaffThisYear[1] = "Tommy";
        System.out.println(Arrays.toString(newStaffThisYear));
        */

        // II Method
        String[] newStaffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);
        System.out.println(Arrays.toString(newStaffThisYear));
    }
}
