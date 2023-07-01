import units.*;

import java.util.ArrayList;
import java.util.Random;

// Добавить файл с описанием интерфейса. В котором описать два метода, void step(); и String getInfo();
// Реализовать интерфейс в абстрактном классе и в наследниках так, чтобы getInfo возвращал тип персонажа.
// Создать два списка в классе main. В каждый из списков добавить по десять случайных экземнляров наследников BaseHero.
// Удалить ненужные методы из абстрактного класса, если такие есть.
// В main пройти по спискам и вызвать у всех персонажей getInfo.

public class Program {
    public static void main(String[] args) {

        ArrayList<Units> team1 = teamAdd();
        ArrayList<Units> team2 = teamAdd();
        System.out.print("TEAM 1: ");
        for (Units s: team1) {
            System.out.print(s.getInfo() + " ");
        }
        System.out.println();
        System.out.print("TEAM 2: ");
        for (Units s: team2) {
            System.out.print(s.getInfo() + " ");
        }

    }
    public static ArrayList<Units> teamAdd() {
        ArrayList<Units> team = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(7)) {
                case 0 -> team.add(new Rouge());
                case 1 -> team.add(new Mage());
                case 2 -> team.add(new Monk());
                case 3 -> team.add(new LanceMan());
                case 4 -> team.add(new Sniper());
                case 5 -> team.add(new CrossbowMan());
                case 6 -> team.add(new Peasant());
            }
        }
        return team;
    }
}
