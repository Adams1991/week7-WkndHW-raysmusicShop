package MusicShop;

public class SheetMusic extends SellableAccessory {

    private String songName;

    public SheetMusic(double costPrice, double sellPrice, GroupType groupType, String songName) {
        super(costPrice, sellPrice, groupType);
        this.songName = songName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }
}
