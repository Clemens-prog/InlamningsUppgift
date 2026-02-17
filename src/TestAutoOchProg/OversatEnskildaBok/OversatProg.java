package TestAutoOchProg.OversatEnskildaBok;

import java.util.Scanner;

public class OversatProg {
    static void main(String[] args) {
        Oversattare oversattare = new Oversattare();
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in en bokstav:");
        String bokstavIn = scan.nextLine();
        String mor = oversattare.bokTilMor(bokstavIn.charAt(0));
        System.out.println("Den inskrivna bokstavens morseskod " + mor);

        System.out.println("Skriv in en morsekod:");
        String morIn = scan.nextLine();
        char bokstav = oversattare.morTilbok(morIn);
        System.out.println("Den inskrivna morsekodens bokstav " + bokstav);
    }
}