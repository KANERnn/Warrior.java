package kg.geektech.game.players;

public class Berserk extends Hero {
    private int saveDamage;

    public Berserk(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        this.setSaveDamage(boss.getDamage() / 2);
        for (int i = 0; i < heroes.length; i++) {
            if (heroes.length > 0) {
                boss.setHealth(boss.getHealth() - this.getSavedDamage());
                System.out.println("Berserk поглотил урон босса");
                break;
            }
        }
    }

    public int getSavedDamage() {
        return saveDamage;
    }

    public void setSaveDamage(int saveDamage) {
        this.saveDamage = saveDamage;
    }
}