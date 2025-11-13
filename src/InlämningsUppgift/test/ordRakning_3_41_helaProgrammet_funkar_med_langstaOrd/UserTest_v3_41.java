package InlämningsUppgift.test.ordRakning_3_41_helaProgrammet_funkar_med_langstaOrd;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
public class UserTest_v3_41 {
    @Test
    public void testaSetMeningsMetoden()
    {
        //Arrage
        String textRad = "Hej hur mår du?";
        RaknarRaderOchHarKollPaAntaletTeckenStop_v3_41 obj = new RaknarRaderOchHarKollPaAntaletTeckenStop_v3_41();
        //Act
        boolean inteNåttStopRaden = obj.setMening(textRad);
        boolean actual = inteNåttStopRaden;
        //Assert
        boolean expected = true;
        assertEquals(actual,expected);
    }
    @Test
    public void testaRäknaAntaletRader()
    {
        //Arrage
        String textRad1 = "Hej hur mår du?";
        String textRad2 = "jag mår bra";
        String textRad3 = "Kul att höra";
        RaknarRaderOchHarKollPaAntaletTeckenStop_v3_41 obj = new RaknarRaderOchHarKollPaAntaletTeckenStop_v3_41();
        //Act
        boolean inteNåttStopRaden1 = obj.setMening(textRad1);
        boolean inteNåttStopRaden2 = obj.setMening(textRad2);
        boolean inteNåttStopRaden3 = obj.setMening(textRad3);
        boolean inteNåttStopRaden4 = obj.setMening("stop");
        int antaletRader = obj.getAntalRader();
        int actual = antaletRader;
        //Assert
        int expected = 3;
        assertEquals(actual,expected);
    }
    @Test
    public void testaRäknaAntaletTecken()
    {
        //Arrage
        String textRad1 = "Hej hur mår du?";
        String textRad2 = "jag mår bra";
        String textRad3 = "Kul att höra";
        RaknarRaderOchHarKollPaAntaletTeckenStop_v3_41 obj = new RaknarRaderOchHarKollPaAntaletTeckenStop_v3_41();
        //Act
        boolean inteNåttStopRaden1 = obj.setMening(textRad1);
        boolean inteNåttStopRaden2 = obj.setMening(textRad2);
        boolean inteNåttStopRaden3 = obj.setMening(textRad3);
        boolean inteNåttStopRaden4 = obj.setMening("stop");
        int antaletTecken = obj.getAntalTecken();
        int actual = antaletTecken;
        //Assert
        int expected = 38;
        assertEquals(actual,expected);
    }
}
