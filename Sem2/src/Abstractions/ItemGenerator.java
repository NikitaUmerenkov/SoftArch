package Abstractions;

public abstract class ItemGenerator {
    public String openReward() {
        IGameItem gameItem = createItem();
        return gameItem.open();
    }
    public abstract IGameItem createItem();
}