package InlämningsUppgift.test.LaggInTest_3_4;

public class RaknarRaderOchHarKollPaAntaletTeckenStop_v3_4 {
    private String heltext;
    private String rad;
    private int antalCharacter = 0;
    private int totaltAntalCharacter = 0;
    private int antalRader = 0;
    public RaknarRaderOchHarKollPaAntaletTeckenStop_v3_4()
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
