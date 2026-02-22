package TestAutoOchProg.OversatEnskildaBok.testMedFelHantFinSkriven2;

import java.util.Scanner;

public class OversatProgTestMedFelHantFin2 {
    static void main(String[] args) {
        OversattareTestMedFelHantFin2 oversattare = new OversattareTestMedFelHantFin2();
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