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
    public void play() {
    }

    @Test
    public void getSaxType() {
    }

    @Test
    public void setSaxType() {
    }



}