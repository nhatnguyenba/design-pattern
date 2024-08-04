/**
 * Item.
 */
public class Item {

    private ItemType type;
    private final String name;

    public Item(ItemType type, String name) {
        this.name = name;
        this.type = type;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}