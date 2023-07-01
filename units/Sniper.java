package units;

import java.util.Random;

public class Sniper extends Units implements GameInterface{
    public Sniper() {
        super(100, 20, 0, 10, 1, 1, String.valueOf(NameList.values()[new Random().nextInt(NameList.values().length)]));
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return this.name;
    }
}
