package ru.netology.domain;

public class Radio {


    private int currentVolume;
    private int currentRadioStation;
    private int numberRadioStation = 10;

public Radio (){
    this.numberRadioStation = numberRadioStation - 1;
}
public Radio (int numberRadioStation){
    this.numberRadioStation = numberRadioStation - 1;

}
    //    количество доступных станций
    public int getMaxStation() {

        return numberRadioStation;
    }

    //   предел громкости
    public int getMaxVolume() {

        return 100;
    }
// НАСТРОЙКА

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }


    // установка текущей станции через прямое указание её номера
    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > getMaxStation()) {
            return;
        }
        this.currentRadioStation = currentRadioStation;

    }

    //        переключение радиостанций при нажатии кнопки next
    public void nextStationButton() {

        if (currentRadioStation < getMaxStation()) {
            this.currentRadioStation = currentRadioStation + 1;
            return;
        }
        this.currentRadioStation = 0;

    }

    //        переключение радиостанций  при нажатии кнопки prev
    public void prevStationButton() {

        if (currentRadioStation > 0) {
            this.currentRadioStation = currentRadioStation - 1;
            return;
        }
        this.currentRadioStation = getMaxStation();

    }

    //    ГРОМКОСТЬ
    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;

    }

    //увеличение громкости

    public void increaseVolume() {

        if (currentVolume < getMaxVolume()) {
            this.currentVolume = currentVolume + 1;
            return;
        }
        this.currentVolume = getMaxVolume();
    }


//    уменьшение громкости

    public void decreaseVolume() {

        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
            return;
        }
        currentVolume = 0;
    }
}

