package MusicShop;

public class Guitar extends SellableInstrument {

    private int amountOfStrings;

    public Guitar(double costPrice, double sellPrice, MaterialType materialType, GroupType groupType, int amountOfStrings, int itemId) {
        super(costPrice, sellPrice, materialType, groupType, itemId);
        this.amountOfStrings = amountOfStrings;
    }

    @Override
    public String play() {
        return "Guitar Noise";
    }

    public int getAmountOfStrings() {
        return amountOfStrings;
    }

    public void setAmountOfStrings(int amountOfStrings) {
        this.amountOfStrings = amountOfStrings;
    }
}
