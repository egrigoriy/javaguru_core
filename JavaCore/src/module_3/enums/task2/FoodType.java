package module_3.enums.task2;

public enum FoodType {
    PORRIDGE(true),
    BREAD(true),
    SOUP(true),
    VEGETABLE(true),
    NUT(true),
    FRUIT(true),
    DAIRY(true),
    FISH(false),
    GREENS(true),
    MEAT(false),
    UNKNOWN(false);

    private boolean isVeggi;

    FoodType(boolean isVeggi) {
        this.isVeggi = isVeggi;
    }

    public boolean isVeggi() {
        return isVeggi;
    }
}
