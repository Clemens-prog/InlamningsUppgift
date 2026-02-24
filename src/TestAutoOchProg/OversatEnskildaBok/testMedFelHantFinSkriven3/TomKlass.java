package TestAutoOchProg.OversatEnskildaBok.testMedFelHantFinSkriven3;

public class TomKlass {
    //Kontrollera att det översatta ordet blir morsekod
    //dvs att det ursprungliga bokstäverna är A-Z
    /*public String ordBokTilMor(String str)
    {
        //char bokstav;
        String ord = "";
        for(int i = 0; i < str.length(); i++)
        {
            ord = ord + bokTilMor(str.charAt(i)) + " ";
        }

        while(!(ord.contains(".") || ord.contains("_")))
        {
            System.out.println("Skriv om ordet med stora bokstäver A - Z");
            ordIn = scan.nextLine();
            ord = ordBokTilMor(ordIn);
        }
        return ord;
    }*/


   /* //Kontrollera att det översatta ordet blir morsekod
    //dvs att det ursprungliga bokstäverna är A-Z
    public String ordBokTilMorCheck(String ordIn)
    {
        String mor = ordBokTilMor(ordIn);
        while(!(mor.contains(".") || mor.contains("_")))
        {
            System.out.println("Skriv om ordet med stora bokstäver A - Z");
            ordIn = scan.nextLine();
            mor = oversattare.ordBokTilMor(ordIn);
        }
        return mor;
    }*/


















}
