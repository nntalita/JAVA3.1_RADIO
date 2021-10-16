package ru.netology.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
        Radio radio = new Radio();
//тестирую метод прямой установки номера станции
//    @Test
    @ParameterizedTest
    @CsvFileSource(resources = "/dataDirectInstallation.csv")

    public void shouldCurrentRadioStationTest(int station, int expected) {
//        Radio radio = new Radio();

        radio.setCurrentRadioStation(station);
        int actual = radio.getCurrentRadioStation();
//        int expected = 0;
        assertEquals(expected, actual);
        System.out.println("прямая установка  " + "кнопка " + station);
        System.out.print("ожидаемый результат " + expected);
        System.out.println(" фактический результат " + actual);
    }

    //      тестирую метод переключения станции кнопкой next
    @ParameterizedTest
    @CsvFileSource(resources = "/dataNext.csv")
    public void shouldNextStationButtonTest(int station, int expected) {
//        Radio radio = new Radio();
        radio.setCurrentRadioStation(station);
        radio.nextStationButton();
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
        System.out.println("установленная станция "  + station + " кнопка +");
        System.out.print("ожидаемый результат " + expected);
        System.out.println(" фактический результат " + actual);
    }

    //      тестирую метод переключения станции кнопкой prev
    @ParameterizedTest
    @CsvFileSource(resources = "/dataPrev.csv")
    public void shouldPrevStationButtonTest(int station, int expected) {
//        Radio radio = new Radio();
        radio.setCurrentRadioStation(station);
        radio.prevStationButton();
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
        System.out.println("установленная станция "  + station + " кнопка -");
        System.out.print("ожидаемый результат " + expected);
        System.out.println(" фактический результат " + actual);
    }

    //      тестирую метод переключения громкости +
    @ParameterizedTest
    @CsvFileSource(resources = "/dataVolume+.csv")
    public void shouldVolumeIncreaseTest(int volume, int expected) {
//        Radio radio = new Radio();
        radio.setCurrentVolume(volume);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
        System.out.println("установленная громкость "  + volume + " кнопка +");
        System.out.print("ожидаемый результат " + expected);
        System.out.println(" фактический результат " + actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataVolume-.csv")
    public void shouldVolumeDecreaseTest(int volume, int expected) {
//        Radio radio = new Radio();
        radio.setCurrentVolume(volume);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
        System.out.println("установленная громкость "  + volume + " кнопка -");
        System.out.print("ожидаемый результат " + expected);
        System.out.println(" фактический результат " + actual);

    }
}


