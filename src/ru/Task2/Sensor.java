package ru.Task2;

import java.util.Random;

public class Sensor {

    Random r = new Random();

    int LevelHumidity = r.nextInt(1, 100); // уровень влажности воздуха

    //конструктор
    public Sensor() {
    }

    //метод получение влажности воздуха
    public int getLevelHumidity() {
        return this.LevelHumidity;
    }
}
