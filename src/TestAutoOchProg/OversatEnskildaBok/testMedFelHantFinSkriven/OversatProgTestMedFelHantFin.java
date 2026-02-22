package TestAutoOchProg.OversatEnskildaBok.testMedFelHantFinSkriven;

import java.util.Scanner;

public class OversatProgTestMedFelHantFin {
    static void main(String[] args) {
        OversattareTestMedFelHantFin oversattare = new OversattareTestMedFelHantFin();
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in ett ord:");
        String ordIn = scan.nextLine();
        String mor = oversattare.ordBokTilMor(ordIn);
        //Kontrollera att det översatta ordet blir morsekod
        //dvs att det ursprungliga bokstäverna är A-Z
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
        //Titta så att det översatta ordet från morsekod
        //är A-Z
        while(!ord.matches("[A-Z]")) {
            System.out.println("Skriv in morsekod");
            morIn = scan.nextLine();
            ord = oversattare.ordMorTilbok(morIn);
        }

        System.out.println("Den inskrivna morsekodens ordet " + ord);
    }
}