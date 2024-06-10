public class SwitchStatements {
    public static void main(String[] args) {

        // Section 1: Weather conditions
        String weather = "sunny";
        switch (weather) {
            case "sunny": System.out.println("You can wear a shirt"); break;
            case "cloudy": System.out.println("You should wear a sweater"); break;
            case "rainy": System.out.println("You should wear raincoat"); break;
            case "snowy": System.out.println("You should wear jacket"); break;

            default: System.out.println("You can wear whatever you want");
        }

        // Section 2: User role
        int role = 2;

        switch (role) {
            case 1: System.out.println("You are an admin"); break;
            case 2: System.out.println("You are an editor"); break;
            case 3: System.out.println("You are a user"); break;
            default: System.out.println("Please contact HR");
        }

        // Section 3: Temperature and humidity
        int temperature = 75;
        int humidity = 65;

        if  (temperature >= 80 && humidity >= 60){
            System.out.println("It's too hot and humid");
        }
        else if(temperature >= 80){
            System.out.println("It's too hot");
        }
        else if (temperature <= 60  && humidity >= 60){
            System.out.println("It's too cold and humid");
        }
        else if (temperature <= 60){
            System.out.println("It's too cold");
        }
        else{
            System.out.println("Its comfortable");
        }

        // Section 5: Age and income
        int age = 25;
        int income = 50000;

        if (age >= 19 && age <= 60 && income >= 30000){
            System.out.println("Congratulations! You eligible for a credit card");
        }
        else{
            System.out.println("Sorry, you are not eligible for the credit card");
        }

        // Section 1: Traffic light colors
        String lightColor = "green";

        switch (lightColor) {
            case "green": System.out.println("GO!"); break;
            case "yellow": System.out.println("Slow Down!"); break;
            case "red": System.out.println("Stop!"); break;
            default:System.out.println("Power outage!"); break;
        }

        // Section 2: Exam grade
        int grade = 85;

        if(grade >= 80)
        {
            System.out.println("You got an A!");
        }
        else if (grade >= 70){
            System.out.println("You got a B!");
        }
        else if (grade >= 60)
        {
            System.out.println("You got a C.");
        }
        else if (grade >= 50) {
            System.out.println("You got a D.");
        }
        else {
            System.out.println("You failed :(");
        }

        // Section 3: Browser type
        String browser = "Chrome";

        switch (browser){
            case "Chrome": System.out.println("Enjou your chrome extensions!"); break;
            case "Firefox": System.out.println("The best non-profit browser!"); break;
            case "Safari": System.out.println("I see you're a proud apple user"); break;
            default: System.out.println("Curious? What browser do you use?");
        }
        // Check if the browser is one of the following: Chrome, Firefox, Safari, Edge, or Opera
        // Decide whether to use if-else or switch
        
        

    }
}
