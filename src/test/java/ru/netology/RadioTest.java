package ru.netology;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void increaseCurrentVolumeSuccess() {
        Radio radio = new Radio();

        radio.setMinVolume(0);
        radio.setMaxVolume(100);
        radio.setCurrentVolume(50);

        int oldVolume = radio.getCurrentVolume();

        radio.increaseCurrentVolume();

        int newVolume = radio.getCurrentVolume();

        assertEquals(oldVolume + 1, newVolume);
    }

    @Test
    void increaseCurrentVolumeExceedMaxLimit() {
        Radio radio = new Radio();

        radio.setMinVolume(0);
        radio.setMaxVolume(100);
        radio.setCurrentVolume(100);

        int oldVolume = radio.getCurrentVolume();

        radio.increaseCurrentVolume();

        int newVolume = radio.getCurrentVolume();

        assertEquals(oldVolume, newVolume);
    }

    @Test
    void decreaseCurrentVolumeSuccess() {
        Radio radio = new Radio();

        radio.setMinVolume(0);
        radio.setMaxVolume(100);
        radio.setCurrentVolume(50);

        int oldVolume = radio.getCurrentVolume();

        radio.decreaseCurrentVolume();

        int newVolume = radio.getCurrentVolume();

        assertEquals(oldVolume - 1, newVolume);
    }

    @Test
    void decreaseCurrentVolumeExceedMinLimit() {
        Radio radio = new Radio();

        radio.setMinVolume(0);
        radio.setMaxVolume(100);
        radio.setCurrentVolume(0);

        int oldVolume = radio.getCurrentVolume();

        radio.decreaseCurrentVolume();

        int newVolume = radio.getCurrentVolume();

        assertEquals(oldVolume, newVolume);
    }

    @Test
    void setCurrentVolumeExceedMinLimit() {
        Radio radio = new Radio();

        radio.setMinVolume(0);
        radio.setMaxVolume(100);
        radio.setCurrentVolume(50);

        int oldVolume = radio.getCurrentVolume();

        radio.setCurrentVolume(-1);

        int newVolume = radio.getCurrentVolume();

        assertEquals(oldVolume, newVolume);
    }

    @Test
    void setCurrentVolumeExceedMaxLimit() {
        Radio radio = new Radio();

        radio.setMinVolume(0);
        radio.setMaxVolume(100);
        radio.setCurrentVolume(50);

        int oldVolume = radio.getCurrentVolume();

        radio.setCurrentVolume(101);

        int newVolume = radio.getCurrentVolume();

        assertEquals(oldVolume, newVolume);
    }

    @Test
    void nextStationSuccess() {
        Radio radio = new Radio();

        radio.setMinStation(0);
        radio.setMaxStation(10);
        radio.setCurrentStation(4);

        int oldStation = radio.getCurrentStation();

        radio.nextStation();

        int newStation = radio.getCurrentStation();

        assertEquals(oldStation + 1, newStation);
    }

    @Test
    void nextStationExceedOvercame() {
        Radio radio = new Radio();

        radio.setMinStation(0);
        radio.setMaxStation(10);
        radio.setCurrentStation(10);

        int minStation = radio.getMinStation();

        radio.nextStation();

        int newStation = radio.getCurrentStation();

        assertEquals(minStation, newStation);
    }

    @Test
    void prevStationSuccess() {
        Radio radio = new Radio();

        radio.setMinStation(0);
        radio.setMaxStation(10);
        radio.setCurrentStation(6);

        int oldStation = radio.getCurrentStation();

        radio.prevStation();

        int newStation = radio.getCurrentStation();

        assertEquals(oldStation - 1, newStation);
    }

    @Test
    void prevStationExceedOvercame() {
        Radio radio = new Radio();

        radio.setMinStation(0);
        radio.setMaxStation(10);
        radio.setCurrentStation(0);

        int maxStation = radio.getMaxStation();

        radio.prevStation();

        int newStation = radio.getCurrentStation();

        assertEquals(maxStation, newStation);
    }

    @Test
    void setCurrentStation() {
        Radio radio = new Radio();

        radio.setMinStation(0);
        radio.setMaxStation(10);

        int stationToSelect = 5;

        radio.setCurrentStation(stationToSelect);

        int selectedStation = radio.getCurrentStation();

        assertEquals(stationToSelect, selectedStation);
    }

    @Test
    void setCurrentStationMinLimit() {
        Radio radio = new Radio();

        radio.setMinStation(0);
        radio.setMaxStation(10);
        radio.setCurrentStation(5);

        int oldStation = radio.getCurrentStation();

        radio.setCurrentStation(-1);

        int newStation = radio.getCurrentStation();

        assertEquals(oldStation, newStation);
    }

    @Test
    void setCurrentStationMaxLimit() {
        Radio radio = new Radio();

        radio.setMinStation(0);
        radio.setMaxStation(10);
        radio.setCurrentStation(5);

        int oldStation = radio.getCurrentStation();

        radio.setCurrentStation(11);

        int newStation = radio.getCurrentStation();

        assertEquals(oldStation, newStation);
    }
}
