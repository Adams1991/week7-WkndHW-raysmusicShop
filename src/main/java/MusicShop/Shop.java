package MusicShop;


import java.util.ArrayList;

public class Shop {

    private ArrayList<SellableItem> saleStock;
    private ArrayList<SellableAccessory> recommendationList;
    private ArrayList<SellableInstrument> demonstrationList;
    private double till;

    public Shop(ArrayList<SellableItem> saleStock, double till, ArrayList<SellableAccessory> recommendationList,
                ArrayList<SellableInstrument> demonstrationList){
        this.saleStock = saleStock;
        this.till = till;
        this.recommendationList = recommendationList;
        this.demonstrationList = demonstrationList;
    }

    public double getTill() {
        return till;
    }


    public int getSellingStockAmount() {
        return saleStock.size();
    }

    public void addStockForSelling (SellableItem item) {
        saleStock.add(item);
    }

    public void sell(SellableItem item) {
        saleStock.remove(item);
        till += item.getSellPrice();
    }


    public double getPotentialProfit() {
        double potentialProfit = 0;
        for (SellableItem item : saleStock ){
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
        ArrayList recommendedItems = new ArrayList<Integer>();
        for (SellableAccessory recommendedItem : recommendationList ){
            if (recommendedItem.getGroupType() == item.getGroupType())
                recommendedItems.add(recommendedItem.getItemId());
        }
        return recommendedItems;
    }


    public boolean recommendedInStock(ArrayList<Integer> recommended) {
        for (Integer recommendedItem : recommended){
            for (SellableItem saleStock : saleStock){
                if (recommendedItem == saleStock.getItemId()){
                    return true;
                }
            }
        }
        return false;
    }


    public int getDemonstrationListAmount() {
        return this.demonstrationList.size();
    }

    public void addStockForDemonstration(SellableInstrument item) {
        demonstrationList.add(item);
    }


    public String demonstrateItem(int itemId) {
        for (SellableInstrument instrument : demonstrationList) {
            if (itemId == instrument.getItemId()) {
                return instrument.play();
            }
        }
        return "This item isn't in stock";
    }

    public void addAccessoryToStock(SellableItem item) {
        addStockForSelling(item);
        addAccessoryForRecommendation((SellableAccessory) (item));
    }

    public void addInstrumentToStock(SellableItem item) {
        addStockForSelling(item);
        addStockForDemonstration((SellableInstrument) (item));
    }
}
