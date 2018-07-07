package MusicShop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp(){
        guitar= new Guitar(20.50, 30.50, MaterialType.WOOD, GroupType.STRING, 6, 1 );
    }

    @Test
    public void canPlay() {
        assertEquals("Guitar Noise", guitar.play());
    }

    @Test
    public void canGetAmountOfStrings() {
        assertEquals(6, guitar.getAmountOfStrings());
    }

    @Test
    public void setAmountOfStrings() {
        guitar.setAmountOfStrings(3);
        assertEquals(3, guitar.getAmountOfStrings());
    }
    

    @Test
    public void canGetMaterialType() {
        assertEquals(MaterialType.WOOD, guitar.getMaterialType());
    }



    @Test
    public void canGetGroupType() {
        assertEquals(GroupType.STRING, guitar.getGroupType());
    }

    @Test
    public void canSetGroupType() {
        guitar.setGroupType(GroupType.PERCUSSION);
        assertEquals(GroupType.PERCUSSION, guitar.getGroupType());
    }

    @Test
    public void canSetMaterialType() {
        guitar.setMaterialType(MaterialType.NICKEL);
        assertEquals(MaterialType.NICKEL, guitar.getMaterialType());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(10.00, guitar.calculateMarkup(), 0.01);
    }

    @Test
    public void canGetCostPrice() {
        assertEquals(20.50, guitar.getCostPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(30.50, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void canSetCostPrice() {
        guitar.setCostPrice(40.00);
        assertEquals(40.00, guitar.getCostPrice(), 0.01);
    }

    @Test
    public void canSetSellPrice() {
        guitar.setSellPrice(40.00);
        assertEquals(40.00, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void canGetItemId(){
        assertEquals(1, guitar.getItemId());
    }

    @Test
    public void canSetItemId(){
        guitar.setItemId(40);
        assertEquals(40, guitar.getItemId());
    }


}