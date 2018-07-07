package MusicShop;

import Behaviours.ISell;

public abstract class SellableItem implements ISell {

    private double costPrice;
    private double sellPrice;
    private int itemId;

    public SellableItem(double costPrice, double sellPrice, int itemId) {
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
        this.itemId = itemId;
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


    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
}