package main;

//Representerar en spelare. Innehåller bl.a. hp, level, exp, samt metoder för att
//attackera och ta skada

public class Player implements IPlayer {

    private String name;
    private int hp;
    private int level;
    private int exp;
    private RandomHelper r;

    public Player(String name) {
        this.name = name;
        this.hp = 100;
        this.level = 0;
        this.exp = 0;
    }

    public String getName() {
        return this.name;
    }

    //Attack - player gives damage betw 0-10.
    @Override
    public int attack() {
        System.out.println("Hiyaaaaaaa!");
        /*
        if (attackPower == 0) {
            System.out.println(this.getName() + " missed, dealing 0 damage!");
            return attackPower;
        } else */
        return r.getInt(0,10);
    }

    @Override
    public void takeDamage(int damage) {
        this.hp -= damage;
    }

    //WORKS
    @Override
    public void giveExp(int newExp) {
        //level up for each 10 exp points
        this.exp += newExp;

        if (this.exp >= 10) {
            System.out.println("More than 10 exp points! Time to level up!");
            this.level++;
            this.exp -= 10;
        }
        else {
            System.out.println("Less than 10 exp points.");
        }
    }

    @Override
    public boolean isDead() {
        if (this.hp > 0) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public int getHp() {
        return this.hp;
    }

    @Override
    public int getExp() {
        return this.exp;
    }

    @Override
    public int getLevel() {
        return this.level;
    }
}
