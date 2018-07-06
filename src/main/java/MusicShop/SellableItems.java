package MusicShop;

import Behaviours.ISell;

public class SellableItems implements ISell {

   private double costPrice;
   private double sellPrice;

    public SellableItems() {
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
    }


    @Override
    public double calculateMarkup() {
        return sellPrice - costPrice;
    }
}
