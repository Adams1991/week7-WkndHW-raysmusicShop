package MusicShop;


import java.util.ArrayList;

public class Shop {

    private ArrayList<SellableItem> stock;
    private ArrayList<SellableAccessory> recommendationList;
    private double till;

    public Shop(ArrayList<SellableItem> stock, double till, ArrayList<SellableAccessory> recommendationList){
        this.stock = stock;
        this.till = till;
        this.recommendationList = recommendationList;
    }

    public double getTill() {
        return till;
    }


    public int getSellingStockAmount() {
        return stock.size();
    }

    public void addStockForSelling (SellableItem item) {
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


    public int getRecommendationStockAmount() {
        return recommendationList.size();
    }

    public void addAccessoryForRecommendation (SellableAccessory item) {
        recommendationList.add(item);
    }

    public ArrayList getAccessoryRecommendationArray(SellableInstrument item) {
        ArrayList recommendedItems = new ArrayList();
        for (SellableAccessory recommendedItem : recommendationList ){
            if (recommendedItem.getGroupType() == item.getGroupType())
                recommendedItems.add(recommendedItem);
        }
        return recommendedItems;
    }


    public boolean recommendedInStock(ArrayList recommended) {
        for (Object recommendedItem : recommended){
            for (SellableItem stock : stock){
                if (recommendedItem == stock){
                    return true;
                }
            }
        }
        return false;
    }


}
