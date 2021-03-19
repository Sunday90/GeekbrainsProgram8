package ru.geekbrains;

import ru.geekbrains.exceptions.TooHeightWallException;
import ru.geekbrains.exceptions.TooLongException;

public interface IActionable {
    void run(int i);
    void jump(int i);
    void go(IBarrierable barrier) throws TooLongException, TooHeightWallException;
}
