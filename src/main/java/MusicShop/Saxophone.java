package MusicShop;

public class Saxophone extends SellableInstrument {

    private String saxType;

    public Saxophone(double costPrice, double sellPrice, MaterialType materialType, GroupType groupType, String saxType) {
        super(costPrice, sellPrice, materialType, groupType);
        this.saxType = saxType;
    }

    @Override
    public String play() {
        return "Sax Noise";
    }


    public String getSaxType() {
        return saxType;
    }

    public void setSaxType(String saxType) {
        this.saxType = saxType;
    }


}




