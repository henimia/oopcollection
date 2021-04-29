package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {
    List<MilitaryUnit> army = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        this.army.add(militaryUnit);
    }

    public void damageAll(int damage) {
        this.army.forEach(unit -> unit.sufferDamage(damage));
        this.army.removeIf(unit -> unit.health <= 25);
    }

    public int getArmyDamage() {
        return this.army.stream().mapToInt(MilitaryUnit :: doDamage).sum();
    }

    public int getArmySize() {
        return this.army.size();
    }
}