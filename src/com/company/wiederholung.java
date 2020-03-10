package com.company;

public class wiederholung {

    public static void main(String[] args) {
        int alter = 14;

        if (alter >= 18) {

            System.out.println("Yaay, ich darf hinein!");
        } else if (alter >= 16) {
            System.out.println("Yay ich darf hinein, aber nur mit Wein");
        } else {
            System.out.println("gehe zwischenzeitlich Pizza essen");
        }
        System.out.println("Warte gelangweilt im Auto");

        //Beispiel für einen Switch

        int note = 2, stipendium = 0;

        //Berechne Förderstipendium
        switch (note) {
            case 1:
                //hier steht der Code der ausgeführt wird, wenn ich eine Eins bekomme
                stipendium = 100;
                break;
            case 2:
                stipendium = 50;
                break;
            case 3:
                stipendium = 30;
                break;
            default:
                stipendium = 10;
                break;
        }
        System.out.println("Stipendium: " + stipendium + "€");

        //hier als if else Beispiel lösen!
        note = 4;
        if (note == 1) {
            stipendium = 100;
        }
            else if (note == 2){
                stipendium = 50;
        }
            else if (note == 3) {
                stipendium = 30;
        }
            else if (note == 4) {
                stipendium = 10;
        }
    System.out.println("Du erhältst " + stipendium + "€");
    }
}

