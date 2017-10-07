package monsters;

//En klass som representerar ett monster. Innehåller alla nödvända variabler,
//metoder samt en statisk hjälpmetod som genererar ett slumpmässigt monster

import main.RandomHelper;
import java.util.ArrayList;

public abstract class Monster implements IMonster {

    private String name;
    private int hp;
    private int exp;
    private static ArrayList<IMonster> monsters = new ArrayList<>();
    private RandomHelper r;

    //konstruktor
    public Monster(String name, int hp, int exp){
        this.name = name;
        this.hp = hp;
        this.exp = exp;
    }

    @Override
    public int attack() {
        return r.getInt(0,10);
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
    public static IMonster getRandomMonster() {
        RandomHelper random = new RandomHelper();
        //Ändra på basis av hur många monster du har tillsist!
        int i = random.getInt(0, 2);
        return monsters.get(i);
    }

    /**
     * Add monster to ArrayList<IMonster>
     * @param m
     */
    public void addMonsterToList(IMonster m) {
        monsters.add(m);
    }
}
