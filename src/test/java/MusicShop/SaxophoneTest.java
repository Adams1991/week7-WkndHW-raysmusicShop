package MusicShop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void setUp(){
         saxophone= new Saxophone(20.50, 30.50, MaterialType.BRASS, GroupType.BRASSWIND, "Alto" );
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
    public void canSetSaxType() { saxophone.setSaxType("Soprano");
        assertEquals("Soprano", saxophone.getSaxType());
    }

    @Test
    public void canGetMaterialType() {
        assertEquals(MaterialType.BRASS, saxophone.getMaterialType());
    }

    @Test
    public void canGetGroupType() {
        assertEquals(GroupType.BRASSWIND, saxophone.getGroupType());
    }

    @Test
    public void canSetGroupType() {
        saxophone.setGroupType(GroupType.PERCUSSION);
        assertEquals(GroupType.PERCUSSION, saxophone.getGroupType());
    }

    @Test
    public void canSetMaterialType() {
        saxophone.setMaterialType(MaterialType.NICKEL);
        assertEquals(MaterialType.NICKEL, saxophone.getMaterialType());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(10.00, saxophone.calculateMarkup(), 0.01);

    }

    @Test
    public void canGetCostPrice() {
    }

    @Test
    public void canGetSellPrice() {
    }

    @Test
    public void canSetCostPrice() {
    }

    @Test
    public void canSetSellPrice() {
    }



}