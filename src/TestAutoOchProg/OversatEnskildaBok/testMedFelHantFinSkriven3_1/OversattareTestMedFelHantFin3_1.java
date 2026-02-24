package TestAutoOchProg.OversatEnskildaBok.testMedFelHantFinSkriven3_1;

import java.util.HashMap;
import java.util.Scanner;

public class OversattareTestMedFelHantFin3_1 {
    private char alfabet[] = {'A','B','C','D','E','F','G','H','I','J','K','L',
            'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private String morsekod[] = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
    HashMap<Character,String> bokTilMor = new HashMap<>();
    HashMap<String,Character> morTilbok = new HashMap<>();
    Scanner scan = new Scanner(System.in);
    public OversattareTestMedFelHantFin3_1() {
        for(int i = 0; i < alfabet.length; i++)
        {
            bokTilMor.put(alfabet[i],morsekod[i]);
            morTilbok.put(morsekod[i],alfabet[i]);
        }
    }
    //Kontrollera att det översatta ordet blir morsekod
    //dvs att det ursprungliga bokstäverna är A-Z
    public String ordBokTilMorCheck(String ordIn)
    {
        String mor = ordBokTilMor(ordIn);
        while(!(mor.contains(".") || mor.contains("_")))
        {
            System.out.println("Skriv om ordet med stora bokstäver A - Z");
            ordIn = scan.nextLine();
            mor = ordBokTilMor(ordIn);
        }
        return mor;
    }

    private String ordBokTilMor(String str)
    {
        //char bokstav;
        String ord = "";
        for(int i = 0; i < str.length(); i++)
        {
            ord = ord + bokTilMor(str.charAt(i)) + " ";
        }

        return ord;
    }
    private String bokTilMor(char ch)
    {
        String mor = bokTilMor.get(ch);
        return mor;
    }

    public String ordMorTilbokCheck(String morIn)
    {
        //Titta så att det översatta ordet från morsekod
        //är A-Z
        //String morIn;
        String ord = "";
        boolean baraStoraBokstaver = false;
        int bokstavAscii;
        while(!baraStoraBokstaver) {


            ord = ordMorTilbok(morIn);
            baraStoraBokstaver = true;
            for(int i = 0; i < ord.length(); i++)
            {
                bokstavAscii = ord.charAt(i);
                if(bokstavAscii < 65 || bokstavAscii > 90) {
                    baraStoraBokstaver = false;
                    System.out.println("Skriv in ett korrekt morsekodsord:");
                    morIn = scan.nextLine();
                }
            }

        }
        return ord;
    }

    private String ordMorTilbok(String str)
    {
        //String meningMors = "";
        String[] ordMors = str.split(" ");
        String bokMors = "";
        String ord ="";
        char bok;
        for (int j = 0; j < ordMors.length; j++) {
            bokMors = ordMors[j];
            try {
                bok = morTilbok(bokMors);
                ord = ord + bok;
            } catch (Exception e) {
                //throw new RuntimeException(e);
                System.out.println("Skriv in en moresekod");
            }
            //meningMors = meningMors + bokMors;
        }
        return ord;
    }
   private char morTilbok(String str)
   {
       char bok = '0';
       //char bok;
       try {
           bok = morTilbok.get(str);
           //System.out.println("bok " + bok);
       } catch (NullPointerException e) {
           System.out.println("Ej en morsekod, skriv in morse kod");
       //throw new RuntimeException(e);
   } catch (Exception e) {
           //throw new RuntimeException(e);
       }
       //System.out.println("bok " + bok);
       return bok;
   }
}