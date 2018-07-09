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
    SheetMusic sheetMusic3;
    ArrayList saleStock;
    ArrayList recommendationStock;
    ArrayList demonstrationList;

    @Before
    public void setUp() {
       saleStock = new ArrayList();
       recommendationStock = new ArrayList();
       demonstrationList = new ArrayList();
       shop = new Shop( saleStock,300, recommendationStock, demonstrationList);
       guitar = new Guitar(20, 30, MaterialType.WOOD, GroupType.STRING, 6, 34);
       sheetMusic = new SheetMusic(10,20, GroupType.STRING, "Let It Be", 1);
       sheetMusic3 = new SheetMusic(10,20, GroupType.STRING, "Let It Be", 1);
       sheetMusic2 = new SheetMusic(10,20, GroupType.PERCUSSION, "Black Betty", 44);
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
        shop.sell(guitar);
        assertEquals(0, shop.getSellingStockAmount());
    }

    @Test
    public void canRemoveStock__accessory(){
        shop.addStockForSelling(sheetMusic);
        shop.sell(sheetMusic);
        assertEquals(0, shop.getSellingStockAmount());
    }

    @Test
    public void canGetPotentialProfit(){
        shop.addStockForSelling(sheetMusic);
        shop.addStockForSelling(guitar);
        assertEquals(20, shop.getPotentialProfit(), 0.01);
    }

    @Test
    public void tillIncreasesWhenStockSold(){
        shop.addStockForSelling(sheetMusic);
        shop.sell(sheetMusic);
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
        ArrayList recommended = shop.getAccessoryRecommendationArray(guitar);
        assertEquals(1, recommended.size() );
    }

    @Test
    public void canCheckRecommendedIsInStock__true(){
        shop.addAccessoryForRecommendation(sheetMusic);
        shop.addStockForSelling(sheetMusic);
        ArrayList recommended = shop.getAccessoryRecommendationArray(guitar);
        assertEquals(true , shop.recommendedInStock(recommended));
    }

    @Test
    public void canCheckRecommendedIsInStock__false(){
        shop.addAccessoryForRecommendation(sheetMusic2);
        shop.addStockForSelling(sheetMusic2);
        ArrayList recommended = shop.getAccessoryRecommendationArray(guitar);
        assertEquals(false, shop.recommendedInStock(recommended));
    }

    @Test
    public void canCheckItemInStockWithSameIdAsRecommended__true(){
        shop.addAccessoryForRecommendation(sheetMusic);
        shop.addStockForSelling(sheetMusic3);
        ArrayList recommended = shop.getAccessoryRecommendationArray(guitar);
        assertEquals(true , shop.recommendedInStock(recommended));
    }

    @Test
    public void canGetStockAmountForDemonstration(){
        assertEquals(0, shop.getDemonstrationListAmount());
    }

    @Test
    public void canAddStockForDemonstration(){
        shop.addStockForDemonstration(guitar);
        assertEquals(1, shop.getDemonstrationListAmount());
    }



}