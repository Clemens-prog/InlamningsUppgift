package TestAutoOchProg.OversatEnskildaBok.testMedFelHantFinSkriven3_1;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
public class TestProgTestMedFelHantFin3_1 {
    OversattareTestMedFelHantFin3_1 oversattareTest = new OversattareTestMedFelHantFin3_1();
    @Test
    public void testaOrdTillMorskod()
    {
        //Arrange
        String ord = "HEJ";
        //Act
        String morskod = oversattareTest.ordBokTilMorCheck(ord);
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
        String morskod = oversattareTest.ordMorTilbokCheck(ord);
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
        String morskod = oversattareTest.ordBokTilMorCheck(ord);
        String mening = oversattareTest.ordMorTilbokCheck(morskod);
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
        String morskod = oversattareTest.ordBokTilMorCheck(ord);
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
        String morskod = oversattareTest.ordMorTilbokCheck(ord);
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