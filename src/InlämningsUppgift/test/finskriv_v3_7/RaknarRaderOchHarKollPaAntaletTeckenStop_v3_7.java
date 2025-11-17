package InlämningsUppgift.test.finskriv_v3_7;
//Klassen håller reda på antalet rader, ord och tecken som texten har, samt det längsta ordet
public class RaknarRaderOchHarKollPaAntaletTeckenStop_v3_7 {
    private String heltext;
    private String rad;
    private int antalCharacter = 0;
    private int totaltAntalCharacter = 0;
    private int antalOrd = 0;
    String[] ordIMening;
    private int antalRader = 0;
    private String langstaOrdet = "";
    public RaknarRaderOchHarKollPaAntaletTeckenStop_v3_7()
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

    //Lägg över funktioner från här
    public int taUtLängdenAvDetLängstaOrdet (String helatextenEnRad)
    {
        String[] words = null;
        int wordLength = 0;
        words = helatextenEnRad.split(" ");
        for(int j = 0; j < words.length; j++)
        {
            if(wordLength < words[j].trim().length())
            {
                wordLength = words[j].trim().length();
            }
        }
        return wordLength;
    }

    //Räkna hur många ord det är
    public String[] räknaHurMångaOrdDetÄr(String helatextenEnRad,int wordLength)
    {
        int hurMångaLängstaOrd = 0;
        String[] words = null;
        words = helatextenEnRad.split(" ");
        for(int j = 0; j < words.length; j++)
        {
            if(wordLength == words[j].trim().length())
                hurMångaLängstaOrd++;
        }

        String[] längstaOrden = new String[hurMångaLängstaOrd];
        //Ta ut alla ord som har den längden och
        int k = 0;
        words = helatextenEnRad.split(" ");
        for(int j = 0; j < words.length; j++)
        {
            if(wordLength == words[j].trim().length())
            {
                längstaOrden[k] = words[j];
                k++;
            }
        }
        return längstaOrden;
    }

}