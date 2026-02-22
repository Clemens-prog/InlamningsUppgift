package TestAutoOchProg.OversatEnskildaBok.testMedFelHant2;

import java.util.HashMap;

public class OversattareTestMedFelHant2 {
    private char alfabet[] = {'A','B','C','D','E','F','G','H','I','J','K','L',
            'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private String morsekod[] = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
    HashMap<Character,String> bokTilMor = new HashMap<>();
    HashMap<String,Character> morTilbok = new HashMap<>();
    public OversattareTestMedFelHant2() {
        for(int i = 0; i < alfabet.length; i++)
        {
            bokTilMor.put(alfabet[i],morsekod[i]);
            morTilbok.put(morsekod[i],alfabet[i]);
        }
    }
    public String ordBokTilMor(String str)
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
    public String ordMorTilbok(String str)
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