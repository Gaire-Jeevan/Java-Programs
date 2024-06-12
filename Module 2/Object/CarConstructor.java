import java.util.Arrays;

public class CarConstructor {
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;
    
    public CarConstructor(String make, double price, int year, String color, String[] parts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length); // this create a brand new array of refrence that we passed in
    }

    // COPY CONSTRUCTOR    source--> object that we pass in
    public CarConstructor(CarConstructor source) { // it invoke all the parameter once creating a object when one parameter pass in it
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }

    // as the field are private so we should use getter to make it visible at other classes
    public String getMake() { // the return type should be same as the field datatype
        return make;
    }

    public void setMake(String make) { // to update the field of object we use setters
        this.make = make;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String[] getParts() {
        return parts;
    }

    public void setParts(String[] parts) {
        this.parts = parts;
    }

    public void drive() { // no need to keep this keyword
        System.out.println("\nYour bought the beautiful " + this.year +" " + this.color + " " + this.make + " for " + this.price + ".");
        System.out.println("Please drive your car to the nearest exit.\n");
    }
}
