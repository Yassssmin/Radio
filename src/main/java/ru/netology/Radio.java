package ru.netology;

public class Radio {

//    Обьявленеие всех переменных
    private String name;
    private int maxVolume;
    private int minVolume;
    private int currentVolume;
    private int quantityStation;
    private int currentStation;
    private int minStation;
    private boolean on;

    public Radio() {
        this.quantityStation = 10;
    }

    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
    }


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

    // сеттеры и геттеры для переменных станций
    public int getQuantityStation() {
        return quantityStation;
    }

    public void setQuantityStation(int quantityStation) {
        this.quantityStation = quantityStation;
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

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }

        this.currentVolume = currentVolume;
    }

    // методы для станций
    public void nextStation() {
        int newStation;

        newStation = this.currentStation + 1;

        if (newStation > this.quantityStation) {
            this.currentStation = this.minStation;

            return;
        }

        this.currentStation = newStation;
    }

    public void prevStation() {
        int newStation;

        newStation = this.currentStation - 1;

        if (newStation < this.minStation) {
            this.currentStation = this.quantityStation;

            return;
        }

        this.currentStation = newStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > quantityStation) {
            return;
        }

        if (currentStation < minStation) {
            return;
        }

        this.currentStation = currentStation;
    }
}

