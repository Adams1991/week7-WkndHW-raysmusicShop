package MusicShop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void setUp(){
        saxophone = new Saxophone(20.50, 30.50, MaterialType.BRASS, GroupType.BRASS, "Alto" );
    }

    @Test
    public void canPlay() {
        assertEquals("Sax Noise", saxophone.play());
    }

    @Test
    public void canGetSaxType() {
        assertEquals("Alto", saxophone.getSaxType());
    }

    @Test
    public void canSetSaxType() {
        saxophone.setSaxType("Soprano");
        assertEquals("Soprano", saxophone.getSaxType());
    }



}