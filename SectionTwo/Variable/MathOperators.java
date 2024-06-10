public class MathOperators{
    public static void main(String[] args) {
        int bagOfSweets1 = 5;
        int bagOfSweets2 = 10;

        long starsInMilkyWay = 250_000_000_000L;
        long starsInAndromeda = 1_000_000_000_000L;

        double testScore = 6.7;

        // you should always use paranthesis while performing math operation.
        
        // Addition
        System.out.println("Fred and George collected " + (bagOfSweets1 + bagOfSweets2) + " sweets.");
        System.out.println("There are " + (starsInAndromeda + starsInMilkyWay) + " stars in the Milky Way and Andromeda");

        // Subtraction
        System.out.println("Fred has " + (bagOfSweets2 - bagOfSweets1) + " more sweet than George");
        System.out.println("The Andromeda Galaxy has " + (starsInAndromeda - starsInMilkyWay) + " more stars than Milky Way");

        // Multiplication and Division
        System.out.println("Snape made an error on his excel, accidentally multiplying Ron's score to: " + (testScore * 1.6));
        System.out.println("Snape caught the error. Furious, he divided Ron's score to: " + (testScore / 2.0));
        System.out.println();

        // Modulus
        System.out.println("10 is an even number, since dividing 10 by 2 has a remainder of : "+ (10 % 2));
        System.out.println("5 is an odd number, since dividing 5 by 2 has a remainder of: " + (5%2));

        // increases value by 1
        int counter = 0;
        counter++;
        counter++;
        System.out.println(counter);
        
        // decrease value by 1
        counter--;
        counter--;
        System.out.println(counter);

        // add by --> increases the value by number on the right
        counter+=5;
        System.out.println(counter);

        // subtract by --> decreases the value by number on the right
        counter-=5;
        System.out.println(counter);
    }
}