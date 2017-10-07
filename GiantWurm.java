package monsters;

//Ett specifikt monster som ärver Monster-klassen. (Ni får skapa vilka Monster ni
//vill, detta är bara ett exempel).
// Specificerar de unika attributen för det specifika monstret, via superklassens konstruktor

public class GiantWurm extends Monster {

    //constructor
    public GiantWurm() {
        super("GiantWurm",20,5);
        addMonsterToList(this);
    }

    @Override
    public int attack() {
        System.out.println("Sluuuurrrrp!");
        return super.attack();
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
    }

    @Override
    public boolean isDead() {
        if (super.getHp() > 0)
            return false;
        else
            return true;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getHp() {
        return super.getHp();
    }

    @Override
    public int getExp() {
        return super.getExp();
    }
}
