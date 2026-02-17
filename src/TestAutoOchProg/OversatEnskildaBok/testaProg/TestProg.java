package TestAutoOchProg.OversatEnskildaBok.testaProg;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
public class TestProg {
    OversattareTest oversattareTest = new OversattareTest();
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
}