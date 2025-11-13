package InlämningsUppgift.test.finskrivProgrammet_v3_5;

import java.util.Scanner;
//Ett program som man skriver in meningar i rader och avsluta med raden stop.
//Programmet ger som output ut antalet rader, ord, tecken och det längsta ordet.

//Klassen skapar ett objekt av logik klassen sen ger den instruktion till användaren att skriva in rader text och
//avsluta med ordet stop på en rad.
//Hela texten skrivs ut samt antal rader, ord och tecken, samt det längsta ordet
public class LaserInTextSkriverUtResultatMain_v3_5 {
    static void main(String[] args) {
        RaknarRaderOchHarKollPaAntaletTeckenStop_v3_5 raknarObj = new RaknarRaderOchHarKollPaAntaletTeckenStop_v3_5();
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
        System.out.println("Det här är hela texten: " + helatexten);
        System.out.println("Antal rader " + raknarObj.getAntalRader() + "\n" +
                            "Antal ord " + raknarObj.getAntalOrd() + "\n" +
                            "Langsta ordet " + raknarObj.getLangstaOrdet() + "\n" +
                           "antal tecken " + raknarObj.getAntalTecken());
    }
}