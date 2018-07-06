package MusicShop;

import Behaviours.ISell;

public abstract class SellableItem implements ISell {

    private double costPrice;
    private double sellPrice;

    public SellableItem(double costPrice, double sellPrice) {
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
    }


    @Override
    public double calculateMarkup() {
        return sellPrice - costPrice;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

}