package MusicShop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void setUp(){
        sheetMusic= new SheetMusic(20.50, 30.50, GroupType.BRASSWIND, "Blackbird",1 );
    }

    @Test
    public void canGetSongName(){
        assertEquals("Blackbird", sheetMusic.getSongName());
    }

    @Test
    public void canSetSongName(){
        sheetMusic.setSongName("BlaBla Blacksheep");
        assertEquals("BlaBla Blacksheep", sheetMusic.getSongName());
    }

    @Test
    public void canGetGroupType() {
        assertEquals(GroupType.BRASSWIND, sheetMusic.getGroupType());
    }

    @Test
    public void canSetGroupType() {
        sheetMusic.setGroupType(GroupType.PERCUSSION);
        assertEquals(GroupType.PERCUSSION, sheetMusic.getGroupType());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(10.00, sheetMusic.calculateMarkup(), 0.01);
    }

    @Test
    public void canGetCostPrice() {
        assertEquals(20.50, sheetMusic.getCostPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(30.50, sheetMusic.getSellPrice(), 0.01);
    }

    @Test
    public void canSetCostPrice() {
        sheetMusic.setCostPrice(40.00);
        assertEquals(40.00, sheetMusic.getCostPrice(), 0.01);
    }

    @Test
    public void canSetSellPrice() {
        sheetMusic.setSellPrice(40.00);
        assertEquals(40.00, sheetMusic.getSellPrice(), 0.01);
    }

    @Test
    public void canGetItemId(){
        assertEquals(1, sheetMusic.getItemId());
    }

    @Test
    public void canSetItemId(){
        sheetMusic.setItemId(40);
        assertEquals(40, sheetMusic.getItemId());
    }
}