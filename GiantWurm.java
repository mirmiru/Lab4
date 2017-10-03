package monsters;

//Ett specifikt monster som ärver Monster-klassen. (Ni får skapa vilka Monster ni
//vill, detta är bara ett exempel).
// Specificerar de unika attributen för det specifika monstret, via superklassens konstruktor

public class GiantWurm extends Monster {

    //constructor
    public GiantWurm(String name) {
        super(name, 20, 5);
    }

    @Override
    public int attack() {
        return 0;
    }

    @Override
    public void takeDamage(int damage) {
    }

    @Override
    public boolean isDead() {
        return false;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getHp() {
        return 0;
    }

    @Override
    public int getExp() {
        return 0;
    }
}
