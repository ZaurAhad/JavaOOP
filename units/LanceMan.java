package units;

import java.util.Random;

public class LanceMan extends Units implements GameInterface{
    public LanceMan() {
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
