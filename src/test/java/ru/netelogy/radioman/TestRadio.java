package ru.netelogy.radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radioman.Radio;

public class TestRadio {


    // Тесты на переключение громкости радио

    @Test
    public void shouldIncreaseCurrentVolumeAverage() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseCurrentVolumeAbove() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseInCurrentVolumeBelow() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseInCurrentVolumeAverage() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        radio.decreaseVolume();

        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAboveSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBelowSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // Тесты на переключение радио станций


    @Test
    public void shouldToNextStationAverage() {
        Radio station = new Radio();
        station.setCurrentStation(4);
        station.next();

        int expectedStation = 5;
        int actualStation = station.getCurrentStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void shouldToNextStationAbove() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.next();

        int expectedStation = 0;
        int actualStation = station.getCurrentStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void shouldToPrevStationAverage() {
        Radio station = new Radio();
        station.setCurrentStation(4);
        station.prev();

        int expectedStation = 3;
        int actualStation = station.getCurrentStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void shouldToPrevStationBelow() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        station.prev();

        int expectedStation = 9;
        int actualStation = station.getCurrentStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void shouldAboveSetCurrentStation() {
        Radio station = new Radio();
        station.setCurrentStation(10);

        int expectedVolume = 0;
        int actualVolume = station.getCurrentStation();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void shouldBelowSetCurrentStation() {
        Radio station = new Radio();
        station.setCurrentStation(-1);

        int expectedVolume = 0;
        int actualVolume = station.getCurrentStation();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

}
