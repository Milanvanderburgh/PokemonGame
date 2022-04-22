package nl.delphinity.pokemon.model.item;

import nl.delphinity.pokemon.model.area.Area;
import nl.delphinity.pokemon.model.trainer.Trainer;

public class TestShop {
    public static void main(String[] args) {
        Shop shop = new Shop("G");
        Trainer t = new Trainer("Gino", new Area("V", null, true, null, null));

        shop.restockShop();
        shop.showInventory();
        System.out.println(t.getMoney());
        boolean sellResult = shop.sell(5, ItemType.POKEBALL, t);
        System.out.println(sellResult);
        System.out.println(t.getMoney());
        System.out.println(shop.getMoney());
        shop.showInventory();
    }
}
