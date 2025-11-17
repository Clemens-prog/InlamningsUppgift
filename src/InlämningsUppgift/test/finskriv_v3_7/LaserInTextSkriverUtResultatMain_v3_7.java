package InlämningsUppgift.test.finskriv_v3_7;

import java.util.Arrays;
import java.util.Scanner;
//Ett program som man skriver in meningar i rader och avsluta med raden stop.
//Programmet ger som output ut antalet rader, ord, tecken och det längsta ordet.

//Klassen skapar ett objekt av logik klassen sen ger den instruktion till användaren att skriva in rader text och
//avsluta med ordet stop på en rad.
//Hela texten skrivs ut samt antal rader, ord och tecken, samt det längsta ordet
public class LaserInTextSkriverUtResultatMain_v3_7 {
    static void main(String[] args) {
        RaknarRaderOchHarKollPaAntaletTeckenStop_v3_7 raknarObj = new RaknarRaderOchHarKollPaAntaletTeckenStop_v3_7();
        System.out.println("Skriv in rader avsluta med stop");
        Scanner scan = new Scanner(System.in);
        String rad = "";
        String helatexten = "";
        String helatextenEnRad = "";
        rad = scan.nextLine();
        while(raknarObj.setMening(rad))
        {
            helatexten = helatexten + "\n" + rad;
            helatextenEnRad = helatextenEnRad + " " + rad;
            rad = scan.nextLine();
        }
        //Ta ut längden av det längsta ordet wordLength
       int wordLength = raknarObj.taUtLängdenAvDetLängstaOrdet (helatextenEnRad);
        /**String[] words = null;
        int wordLength = 0;
           words = helatextenEnRad.split(" ");
            for(int j = 0; j < words.length; j++)
            {
                if(wordLength < words[j].trim().length())
                {
                    wordLength = words[j].trim().length();
                }
            }*/

        //Räkna hur många ord det är
        String[] längstaOrden = raknarObj.räknaHurMångaOrdDetÄr(helatextenEnRad,wordLength);
       /** int hurMångaLängstaOrd = 0;
        String[] words = null;
            words = helatextenEnRad.split(" ");
            for(int j = 0; j < words.length; j++)
            {
                if(wordLength == words[j].trim().length())
                    hurMångaLängstaOrd++;
            }

        String[] längstaOrd = new String[hurMångaLängstaOrd];
        //Ta ut alla ord som har den längden och
        int k = 0;
            words = helatextenEnRad.split(" ");
            for(int j = 0; j < words.length; j++)
            {
                if(wordLength == words[j].trim().length())
                {
                    längstaOrd[k] = words[j];
                    k++;
                }
            }*/

        System.out.println("Det här är hela texten: " + helatexten);
        System.out.println("Antal rader " + raknarObj.getAntalRader() + "\n" +
                            "Antal ord " + raknarObj.getAntalOrd() + "\n" +
                            "Langsta orden " + Arrays.toString(längstaOrden) + "\n" +
                           "antal tecken " + raknarObj.getAntalTecken());
    }
}