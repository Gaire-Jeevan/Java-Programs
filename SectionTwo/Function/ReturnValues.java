import javax.sound.midi.Sequencer.SyncMode;

public class ReturnValues {
    public static void main(String[] args) {
        double area1 = calculateArea(2.3, 3.6);
        double area2 = calculateArea(6.3,7.2);
        double area3 = calculateArea(2.6, 4.2); 
        
        System.out.println("Area1:- " +area1+ "\nArea2:- " +area2+ "\nArea3:- " +area3);

        printArea(2.3, 3.6, area1);

        String englishExplanation = explainArea("English");
        String frenchExplanation = explainArea("French");
        String spanishExplanation = explainArea("Spanish");
        String italianExplanation = explainArea("Italian");
    }

    public static double calculateArea(double length, double width){
        
        if(length < 0 || width < 0){
            System.out.println("INVALID DIMENSIONS");
            System.exit(0); // terminate runtime
        }
        double area = length * width;
            return area;
        
        
    }

    public static String explainArea(String language){
        
        switch (language) {
            // here no need to write break statement as it break the total flow of function
            case "English" : return "Area equals length * width";
            case "French": return "La surface est egale a la longueur * la largeur";
            case "Spanish": return "area es igual a largo * ancho";
            default: return "Language not available";
        }
    }

    public static void printArea(double length, double width, double area){
        System.out.println("A rectangle with a length of " + length + " and a width of " + width + " has an area of " + area);
    }
}