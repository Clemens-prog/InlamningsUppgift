package TestAutoOchProg.OversatEnskildaBok.testMedFelHantFinSkriven3_2;

import java.util.Scanner;

public class OversatProgTestMedFelHantFin3_2 {
    static void main(String[] args) {
        OversattareTestMedFelHantFin3_2 oversattare = new OversattareTestMedFelHantFin3_2();
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in ett ord:");
        String ordIn = scan.nextLine();
        String mor = oversattare.ordBokTilMorCheck(ordIn);


        System.out.println("Den inskrivna ordets morseskod " + mor);

        System.out.println("Skriv in ett morsekodsord:");
        String morIn = scan.nextLine();
        String ord = oversattare.ordMorTilbokCheck(morIn);
        System.out.println("Den inskrivna morsekodens ordet " + ord);
    }
}