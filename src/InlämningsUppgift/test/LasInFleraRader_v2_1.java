package InlämningsUppgift.test;

import java.util.Scanner;

public class LasInFleraRader_v2_1 {
    static void main(String[] args) {
        System.out.println("Skriv in rader avsluta med stop");
        Scanner scan = new Scanner(System.in);
        //String rad1 = scan.nextLine();
        //String rad2 = scan.nextLine();
        String rad = "";
        String helatexten = "";
        int i = 0;//Antal rader
        int ord = 0; //Antal ord
        int lokalOrd = 0;
        String[] ordIMening;
        boolean stopIMening = false;

        while(!rad.equals("stop"))
        {
            rad = scan.nextLine().trim();
            /*while(rad)
            {
                ordIMening = rad.split(" ");
                ordIMening.length
            }*/
            ordIMening = rad.split(" ");
            lokalOrd = 0;
            for (String s : ordIMening) {
                System.out.println(s);
                if(!s.equals("stop"))
                {
                    ord++;
                    lokalOrd++;
                }
                else if(s.equals("stop") && lokalOrd > 0)
                {
                    stopIMening = true;
                    break;
                }
                else if(s.equals("stop"))
                {
                    break;
                }
            }

            helatexten = helatexten + "\n" + rad;
            /*if(!s.equals("stop"))
                i++;
            else if (s.equals("stop") && stopIMening)
                i++;*/

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