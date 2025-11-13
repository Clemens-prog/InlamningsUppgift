package InlämningsUppgift;

import java.util.Scanner;

public class SkrivInSkrivUtTextMain {
    static void main(String[] args) {
        System.out.println("Skriv meningar i ett antal rader, avsluta med stop:");
        Scanner scan = new Scanner(System.in);

        String word = "";
        String mening = "";
        String[] uppDeladMening = null;
        int wordCount = 0;
        int lineCount = 0;

        while(!word.equals("stop"))
        {
            if(scan.hasNextLine()) {
                mening = scan.nextLine();
                lineCount++;
            }
            uppDeladMening = mening.split(" ");

            for(String s : uppDeladMening)
            {
                if(word.equals("stop"))
                    break;
                wordCount ++;
            }
           // while(scan.hasNext())
           /* while(scan.hasNext())
           {
               //word = scan.next();
                if(scan.hasNext())
                {
                    word = scan.next();
                    wordCount++;
                }

           }*/
        }
        System.out.println("Antal rader " + lineCount + "\n" +
                           "Antal ord " + wordCount);
    }
}
