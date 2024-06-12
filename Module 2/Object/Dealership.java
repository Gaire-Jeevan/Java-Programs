import java.util.Arrays;

public class Dealership {
    private DealershipCar[] cars;

    public Dealership(DealershipCar[] cars) {
        this.cars = new DealershipCar[cars.length];

        // DEEP COPY -->this is used because 
        for (int i = 0; i < this.cars.length; i++) {
            this.cars[i] = new DealershipCar(cars[i]);
        }
    }

    public void sell(int index) {
        this.cars[index].drive();
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking Spot: " + i + "\n";
            String carDescription = this.cars[i].toString();
            temp += carDescription + "\n";
        }
        return temp;
    }
}
