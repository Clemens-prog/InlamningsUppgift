package TestAutoOchProg.OversatEnskildaBok;

import java.util.HashMap;

public class Oversattare {
    private char alfabet[] = {'A','B','C','D','E','F','G','H','I','J','K','L',
            'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private String morsekod[] = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
    HashMap<Character,String> bokTilMor = new HashMap<>();
    HashMap<String,Character> morTilbok = new HashMap<>();
    public Oversattare() {
        for(int i = 0; i < alfabet.length; i++)
        {
            bokTilMor.put(alfabet[i],morsekod[i]);
            morTilbok.put(morsekod[i],alfabet[i]);
        }
    }
    public String bokTilMor(char ch)
    {
        String mor = bokTilMor.get(ch);
        return mor;
    }
   public char morTilbok(String str)
   {
       char bok = morTilbok.get(str);
       return bok;
   }
}