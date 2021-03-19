package ru.geekbrains;

import ru.geekbrains.exceptions.TooHeightWallException;
import ru.geekbrains.exceptions.TooLongException;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<IActionable> participants = new ArrayList<>();
        participants.add(new Human("Human1", 100, 5));
        participants.add(new Human("Human2", 200, 2));
        participants.add(new Cat("Cat1", 2, 1));
        participants.add(new Robot("Robot1", 1200, 10));
        participants.add(new Human("Robot2", 2200, 20));

        ArrayList<IBarrierable> barriers = new ArrayList<>();
        barriers.add(new Wall(1));
        barriers.add(new Wall(5));
        barriers.add(new Treadmill(100));
        barriers.add(new Treadmill(2100));

        participants.forEach((a) ->
                barriers.forEach((b) -> {
                    try {
                        a.go(b);
                    } catch (TooLongException e) {
                        System.out.println(e.getMessage());
                    } catch (TooHeightWallException e) {
                        System.out.println(e.getMessage());
                    }
                }));



    }
}
