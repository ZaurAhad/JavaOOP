package units;

import java.util.Arrays;
import java.util.Random;

public abstract class Units {
    public int health;
    public int defence;
    public int mana;
    public int damage;
    public int actionPoints;
    public int initiative;
    public String name;

    public Units(int health, int defence, int mana, int damage, int actionPoints, int initiative, String name) {
        this.health = health;
        this.defence = defence;
        this.mana = mana;
        this.damage = damage;
        this.actionPoints = actionPoints;
        this.initiative = initiative;
        this.name = name;

    }
    public String getInfo() {
        return this.name;
    }

//    public boolean hasAP() {
//        if(actionPoints > 0) {
//            return true;
//        } else return false;
//    }
//    public int move() {
//        return 0;
//    }
}
