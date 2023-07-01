package units;

import java.util.Random;

public class Rouge extends Units implements GameInterface{

    public Rouge() {
        super(100, 30, 0, 15, 5, 7, String.valueOf(NameList.values()[new Random().nextInt(NameList.values().length)]));
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return this.name;
    }
}
