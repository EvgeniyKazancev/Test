package Game;



import java.util.EmptyStackException;

public class Battle {


    public void fight(Сharacter hero, Сharacter monster) {
        // нужно создать поток
        Thread battle = new Thread();

        boolean endedFight = false;
        int turn = 1;
        while (!endedFight) {
            System.out.println("==== Turn " + turn + "====");
            if (turn++ % 2 != 0) {
                endedFight = makeHit(hero, monster);

            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        battle.start();

    }

    private boolean makeHit(Character damage, Character attacker) {
        int hit = attacker.a

    }


}