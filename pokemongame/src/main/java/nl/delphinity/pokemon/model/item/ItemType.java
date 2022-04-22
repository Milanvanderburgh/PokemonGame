package nl.delphinity.pokemon.model.item;

public enum ItemType {
    POKEBALL(5), POKEDEX(999), THUNDERSTONE(9999);

    private final double price;

    ItemType(double price) {
        this.price = price;
    }

    private double price() {
        return price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return super.toString() + " price: " + price;
    }
}
