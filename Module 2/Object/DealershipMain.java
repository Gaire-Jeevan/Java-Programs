import java.util.Scanner;

public class DealershipMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        DealershipCar[] cars = new DealershipCar[] {
            new DealershipCar("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
            new DealershipCar("Dodge", 8500, 2019, "blue", new String[] {"tires", "keys"}),
            new DealershipCar("Nissan", 5000, 2017, "yellow", new String[] {"tires", "filter"}),
            new DealershipCar("Honda", 7000, 2019, "orange", new String[] {"tires", "filter"}),
            new DealershipCar("Mercedes", 12000, 2015, "jet black", new String[] {"tires", "filter", "transmission"})
        };

        Dealership dealership = new Dealership(cars);
        

        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");        
        System.out.println("Feel free to browse through our collection of cars.\n");
        System.out.println(dealership);
        System.out.println("Which car are you interested in? (0 – 4).\n");
        int index = scan.nextInt();

        // sell car here... 

        dealership.sell(index);

        scan.close();
    }
}
