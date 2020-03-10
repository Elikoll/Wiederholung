public class Beispiel0 {
public static void main(String[] args) {

    //Beispiel 0.a
    byte schalter = 0;

    if (schalter > 1.0) {

        System.out.println("Licht an");
    } else {
        System.out.println("Licht aus");
    }

    // 0.b

    if (schalter == 1) {
        System.out.println("Licht an");
    } else {
        System.out.println("Licht aus");
    }

    //Beispiel 0.c

    double flugweite = 110;

    if (flugweite > 198.7) {
        System.out.println("Gold");
    } else if (flugweite > 197.1) {
        System.out.println("Silber");
    } else if (flugweite > 195) {
        System.out.println("Bronze");
    } else if (flugweite > 193.67) {
        System.out.println("Blech");
    } else if (flugweite >= 100 && flugweite <= 150) {
        System.out.println("Ausgeschieden");
    }
    if (flugweite >= 100 && flugweite <= 150) {
        System.out.println("Hilfe!");
    }
    // Beispiel 0.d

    int gang = 2;
    double speed = 0.0;

    if (gang == 1) {
        speed = 10.0;
    } else if (gang == 2) {
        speed = 20.0;
    } else if (gang == 3) {
        speed = 30.0;
    } else if (gang == 4) {
        speed = 40.0;
    }
    System.out.println(speed);

        switch (gang) {
            case 1:
                speed = 10.0;
                break;
            case 2:
                speed = 20.0;
                break;
            case 3:
                speed = 30.0;
                break;
            case 4:
                speed = 40.0;
                break;
        }

    }
}