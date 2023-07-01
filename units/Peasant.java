package units;

import java.util.Random;

public class Peasant extends Units implements GameInterface{
    public Peasant() {
        super(100, 10, 0, 0, 4, 1, String.valueOf(NameList.values()[new Random().nextInt(NameList.values().length)]));
    }

    @Override
    public void step() {

    }


}
