package TestAutoOchProg.OversatEnskildaBok.testMedFelHantFinSkriven3;

import java.util.Scanner;

public class OversatProgTestMedFelHantFin3 {
    static void main(String[] args) {
        OversattareTestMedFelHantFin3 oversattare = new OversattareTestMedFelHantFin3();
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in ett ord:");
        String ordIn = scan.nextLine();
        String mor = oversattare.ordBokTilMorCheck(ordIn);


        System.out.println("Den inskrivna ordets morseskod " + mor);

        //Titta så att det översatta ordet från morsekod
        //är A-Z
        String morIn;
        String ord = "";
        boolean baraStoraBokstaver = false;
        int bokstavAscii;
        while(!baraStoraBokstaver) {
            System.out.println("Skriv in ett morsekodsord:");
            morIn = scan.nextLine();
            ord = oversattare.ordMorTilbok(morIn);
            baraStoraBokstaver = true;
            for(int i = 0; i < ord.length(); i++)
            {
                bokstavAscii = ord.charAt(i);
                if(bokstavAscii < 65 || bokstavAscii > 90)
                    baraStoraBokstaver = false;
            }
        }
        System.out.println("Den inskrivna morsekodens ordet " + ord);
    }
}