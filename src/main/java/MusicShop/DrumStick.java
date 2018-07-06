package MusicShop;

public class DrumStick extends SellableAccessory {

    private MaterialType materialType;

    public DrumStick(double costPrice, double sellPrice, GroupType groupType, MaterialType materialType) {
        super(costPrice, sellPrice, groupType);
        this.materialType = materialType;
    }

    public MaterialType getMaterialType() {
        return materialType;
    }

    public void setMaterialType(MaterialType materialType) {
        this.materialType = materialType;
    }
}
