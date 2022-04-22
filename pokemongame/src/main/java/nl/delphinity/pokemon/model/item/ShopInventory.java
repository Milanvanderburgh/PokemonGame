package nl.delphinity.pokemon.model.item;

import java.util.HashMap;

public class ShopInventory extends Inventory {

    public ShopInventory() {
        super();
    }

    private boolean isItemInStock(ItemType type, int amount) {
        return items.getOrDefault(type, 0) >= amount;
    }

    public HashMap<ItemType, Integer> takeItemsFromStock(ItemType type, int amount) {
        HashMap<ItemType, Integer> taken = new HashMap<>();
        if (isItemInStock(type, amount)) {
            items.merge(type, amount * -1, Integer::sum);
            taken.put(type, amount);
        }
        return taken;
    }
}
