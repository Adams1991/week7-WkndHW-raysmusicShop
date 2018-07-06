package MusicShop;

import Behaviours.IPlay;

public abstract class SellableIntrument extends SellableItem implements IPlay {

    private MaterialType materialType;
    private GroupType groupType;

    public SellableIntrument (double costPrice, double sellPrice, MaterialType materialType, GroupType groupType ){
        super(costPrice, sellPrice);
        this.materialType = materialType;
        this.groupType= groupType;
    }


    @Override
    public abstract String play();

}
