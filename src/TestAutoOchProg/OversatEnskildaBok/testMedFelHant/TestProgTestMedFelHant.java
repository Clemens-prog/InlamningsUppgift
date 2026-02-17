package TestAutoOchProg.OversatEnskildaBok.testMedFelHant;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
public class TestProgTestMedFelHant {
    OversattareTestMedFelHant oversattareTest = new OversattareTestMedFelHant();
    @Test
    public void testaOrdTillMorskod()
    {
        //Arrange
        String ord = "HEJ";
        //Act
        String morskod = oversattareTest.ordBokTilMor(ord);
        //Assert
        //String expected = ".... . .--- ";
        String expected = ".... . .--- ";
                String actual = morskod;
        assertEquals(expected,actual);
    }

    @Test
    public void testaOrdMorTilbok()
    {
        //Arrange
        String ord = ".... . .--- ";
        //Act
        String morskod = oversattareTest.ordMorTilbok(ord);
        //Assert
        //String expected = ".... . .--- ";
        String expected = "HEJ";
        String actual = morskod;
        assertEquals(expected,actual);
    }

    @Test
    public void testaOrdTillMorsTillOrd()
    {
        //Arrange
        String ord = "HIHOWAREYOU";
        //Act
        String morskod = oversattareTest.ordBokTilMor(ord);
        String mening = oversattareTest.ordMorTilbok(morskod);
        //Assert
        //String expected = ".... . .--- ";
        String expected = "HIHOWAREYOU";
        String actual = mening;
        assertEquals(expected,actual);
    }

    @Test
    public void negativtTestaOrdTillMorskod()
    {
        //Arrange
        String ord = "@";
        //Act
        String morskod = oversattareTest.ordBokTilMor(ord);
        //Assert
        //String expected = ".... . .--- ";
        String expected = null + " ";
        String actual = morskod;
        assertEquals(expected,actual);
    }

    @Test
    public void negativtTestaOrdMorTilbok()
    {
        //Arrange
        String ord = "A";
        //Act
        String morskod = oversattareTest.ordMorTilbok(ord);
        //Assert
        //String expected = ".... . .--- ";
        String expected = "0";
        String actual = morskod;
        assertEquals(expected,actual);
    }
   /* @Test
    public void testaOrdMorTilbokMedFelHantering()
    {
        //Arrange
        String ord = "A";
        //Act
        try {
            String morskod = oversattareTest.ordMorTilbok(ord);
        }
        catch (NullPointerException e) {
        //throw new RuntimeException(e);
        System.out.println("Skriv in en moresekod");
        }
        catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println("Skriv in en moresekod");
        }
        //Assert
        //String expected = ".... . .--- ";
        String expected = "HEJ";
        String actual = morskod;
        assertEquals(expected,actual);
    }*/
}