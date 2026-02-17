package TestAutoOchProg.OversatEnskildaBok.OversatOrd;

import java.util.Scanner;

public class OversatProgOrd {
    static void main(String[] args) {
        OversattareOrd oversattare = new OversattareOrd();
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in ett ord:");
        String ordIn = scan.nextLine();
        String mor = oversattare.ordBokTilMor(ordIn);
        System.out.println("Den inskrivna ordets morseskod " + mor);

        System.out.println("Skriv in ett morsekodsord:");
        String morIn = scan.nextLine();
        String ord = oversattare.ordMorTilbok(morIn);
        System.out.println("Den inskrivna morsekodens ordet " + ord);

    }
}