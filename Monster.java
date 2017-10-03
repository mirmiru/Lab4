package monsters;

//En klass som representerar ett monster. Innehåller alla nödvända variabler,
//metoder samt en statisk hjälpmetod som genererar ett slumpmässigt monster

import main.RandomHelper;

import java.util.ArrayList;

public class Monster implements IMonster {

    private String name;
    private int hp;
    private int exp;
    private static ArrayList<Monster> monsters = new ArrayList<Monster>();

    //konstruktor
    public Monster(String name, int hp, int exp){
        this.name = name;
        this.hp = hp;
        this.exp = exp;
    }

    @Override
    public int attack() {
        return 0;
    }

    @Override
    public void takeDamage(int damage) {
        this.hp -= damage;
    }

    @Override
    public boolean isDead() {
        if (this.hp > 0) {
            return false;
        }
        return true;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getHp() {
        return this.hp;
    }

    @Override
    public int getExp() {
        return this.exp;
    }

    /**
     * Returns a random monster from the ArrayList<Monster>
     * @return
     */
    public static Monster getRandomMonster() {
        RandomHelper random = new RandomHelper();
        //Ändra på basen av hur många monster du har tillsist!
        int i = random.getInt(0, 0);
        return monsters.get(i);
    }

    /**
     * Add created monster to ArrayList<Monster>
     * @param m
     */
    public void addMonsterToList(Monster m) {
        GiantWurm gw = new GiantWurm("GiantWurm");
        monsters.add(gw);
    }
}
