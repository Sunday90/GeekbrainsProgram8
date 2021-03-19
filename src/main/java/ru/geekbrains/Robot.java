package ru.geekbrains;

import ru.geekbrains.exceptions.TooLongException;

public class Robot implements IActionable{
    String name;
    int maxRun;
    int maxJump;

    public Robot(String name, int maxRun, int maxJump) {
        setName(name);
        setMaxRun(maxRun);
        setMaxJump(maxJump);
    }


    @Override
    public void run(int i) {
        System.out.printf("%s пробежал %d м.\n", getName(), i);
    }

    @Override
    public void jump(int i) {
        System.out.printf("%s прыгнул на %d м.\n", getName(), i);
    }

    @Override
    public void go(IBarrierable barrier) throws TooLongException {
        if (barrier instanceof Treadmill) {
            Treadmill t = (Treadmill) barrier;
            if (t.getLenght()>getMaxRun()) {
                throw new TooLongException(String.format("Threadmill lenght is %d, but robot limit is %d.", t.getLenght(), getMaxRun()));
            }
            else {
                run(t.getLenght());
            }
        }

        else {
            Wall w = (Wall) barrier;
            if (w.getHeight()>getMaxJump()) {
                throw new TooLongException(String.format("Wall heaight is %d, but robot limit is %d.", w.getHeight(), getMaxJump()));
            }
            else {
                jump(w.getHeight());
            }
        }
    }


    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    private void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }

    private void setMaxJump(int maxJump) {
        this.maxJump = maxJump;
    }
}
