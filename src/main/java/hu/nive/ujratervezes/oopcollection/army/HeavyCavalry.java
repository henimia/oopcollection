package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit {
    private boolean rush;

    public HeavyCavalry() {
        super(150, 20, true);
        this.rush = true;
    }

    @Override
    public int doDamage() {
        if(rush) {
            this.rush = false;
            return this.damage * 3;
        } else {
            return this.damage;
        }
    }
}