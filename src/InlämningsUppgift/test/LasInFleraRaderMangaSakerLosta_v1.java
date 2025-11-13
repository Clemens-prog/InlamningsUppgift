package InlämningsUppgift.test;

import java.util.Scanner;

public class LasInFleraRaderMangaSakerLosta_v1 {
    static void main(String[] args) {
        System.out.println("Skriv in rader avsluta med stop");
        Scanner scan = new Scanner(System.in);
        //String rad1 = scan.nextLine();
        //String rad2 = scan.nextLine();
        String rad = "";
        String helatexten = "";
        int i = 0;
        int ord = 0;
        String[] ordIMening;

        while(!rad.equals("stop"))
        {
            rad = scan.nextLine();
            /*while(rad)
            {
                ordIMening = rad.split(" ");
                ordIMening.length
            }*/
            ordIMening = rad.split(" ");
            for (String s : ordIMening) {
                System.out.println(s);
                ord++;
            }

            helatexten = helatexten + "\n" + rad;
            i++;
            System.out.println("Du har skrivit in rad nr: " + i + " " + rad);
        }
        //System.out.println("Du har skrivit in rad1: " + rad1);
        //System.out.println("Du har skrivit in rad2: " + rad2);
        System.out.println("Det här är hela texten: " + helatexten);
        System.out.println("Antal rader" + i + "\n" +
                           "antal ord " + ord);
        //while ()
    }
}