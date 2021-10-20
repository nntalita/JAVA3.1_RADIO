package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
//    тесты на установку пользовательского количества станций
    Radio radioUser = new Radio(50);

    @ParameterizedTest
    @CsvFileSource(resources = "/dataDirectInstallationUser.csv")

    public void shouldCurrentRadioStationTestUser(int station, int expected) {

        radioUser.setCurrentRadioStation(station);
        int actual = radioUser.getCurrentRadioStation();
        assertEquals(expected, actual);

    }
    //      тестирую метод переключения станции кнопкой next
    @ParameterizedTest
    @CsvFileSource(resources = "/dataNextUser.csv")
    public void shouldNextStationButtonTestUser(int station, int expected) {

        radioUser.setCurrentRadioStation(station);
        radioUser.nextStationButton();
        int actual = radioUser.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    //      тестирую метод переключения станции кнопкой prev
    @ParameterizedTest
    @CsvFileSource(resources = "/dataPrevUser.csv")
    public void shouldPrevStationButtonTestUser(int station, int expected) {

        radioUser.setCurrentRadioStation(station);
        radioUser.prevStationButton();
        int actual = radioUser.getCurrentRadioStation();
        assertEquals(expected, actual);

    }


    //    тесты на установку количества радиостанций по умолчанию
    Radio radio = new Radio();

    //тестирую метод прямой установки номера станции
    @ParameterizedTest
    @CsvFileSource(resources = "/dataDirectInstallation.csv")

    public void shouldCurrentRadioStationTest(int station, int expected) {

        radio.setCurrentRadioStation(station);
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);

    }

    //      тестирую метод переключения станции кнопкой next
    @ParameterizedTest
    @CsvFileSource(resources = "/dataNext.csv")
    public void shouldNextStationButtonTest(int station, int expected) {

        radio.setCurrentRadioStation(station);
        radio.nextStationButton();
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);

    }

    //      тестирую метод переключения станции кнопкой prev
    @ParameterizedTest
    @CsvFileSource(resources = "/dataPrev.csv")
    public void shouldPrevStationButtonTest(int station, int expected) {

        radio.setCurrentRadioStation(station);
        radio.prevStationButton();
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);

    }

    //      тестирую метод переключения громкости +
    @ParameterizedTest
    @CsvFileSource(resources = "/dataVolume+.csv")
    public void shouldVolumeIncreaseTest(int volume, int expected) {

        radio.setCurrentVolume(volume);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataVolume-.csv")
    public void shouldVolumeDecreaseTest(int volume, int expected) {

        radio.setCurrentVolume(volume);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);


    }
}


