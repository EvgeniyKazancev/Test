package Game;


public class Battle {


    private Character Hero;

    public void fight(Character hero, Character monster) {
        // нужно создать поток
        Runnable runnable = () -> {

            boolean endedFight = false;
            int turn = 1;
            while (!endedFight) {
                System.out.println("==== Turn " + turn + "====");
                if (turn++ % 2 != 0) {
                    endedFight = makeHit(hero, monster);
                } else {
                    endedFight = makeHit(monster, hero);

                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

    }


    private boolean makeHit(Character defender, Character attacker) {

        int hit = attacker.attack();
        int defenderHealth = defender.getHp() - hit;
        if (hit != 0) {
            System.out.println(attacker.getName + "Struck a blow on" + hit);
            System.out.println(defender.getName + "remained hp " + defenderHealth);
        } else {
            System.out.println("Blow miss" + attacker.getName);
        }
        if (defenderHealth <= 0 && defender instanceof Hero) {
            System.out.println("You lost");
            return true;
        } else if (defenderHealth <= 0)
            System.out.println("The enemy is defeated! You got it " + "Gold: \n" + attacker.getGold + "Experience: " + attacker.getExperience);

        return false;
     /**   while (defender == Hero) { // думал так сделать с начала!!!!!!!!!!!!!!!!++++++++++++++++++++++
            if (defenderHealth <= 0) {
                System.out.println("You lost");
            } else if (defenderHealth <= 0)
                System.out.println("The enemy is defeated! You got it " + "Gold: \n" + attacker.getGold + "Experience: " + attacker.getExperience);

        }
        return false;
    }*/
}



}