package MusicShop;


import java.util.ArrayList;

public class Shop {

    private ArrayList<SellableItem> stock;
    private double till;

    public Shop(ArrayList<SellableItem> stock, double till){
        this.stock = stock;
        this.till = till;
    }

    public double getTill() {
        return till;
    }


    public int getStockAmount() {
        return stock.size();
    }

    public void addStock(SellableItem item) {
        stock.add(item);
    }

    public void removeStock(SellableItem item) {
        stock.remove(item);
        till += item.getSellPrice();
    }


    public double getPotentialProfit() {
        double potentialProfit = 0;
        for (SellableItem item : stock ){
            potentialProfit += item.calculateMarkup();
        }
        return potentialProfit;
    }
}
