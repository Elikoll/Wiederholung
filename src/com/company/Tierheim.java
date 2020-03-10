package com.company;

public class Tierheim {
    public static void main(String[] args) {
        System.out.println("Willkommen im glücklichen Tierheim!");

        // Hund Lessie - 20kg - spielfreudig, löst Kriminalfälle

        double futterLessie;
        double ge = 20;

        futterLessie = berechneFuttermenge(ge);
        System.out.println("Lessie bekommt " + futterLessie + "kg Futter");

        //unterschiedliche Varianten um das Gewicht um 1 kg zu erhöhen

        double x;
        x = ++ge;
        System.out.printf( x + " " + ge);

        futterLessie = berechneFuttermenge(ge);
        System.out.println("Lessie bekommt am Abend " + futterLessie + "kg Futter");
    }
    public static double berechneFuttermenge(double gewicht){
        double futterMenge;

        futterMenge = gewicht / 20;
        return futterMenge;
    }
}
