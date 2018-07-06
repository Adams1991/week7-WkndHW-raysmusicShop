package MusicShop;

import Behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;
    private double till;

    public Shop(ArrayList<ISell> stock, double till){
        this.stock = stock;
        this.till = till;
    }

    public double getTill() {
        return till;
    }


    public int getStockAmount() {
        return stock.size();
    }

    public void addStock(ISell item) {
        stock.add(item);
    }

    public void removeStock(ISell item) {
        stock.remove(item);
    }


    public double getPotentialProfit() {
        double potentialProfit = 0;
        for (ISell item : stock ){
            potentialProfit += item.calculateMarkup();
        }
        return potentialProfit;
    }
}
