package MusicShop;

import Behaviours.ISell;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    SheetMusic sheetMusic;
    ArrayList shops;

    @Before
    public void setUp() {
       shops = new ArrayList();
       shop = new Shop( shops,300);
       guitar = new Guitar(20, 30, MaterialType.WOOD, GroupType.STRING, 6);
       sheetMusic = new SheetMusic(10,20, GroupType.STRING, "Let It Be");
    }

    @Test
    public void canGetTill() {
        assertEquals(300, shop.getTill(), 0.01);
    }
}