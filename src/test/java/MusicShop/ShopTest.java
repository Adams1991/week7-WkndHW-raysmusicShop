package MusicShop;

import Behaviours.ISell;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    SheetMusic sheetMusic;
    SheetMusic sheetMusic2;
    ArrayList stock;
    ArrayList recommendationStock;

    @Before
    public void setUp() {
       stock = new ArrayList();
       recommendationStock = new ArrayList();
       shop = new Shop( stock,300, recommendationStock);
       guitar = new Guitar(20, 30, MaterialType.WOOD, GroupType.STRING, 6);
       sheetMusic = new SheetMusic(10,20, GroupType.STRING, "Let It Be");
       sheetMusic2 = new SheetMusic(10,20, GroupType.PERCUSSION, "Black Betty");
    }

    @Test
    public void canGetTill() {
        assertEquals(300, shop.getTill(), 0.01);
    }

    @Test
    public void canGetStockAmountFromGenericStock(){
        assertEquals(0, shop.getSellingStockAmount());
    }

    @Test
    public void canAddStockForSelling__instrument(){
        shop.addStockForSelling(guitar);
        assertEquals(1, shop.getSellingStockAmount());
    }

    @Test
    public void canAddStockForSelling__accessory(){
        shop.addStockForSelling(sheetMusic);
        assertEquals(1, shop.getSellingStockAmount());
    }

    @Test
    public void canRemoveStock__instrument(){
        shop.addStockForSelling(guitar);
        shop.removeStock(guitar);
        assertEquals(0, shop.getSellingStockAmount());
    }

    @Test
    public void canRemoveStock__accessory(){
        shop.addStockForSelling(sheetMusic);
        shop.removeStock(sheetMusic);
        assertEquals(0, shop.getSellingStockAmount());
    }

    @Test
    public void canGetPotentialProfit(){
        shop.addStockForSelling(sheetMusic);
        shop.addStockForSelling(guitar);
        assertEquals(20, shop.getPotentialProfit(), 0.01);
    }

    @Test
    public void tillIncreasesWhenStockRemoved(){
        shop.addStockForSelling(sheetMusic);
        shop.removeStock(sheetMusic);
        assertEquals(320, shop.getTill(), 0.01);
    }

    @Test
    public void canGetStockAmountForRecommendations(){
        assertEquals(0, shop.getRecommendationStockAmount());
    }
    

    @Test
    public void canAddStockForRecommendation(){
        shop.addAccessoryForRecommendation(sheetMusic);
        assertEquals(1, shop.getRecommendationStockAmount());
    }


    @Test
    public void canGetAccessoryRecommendationsFromInstrument(){
        shop.addAccessoryForRecommendation(sheetMusic);
        shop.addAccessoryForRecommendation(sheetMusic2);
        ArrayList recommended = shop.getAccessoryRecommendation(guitar);
        assertEquals(1, recommended.size() );
    }



}