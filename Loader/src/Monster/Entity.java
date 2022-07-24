package Monster;

/**public abstract class Entity extends Monster {
    private String name;
    private int hp = 100;
    private boolean destroyed;
    Entity(String name){
        this.name = name;
    }
    public boolean damage(int dhp) {
        hp -= dhp;
        if (hp <= 0) {
            destroyed = true;
            System.out.println("Monster " + name + " was destroyed");
            return true;
        }
        return false;
    }
    public boolean isDestroyed(){
        return destroyed;
    }

}**/
