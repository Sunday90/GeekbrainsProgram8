package ru.geekbrains;

public class Treadmill implements IBarrierable{
    int lenght;

    public Treadmill(int lenght) {
        this.lenght = lenght;
    }

    public int getLenght() {
        return lenght;
    }

    private void setLenght(int lenght) {
        this.lenght = lenght;
    }
}
