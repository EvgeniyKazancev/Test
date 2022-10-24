package Game;

public class Healer extends Merchant {

    public static int getPotionCounter() {
        return potionCounter;
    }

    @Override
    public String sell(Goods goods) {
        potionCounter--;
        return super.sell(goods);

    }
private static int potionCounter = 100;

}
