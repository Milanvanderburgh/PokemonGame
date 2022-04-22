package nl.delphinity.pokemon.model.item;

import nl.delphinity.pokemon.model.trainer.Trainer;

public class Shop {

    private ShopInventory inventory;
    private String name;
    private double money;

    public Shop(String name) {
        inventory = new ShopInventory();
        this.name = name;
    }

    public boolean sell(int amount, ItemType type, Trainer customer) {
        double saleTotal = type.getPrice() * amount;
        if (customer.getMoney() >= saleTotal && saleTotal >= 0) {
            customer.setMoney(customer.getMoney() - saleTotal);
            money+=saleTotal;
            inventory.takeItemsFromStock(type, amount);
            customer.getInventory().addItem(amount, type);
            return true;
        }
        return false;
    }

    //fill the shop with pokeballs
    public void restockShop() {
        int remaining = this.inventory.items.getOrDefault(ItemType.POKEBALL, 0);
        this.inventory.getItems().merge(ItemType.POKEBALL, 100 - remaining, Integer::sum);
    }

    public void showInventory() {
        inventory.show();
    }

    public double getMoney() {
        return money;
    }
}
