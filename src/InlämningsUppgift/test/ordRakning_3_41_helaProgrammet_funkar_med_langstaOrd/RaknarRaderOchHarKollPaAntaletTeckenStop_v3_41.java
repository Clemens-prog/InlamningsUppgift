package InlämningsUppgift.test.ordRakning_3_41_helaProgrammet_funkar_med_langstaOrd;

public class RaknarRaderOchHarKollPaAntaletTeckenStop_v3_41 {
    private String heltext;
    private String rad;
    private int antalCharacter = 0;
    private int totaltAntalCharacter = 0;
    private int antalOrd = 0;
    String[] ordIMening;
    private int antalRader = 0;
    private String langstaOrdet = "";
    public RaknarRaderOchHarKollPaAntaletTeckenStop_v3_41()
    {
        int antalCharacter = 0;
    }
    public void setAntalRaderOchTecken (String heltext)
    {
        this.heltext = heltext;

    }
    public boolean setMening(String rad)
    {
        if(!rad.equals("stop"))
        {
            ordIMening = rad.split(" ");
            for (String s : ordIMening) {
               // System.out.println(s);
                antalOrd ++;
                if(s.length() > langstaOrdet.length())
                    langstaOrdet = s;

            }
            antalCharacter = rad.length();
            totaltAntalCharacter = totaltAntalCharacter + antalCharacter;
            antalRader++;
        }


        return !rad.equals("stop");
    }
    public int getAntalRader()
    {
        return antalRader;
    }

    public int getAntalOrd() {
        return antalOrd;
    }

    public String getLangstaOrdet() {
        return langstaOrdet;
    }

    public int getAntalTecken()
    {
        return totaltAntalCharacter;
    }
    /*public void setAntalRader()
    {

    }*/

    /*public int antalRader()
    {
        return 5;
    }*/
    /*public int antalTecken()
    {
        return 5;
    }*/
}
