package InlämningsUppgift.test.finskrivProgrammet_v3_5;
//Klassen håller reda på antalet rader, ord och tecken som texten har, samt det längsta ordet
public class RaknarRaderOchHarKollPaAntaletTeckenStop_v3_5 {
    private String heltext;
    private String rad;
    private int antalCharacter = 0;
    private int totaltAntalCharacter = 0;
    private int antalOrd = 0;
    String[] ordIMening;
    private int antalRader = 0;
    private String langstaOrdet = "";
    public RaknarRaderOchHarKollPaAntaletTeckenStop_v3_5()
    {
        int antalCharacter = 0;
    }
    public void setAntalRaderOchTecken (String heltext)
    {
        this.heltext = heltext;

    }
    //Metoden tar in en rad text men anropas flera gånger tills ordet stop
    // och gör det som står uppe vid klassen
    public boolean setMening(String rad)
    {
        if(!rad.equals("stop"))
        {
            ordIMening = rad.split(" ");
            for (String s : ordIMening) {
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
}