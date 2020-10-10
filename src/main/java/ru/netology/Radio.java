package ru.netology;

public class Radio {

//    Обьявленеие всех переменных
    private String name;
    private int maxVolume;
    private int minVolume;
    private int currentVolume;
    private int quantityStation;
    private int currentStation;
    private int maxStation;
    private int minStation;
    private boolean on;

    // Сеттеры и геттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    // Сеттеры и геттеры для переменных звука
    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }

        this.currentVolume = currentVolume;
    }

    // сеттеры и геттеры для переменных станций
    public int getQuantityStation() {
        return quantityStation;
    }

    public void setQuantityStation(int quantityStation) {
        this.quantityStation = quantityStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }

        if (currentStation < minStation) {
            return;
        }

        this.currentStation = currentStation;
    }

    // методы для звука
    public void increaseCurrentVolume() {
        int newVolume;

        newVolume = this.currentVolume + 1;

        if (newVolume > this.maxVolume) {
            return;
        }

        this.currentVolume = newVolume;
    }

    public void decreaseCurrentVolume() {
        int newVolume;

        newVolume = this.currentVolume - 1;

        if (newVolume < this.minVolume) {
            return;
        }

        this.currentVolume = newVolume;
    }

    // методы для станций
    public void nextStation() {
        int newStation;

        newStation = this.currentStation + 1;

        if (newStation > this.maxStation) {
            this.currentStation = this.minStation;

            return;
        }

        this.currentStation = newStation;
    }

    public void prevStation() {
        int newStation;

        newStation = this.currentStation - 1;

        if (newStation < this.minStation) {
            this.currentStation = this.maxStation;

            return;
        }

        this.currentStation = newStation;
    }
}

