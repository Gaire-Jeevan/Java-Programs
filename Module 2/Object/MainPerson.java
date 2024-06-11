import java.util.Arrays;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Jeevan Gaire"; // a String
        person.nationality = "Nepali"; // a String
        person.dateOfBirth = "01/01/2002"; // a String
        person.passport = new String[] {person.name, person.nationality, person.dateOfBirth}; // Array that stores: {person.name, person.nationality, person.dateOfBirth}
        person.seatNumber = 5; // an Integer

        System.out.println(person.name);
        System.out.println(person.nationality);
        System.out.println(person.dateOfBirth);
        System.out.println(Arrays.toString(person.passport));
        System.out.println(person.seatNumber);

    }
}
