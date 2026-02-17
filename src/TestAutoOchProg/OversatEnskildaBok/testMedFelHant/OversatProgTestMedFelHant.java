package TestAutoOchProg.OversatEnskildaBok.testMedFelHant;

import java.util.Scanner;

public class OversatProgTestMedFelHant {
    static void main(String[] args) {
        OversattareTestMedFelHant oversattare = new OversattareTestMedFelHant();
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in ett ord:");
        String ordIn = scan.nextLine();
        String mor = oversattare.ordBokTilMor(ordIn);
        /*if(mor.trim() == null)
        {
            System.out.println("Skriv in en giltig bokstav");
        }*/
        //while(mor.equals(null))
        while(!(mor.contains(".") || mor.contains("_")))
        {
            System.out.println("Skriv om ordet med stora bokstäver A - Z");
            ordIn = scan.nextLine();
            mor = oversattare.ordBokTilMor(ordIn);
        }

        System.out.println("Den inskrivna ordets morseskod " + mor);

        System.out.println("Skriv in ett morsekodsord:");
        String morIn = scan.nextLine();
        String ord = oversattare.ordMorTilbok(morIn);

        while(!ord.matches("[A-Z]")) {
            System.out.println("Skriv in morsekod");
            morIn = scan.nextLine();
            ord = oversattare.ordMorTilbok(morIn);
        }

        System.out.println("Den inskrivna morsekodens ordet " + ord);
    }
}
/*
String s = String.valueOf(c);
if (!s.matches("[a-zA-Z]")) {
        // Inte en bokstav A-Z
        }

 */