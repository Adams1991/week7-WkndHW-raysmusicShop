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
    ArrayList stock;

    @Before
    public void setUp() {
       stock = new ArrayList();
       shop = new Shop( stock,300, stock);
       guitar = new Guitar(20, 30, MaterialType.WOOD, GroupType.STRING, 6);
       sheetMusic = new SheetMusic(10,20, GroupType.STRING, "Let It Be");
    }

    @Test
    public void canGetTill() {
        assertEquals(300, shop.getTill(), 0.01);
    }

    @Test
    public void canGetStockAmount(){
        assertEquals(0, shop.getStockAmount());
    }

    @Test
    public void canAddStock__instrument(){
        shop.addStock(guitar);
        assertEquals(1, shop.getStockAmount());
    }

    @Test
    public void canAddStock__accessory(){
        shop.addStock(sheetMusic);
        assertEquals(1, shop.getStockAmount());
    }

    @Test
    public void canRemoveStock__instrument(){
        shop.addStock(guitar);
        shop.removeStock(guitar);
        assertEquals(0, shop.getStockAmount());
    }

    @Test
    public void canRemoveStock__accessory(){
        shop.addStock(sheetMusic);
        shop.removeStock(sheetMusic);
        assertEquals(0, shop.getStockAmount());
    }

    @Test
    public void canGetPotentialProfit(){
        shop.addStock(sheetMusic);
        shop.addStock(guitar);
        assertEquals(20, shop.getPotentialProfit(), 0.01);
    }

    @Test
    public void tillIncreasesWhenStockRemoved(){
        shop.addStock(sheetMusic);
        shop.removeStock(sheetMusic);
        assertEquals(320, shop.getTill(), 0.01);
    }

    @Test
    public void canGetAccessoryRecommendationsFromInstrument(){
        shop.addStock(sheetMusic);
        shop.addStock(guitar);
        assertEquals(sheetMusic, shop.getAccessoryRecommendation(guitar));
    }



}