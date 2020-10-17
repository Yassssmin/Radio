package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

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

    // методы для звука
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }

        this.currentVolume = currentVolume;
    }

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
    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }

        if (currentStation < minStation) {
            return;
        }

        this.currentStation = currentStation;
    }

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

