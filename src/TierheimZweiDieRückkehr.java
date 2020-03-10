public class TierheimZweiDieRückkehr {

    //FERTIG MACHEN

    public static void main(String[] arg) {

        System.out.println("Willkommen im glücklichen Tierheim 2 - die Rückkehr");

        // Hund Lessie - 20kg - spielfreudig, löst Kriminalfälle, soll gefüttert werden

        double futterlessie = berechneFuttermenge(20);
        System.out.println("Lessie bekommt " + futterlessie + " kg Futter.");
    }


    public static double berechneFuttermenge(double Lessiegewicht){
        double mengefutterlessie;

        mengefutterlessie = Lessiegewicht / 20;


return mengefutterlessie;
    }
}