package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {
    int health;
    int damage;
    boolean hasArmor;

    public MilitaryUnit(int health, int damage, boolean hasArmor) {
        this.health = health;
        this.damage = damage;
        this.hasArmor = hasArmor;
    }

    public int doDamage() {
        return damage;
    }

    public int sufferDamage(int damage) {
        if(hasArmor) {
            this.health -= damage / 2;
            return damage / 2;
        } else {
            this.health -= damage;
            return damage;
        }
    }

    public int getHitPoints() {
        return this.health;
    }
}