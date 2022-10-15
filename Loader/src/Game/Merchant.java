package Game;

public abstract class Merchant implements Sell {
    @Override
    public String sell(Goods goods) {
        String result = "";
        switch (goods) {
            case POTION:
                result = "potion";
                break;
            case SWORD:
                result = "sword ";
                break;
            case KNIFE:
                result = "knife ";
                break;
            case AXE:
                result = "axe";
                break;
            case SHIELD:
                result = "shield";
                break;
            case BATTLE_BOW:
                result = "battle bow ";
                break;
            case ARROWS:
                result = "arrows";
                break;
        }
        return result;
    }




    public enum Goods {
        POTION ,
        SWORD,
        KNIFE,
        AXE,
        SHIELD,
        BATTLE_BOW,
        ARROWS

    }
}
