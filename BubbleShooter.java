package monsters;

public class BubbleShooter extends Monster {

    public BubbleShooter() {
        super("BubbleShooter", 30, 5);
        addMonsterToList(this);

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
        return super.getHp();
    }

    @Override
    public int getExp() {
        return super.getExp();
    }
}
