package units;

import java.util.Random;

public class Monk extends Units implements GameInterface{
    public Monk() {
        super(100, 50, 70, 0, 1, 1, String.valueOf(NameList.values()[new Random().nextInt(NameList.values().length)]));
    }


    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return this.name;
    }
}
