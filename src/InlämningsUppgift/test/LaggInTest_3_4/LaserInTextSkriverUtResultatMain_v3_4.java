package InlämningsUppgift.test.LaggInTest_3_4;

import java.util.Scanner;

public class LaserInTextSkriverUtResultatMain_v3_4 {
    static void main(String[] args) {
        RaknarRaderOchHarKollPaAntaletTeckenStop_v3_4 raknarObj = new RaknarRaderOchHarKollPaAntaletTeckenStop_v3_4();
        System.out.println("Skriv in rader avsluta med stop");
        Scanner scan = new Scanner(System.in);
        //String rad1 = scan.nextLine();
        //String rad2 = scan.nextLine();
        String rad = "";
        String helatexten = "";
        int antalRader = 0;
        int ord = 0;
        String[] ordIMening;
        int antalCharacter = 0;
        int totaltAntalCharacter = 0;
        rad = scan.nextLine();
        while(raknarObj.setMening(rad))
        {

            //antalCharacter = rad.length();



            //totaltAntalCharacter = totaltAntalCharacter + antalCharacter;
            /*while(rad)
            {
                ordIMening = rad.split(" ");
                ordIMening.length
            }*/
            //ordIMening = rad.split(" ");
            /*for (String s : ordIMening) {
                System.out.println(s);
                ord++;
            }*/

            helatexten = helatexten + "\n" + rad;
            //antalRader++;
            //System.out.println("Du har skrivit in rad nr: " + antalRader + " " + rad);
            rad = scan.nextLine();
            //raknarObj.setMening(rad);
        }

        //System.out.println("Du har skrivit in rad1: " + rad1);
        //System.out.println("Du har skrivit in rad2: " + rad2);
        System.out.println("Det här är hela texten: " + helatexten);
        System.out.println("Antal rader" + raknarObj.getAntalRader() + "\n" +
                           "antal tecken " + raknarObj.getAntalTecken());
        //while ()
    }
}