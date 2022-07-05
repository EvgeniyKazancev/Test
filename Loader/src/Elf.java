public class Elf {
    public String name = " Oberon";
    public int health = 100;
    public int kickPower = 20;
    public boolean isElfAlive = true;
}


 class Fight {
    public static void main(String[] args) {


    Elf elf = new Elf();
    Ork ork = new Ork();
}
    //fight(elf,ork);
    private static void Fight(Elf elf, Ork ork) {
        while (true) {
            if (!ork.isOrkAlive && elf.isElfAlive) {
                System.out.println("WIn Elf" + elf.name);
                break;
            } else if (ork.isOrkAlive && !elf.isElfAlive) {
                System.out.println(" Win Ork" + ork.name);
                break;
            } else if (!ork.isOrkAlive && !elf.isElfAlive) {
                System.out.println("All dead");
                break;
            }
        }
        if (elf.health < 0) {
            elf.isElfAlive = false;
        } else {
            elf.health -= ork.kickPower;
        }
        if (ork.health < 0) {
            ork.isOrkAlive = false;
        } else {
            ork.health -= elf.kickPower;

        }

    }
}

 class Ork {
    public String name = " Zely";
    public int health = 100;
    public int kickPower = 10;
    public boolean isOrkAlive = true;
}