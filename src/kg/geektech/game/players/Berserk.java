package kg.geektech.game.players;

public class Berserk extends Hero {
    private int savedDamage;

    public Berserk(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int damageBoss = boss.getDamage() / 2;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes.length > 0) {
                boss.setHealth(boss.getHealth() - damageBoss);
                break;
            }
        }
    }

    public int getSavedDamage() {
        return savedDamage;
    }

    public void setSavedDamage(int savedDamage) {
        this.savedDamage = savedDamage;
    }
}