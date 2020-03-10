public class ZehnterMärz {

    public static void main(String[] args) {
        berechneDauer(0.75);
        gießen(0.75);
        duengen(3);
        entfernung(3);
    }

    public static int berechneDauer(double test) {
        int dauer;

        if (test <= 0.20) {
            dauer = 5;
            System.out.println("Es wird " + dauer + " Sekunden gegossen");
        } else if (test <= 0.40) {
            dauer = 3;
            System.out.println("Es wird " + dauer + " Sekunden gegossen");
        } else if (test >= 0.40 && test <= 0.75) {
            dauer = 1;
            System.out.println("Es wird " + dauer + " Sekunden gegossen");
        } else {
            dauer = 0;
            System.out.println("Es wird " + dauer + " Sekunden gegossen");
        }
        return dauer;
    }


//nochmal, diesmal blind


    public static int gießen(double feuchtigkeit) {
        int sekunden;

        if (feuchtigkeit <= 0.20) {
            sekunden = 5;
            System.out.println(sekunden + " Sekunden");
        } else if (feuchtigkeit <= 0.40) {
            sekunden = 3;
            System.out.println(sekunden + " Sekunden");
        } else if (feuchtigkeit >= 0.40 && feuchtigkeit <= 0.75) {
            sekunden = 1;
            System.out.println(sekunden + " Sekunden");
        } else {
            sekunden = 0;
            System.out.println(sekunden + " Sekunden");
        }
        return sekunden;
    }


    public static int duengen(int pflanze) {
        int staerke;

        if (pflanze == 1) {
            staerke = 1;
            System.out.println("Die Stärke des Düngers im Wasser beträgt " + staerke + " Prozent");
        } else if (pflanze == 2) {
            staerke = 5;
            System.out.println("Die Stärke des Düngers im Wasser beträgt " + staerke + " Prozent");
        } else if (pflanze == 3) {
            staerke = 0;
            System.out.println("Die Stärke des Düngers im Wasser beträgt " + staerke + " Prozent");
        } else if (pflanze == 4) {
            staerke = 2;
            System.out.println("Die Stärke des Düngers im Wasser beträgt " + staerke + " Prozent");
        } else {
            staerke = 0;
            System.out.println("Die Stärke des Düngers im Wasser beträgt " + staerke + " Prozent");
        }
        return staerke;
    }

    // ÜBERARBEITEN!!!!!
// Beispiel 2 - Straßenbahnapp

    public static int entfernung(int haltestelle) {
        int dauerzurhaltestelle = 0;
        int baustelle = 0;

       int insgesamt = dauerzurhaltestelle + baustelle;


        if (haltestelle == 1) {
            dauerzurhaltestelle = 20;
            System.out.println("Es dauert noch " + insgesamt + " Minuten, bis du deine Haltestelle erreichst.");
        } else if (haltestelle == 2) {
            dauerzurhaltestelle = 16;
            System.out.println("Es dauert noch " + insgesamt + " Minuten, bis du deine Haltestelle erreichst.");
        } else if (haltestelle == 3) {
            dauerzurhaltestelle = 15;
            baustelle = 12;
            System.out.println("Es dauert noch " + insgesamt + " Minuten, bis du deine Haltestelle erreichst.");
        } else if (haltestelle == 4) {
            dauerzurhaltestelle = 10;
            System.out.println("Es dauert noch " + insgesamt + " Minuten, bis du deine Haltestelle erreichst.");
        } else if (haltestelle == 5) {
            dauerzurhaltestelle = 3;
            baustelle = 12;
            System.out.println("Es dauert noch " + insgesamt + " Minuten, bis du deine Haltestelle erreichst.");
        }
        else if (haltestelle == 6) {
            dauerzurhaltestelle = 0;
            System.out.println("Aussteigen!!");
        }
        else {
            System.out.println("Bitte gib eine valide Haltestelle ein (1-6)");
        }
        return insgesamt;
    }

}

