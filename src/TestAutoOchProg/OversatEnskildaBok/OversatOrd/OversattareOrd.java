package TestAutoOchProg.OversatEnskildaBok.OversatOrd;

import java.util.HashMap;

public class OversattareOrd {
    private char alfabet[] = {'A','B','C','D','E','F','G','H','I','J','K','L',
            'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private String morsekod[] = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
    HashMap<Character,String> bokTilMor = new HashMap<>();
    HashMap<String,Character> morTilbok = new HashMap<>();
    public OversattareOrd() {
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
            /*for (int i = 0; i < bokMors.length(); i++) {
                bokMors = bokMors + morTilbok(bokMors) + " ";
            }
            */
            bok = morTilbok(bokMors);
            ord = ord + bok;
            //meningMors = meningMors + bokMors;


        }
        return ord;
    }
   private char morTilbok(String str)
   {
       char bok = morTilbok.get(str);
       return bok;
   }
}