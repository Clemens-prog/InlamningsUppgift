package TestAutoOchProg.OversatEnskildaBok.testMedFelHant2;

import java.util.Scanner;

public class OversatProgTestMedFelHant2 {
    static void main(String[] args) {
        OversattareTestMedFelHant2 oversattare = new OversattareTestMedFelHant2();
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
/*
String s = String.valueOf(c);
if (!s.matches("[a-zA-Z]")) {
        // Inte en bokstav A-Z
        }

 */