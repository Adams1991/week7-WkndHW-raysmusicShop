package MusicShop;

public class SheetMusic extends SellableAccessory {

    private String songName;

    public SheetMusic(double costPrice, double sellPrice, GroupType groupType, String songName) {
        super(costPrice, sellPrice, groupType);
        this.songName = songName;
    }
}
