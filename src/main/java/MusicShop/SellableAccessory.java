package MusicShop;

public abstract class SellableAccessory extends SellableItem {

    private GroupType groupType;

    public SellableAccessory(double costPrice, double sellPrice, GroupType groupType) {
        super(costPrice, sellPrice);
        this.groupType = groupType;
    }

    public GroupType getGroupType() {
        return groupType;
    }

    public void setGroupType(GroupType groupType) {
        this.groupType = groupType;
    }
}
