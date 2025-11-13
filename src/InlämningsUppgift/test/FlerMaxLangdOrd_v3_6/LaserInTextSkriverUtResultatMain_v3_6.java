package InlämningsUppgift.test.FlerMaxLangdOrd_v3_6;

import java.util.Arrays;
import java.util.Scanner;
//Ett program som man skriver in meningar i rader och avsluta med raden stop.
//Programmet ger som output ut antalet rader, ord, tecken och det längsta ordet.

//Klassen skapar ett objekt av logik klassen sen ger den instruktion till användaren att skriva in rader text och
//avsluta med ordet stop på en rad.
//Hela texten skrivs ut samt antal rader, ord och tecken, samt det längsta ordet
public class LaserInTextSkriverUtResultatMain_v3_6 {
    static void main(String[] args) {
        RaknarRaderOchHarKollPaAntaletTeckenStop_v3_6 raknarObj = new RaknarRaderOchHarKollPaAntaletTeckenStop_v3_6();
        System.out.println("Skriv in rader avsluta med stop");
        Scanner scan = new Scanner(System.in);
        String rad = "";
        String helatexten = "";

        rad = scan.nextLine();
        while(raknarObj.setMening(rad))
        {
            helatexten = helatexten + "\n" + rad;
            rad = scan.nextLine();
        }
        //Ta ut längden av det längsta ordet wordLength
        String[] lines = helatexten.split(System.getProperty("line.separator"));
        String[] words = null;
        int wordLength = 0;
        for(int i = 0; i < lines.length; i++)
        {
            words = lines[i].split(" ");
            System.out.println("Words " + Arrays.toString(words));
            for(int j = 0; j < words.length; j++)
            {
                System.out.println("words[j] " + words[j]);
                if(wordLength < words[j].trim().length())
                {
                    wordLength = words[j].trim().length();
                    System.out.println("if words[j] " + words[j]);
                }

            }
        }

        System.out.println("Längsta ordet " + wordLength);
        //Räkna hur många ord det är

        //String[] lines = helatexten.split(System.getProperty("line.separator"));
        //String[] words = null;
        //int wordLength = 0;
        int hurMångaLängstaOrd = 0;
        for(int i = 0; i < lines.length; i++)
        {
            words = lines[i].split(" ");
            for(int j = 0; j < words.length; j++)
            {
                if(wordLength == words[j].trim().length())
                    hurMångaLängstaOrd++;
            }
        }

        String[] längstaOrd = new String[hurMångaLängstaOrd];
        //Ta ut alla ord som har den längden och
        int k = 0;
        for(int i = 0; i < lines.length; i++)
        {
            words = lines[i].split(" ");
            for(int j = 0; j < words.length; j++)
            {
                if(wordLength == words[j].trim().length())
                {
                    längstaOrd[k] = words[j];
                    k++;
                }

            }
        }


        System.out.println("Det här är hela texten: " + helatexten);
        System.out.println("Antal rader " + raknarObj.getAntalRader() + "\n" +
                            "Antal ord " + raknarObj.getAntalOrd() + "\n" +
                            "Langsta orden " + Arrays.toString(längstaOrd) + "\n" +
                           "antal tecken " + raknarObj.getAntalTecken());
    }
}