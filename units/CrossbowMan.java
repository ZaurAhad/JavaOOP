package units;

import java.util.Random;

public class CrossbowMan extends Units implements GameInterface{
    public CrossbowMan() {
        super(100, 100, 0, 50, 3, 1, String.valueOf(NameList.values()[new Random().nextInt(NameList.values().length)]));
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return this.name;
    }
}
