package MusicShop;

import Behaviours.IPlay;

public abstract class SellableInstrument extends SellableItem implements IPlay {

    private MaterialType materialType;
    private GroupType groupType;

    public SellableInstrument(double costPrice, double sellPrice, MaterialType materialType, GroupType groupType, int itemId ){
        super(costPrice, sellPrice, itemId);
        this.materialType = materialType;
        this.groupType= groupType;
    }


    @Override
    public abstract String play();

    public MaterialType getMaterialType() {
        return materialType;
    }

    public GroupType getGroupType() {
        return groupType;
    }

    public void setGroupType(GroupType groupType) {
        this.groupType = groupType;
    }

    public void setMaterialType(MaterialType materialType) {
        this.materialType = materialType;
    }
}
