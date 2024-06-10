package SectionTwo;

import javax.sql.rowset.spi.SyncResolver;

public class Biography {
   public static void main(String[] args) {
    String name = "Jeevan Gaire";
    int age = 21;
    String country = "Nepal";
    String sport = "Cricket";
    int hours = 2;
    String game = "free-fire";
    String subject = "Math";
    char grade = 'A';

    System.out.println("My name is " +name+".  I'm " +age+ " years old, and I'm from " +country+ ". My favorite sport is "+sport+ ". I play for "+ hours+ " hour(s) a day. When I'm tired, I like to play " +game+ ".In school, my favourite subject was " +subject+ ". I scored a " + grade + ".");
   }
}
