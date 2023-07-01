package units;

import java.util.Random;

public class Mage extends Units{

    public Mage() {
        super(100, 50, 80, 30, 3, 1, String.valueOf(NameList.values()[new Random().nextInt(NameList.values().length)]));
    }
}
