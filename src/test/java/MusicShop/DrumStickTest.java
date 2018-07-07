package MusicShop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrumStickTest {

   DrumStick drumStick;

    @Before
    public void setUp(){
        drumStick= new DrumStick(20.50, 30.50, GroupType.PERCUSSION, MaterialType.PLASTIC, 100 );
    }


    @Test
    public void canGetMaterialType() {
        assertEquals(MaterialType.PLASTIC, drumStick.getMaterialType());
    }

    @Test
    public void canSetMaterialType() {
        drumStick.setMaterialType(MaterialType.WOOD);
        assertEquals(MaterialType.WOOD, drumStick.getMaterialType());
    }

    @Test
    public void canGetGroupType() {
        assertEquals(GroupType.PERCUSSION, drumStick.getGroupType());
    }

    @Test
    public void canSetGroupType() {
        drumStick.setGroupType(GroupType.BRASSWIND);
        assertEquals(GroupType.BRASSWIND, drumStick.getGroupType());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(10.00, drumStick.calculateMarkup(), 0.01);
    }

    @Test
    public void canGetCostPrice() {
        assertEquals(20.50, drumStick.getCostPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(30.50, drumStick.getSellPrice(), 0.01);
    }

    @Test
    public void canSetCostPrice() {
        drumStick.setCostPrice(40.00);
        assertEquals(40.00, drumStick.getCostPrice(), 0.01);
    }

    @Test
    public void canSetSellPrice() {
        drumStick.setSellPrice(40.00);
        assertEquals(40.00, drumStick.getSellPrice(), 0.01);
    }

    @Test
    public void canGetItemId(){
        assertEquals(100, drumStick.getItemId());
    }

    @Test
    public void canSetItemId(){
        drumStick.setItemId(40);
        assertEquals(40, drumStick.getItemId());
    }

  
}


