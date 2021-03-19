package ru.geekbrains;

public class Wall implements IBarrierable{
    int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    private void setHeight(int height) {
        this.height = height;
    }
}
