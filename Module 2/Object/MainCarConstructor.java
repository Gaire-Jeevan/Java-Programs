// this program helps to understand the concept of "constructor, getter, setter, copy constructor" which are very essential in object oriented programming

public class MainCarConstructor {
    public static void main(String[] args) {

        // String[] spareParts = new String[] {"Tires", "Keys"}; // new means we are creating object --> creating new object of string class

        CarConstructor nissan = new CarConstructor("Nissan", 10000, 2020, "Green", new String[] {"Tires", "Keys"});
        CarConstructor dodge = new CarConstructor("Dodge", 11000, 2019, "Blue", new String[] {"Tires", "Keys"});
        
        // CarConstructor nissan2 = nissan; // both variable are going to share the refrence of exact same object --> instead of this we are going to use copy constructor

        // spareParts[0] = "Filter";

        CarConstructor nissan2 = new CarConstructor(nissan); // since i am using copy constructor i am passing one argument

        
        nissan2.setColor("Yellow");
         //   copy constructor
        nissan.setColor("Orange");
        nissan2.setColor("Blue");
        nissan.setColor("Purple");
        nissan2.setColor("Fuchsia");
        nissan.setColor("Beige");
        

        // nissan.make = "Toyota"; this way of updating object is not safe so we have to make every field of car class as private

        /* 
        nissan.setColor("Jet Black");
        dodge.setColor("Jet Black");  

        System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() + 
        ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");
        System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() + 
        ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() + ".\n");
        */

        // TASK OF CAR OBJECT
        nissan2.drive();
    }
}