package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio stations = new Radio();

    @Test

    public void numberOfRadioStationsTestFirst() {
        Radio stations = new Radio(10);

        Assertions.assertEquals(10, stations.getNumberOfRadioStations());
    }

    @Test

    public void numberOfRadioStationsTestSecond() {
        Radio stations = new Radio(10);

        Assertions.assertEquals(9, stations.getMaxStations());
    }

    @Test
    public void numberOfRadioStationsTestThird() {
        Radio stations = new Radio(7);

        Assertions.assertEquals(0, stations.getMinStations());
    }


    @Test
    public void numberOfRadioStationsTestFourth() {
        Radio stations = new Radio(35);
        Assertions.assertEquals(35, stations.getNumberOfRadioStations());
        Assertions.assertEquals(34, stations.getMaxStations());
        Assertions.assertEquals(0, stations.getMinStations());

    }

    @Test
    public void numberOfRadioStationsTestFifth() {
        Radio stations = new Radio(34);
        stations.setPlayingRadioStations(32);
        stations.next();
        Assertions.assertEquals(33, stations.getPlayingRadioStations());
    }

    @Test
    public void numberOfRadioStationsTestSixth() {
        Radio stations = new Radio(34);
        stations.setPlayingRadioStations(3);
        stations.prev();
        Assertions.assertEquals(2, stations.getPlayingRadioStations());
    }

    //Тесты предыдущего домашнего задания
    @Test

    public void showTheSelectedRadioStationTestFirst() {

        stations.setPlayingRadioStations(0);

        int expected = 0;
        int actual = stations.getPlayingRadioStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void showTheSelectedRadioStationTestSecond() {

        stations.setPlayingRadioStations(7);

        int expected = 7;
        int actual = stations.getPlayingRadioStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void showTheSelectedRadioStationTestThird() {

        stations.setPlayingRadioStations(9);

        int expected = 9;
        int actual = stations.getPlayingRadioStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void showTheSelectedRadioStationTestFourth() {

        stations.setPlayingRadioStations(10);

        int expected = 0;
        int actual = stations.getPlayingRadioStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void showTheSelectedRadioStationTestFifth() {

        stations.setPlayingRadioStations(-1);

        int expected = 0;
        int actual = stations.getPlayingRadioStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void bannedRadioStationTestSixth() {
        Radio stations = new Radio();
        stations.setPlayingRadioStations(0);
        stations.next();
        int expected = 1;
        int actual = stations.getPlayingRadioStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void bannedRadioStationTestSeventh() {

        stations.setPlayingRadioStations(6);
        stations.next();
        int expected = 7;
        int actual = stations.getPlayingRadioStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void bannedRadioStationTestEighth() {

        stations.setPlayingRadioStations(9);
        stations.next();
        int expected = 0;
        int actual = stations.getPlayingRadioStations();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void prohibitedRadioStationBelowTheMinimumTestNinth() {
        Radio stations = new Radio();
        stations.setPlayingRadioStations(0);
        stations.prev();
        int expected = 9;
        int actual = stations.getPlayingRadioStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prohibitedRadioStationBelowTheMinimumTestTen() {

        stations.setPlayingRadioStations(6);
        stations.prev();
        int expected = 5;
        int actual = stations.getPlayingRadioStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prohibitedRadioStationBelowTheMinimumTestEleven() {

        stations.setPlayingRadioStations(9);
        stations.prev();
        int expected = 8;
        int actual = stations.getPlayingRadioStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void showTheCurrentSoundTestTwelve() {

        stations.setSelectedSoundVolume(0);
        int expected = 0;
        int actual = stations.getSelectedSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void showTheCurrentSoundTestThirteenth() {

        stations.setSelectedSoundVolume(56);
        int expected = 56;
        int actual = stations.getSelectedSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void showTheCurrentSoundTestFourteenth() {

        stations.setSelectedSoundVolume(100);
        int expected = 100;
        int actual = stations.getSelectedSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void showTheCurrentSoundTestFifteenth() {

        stations.setSelectedSoundVolume(101);
        int expected = 0;
        int actual = stations.getSelectedSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void showTheCurrentSoundTestSixteen() {

        stations.setSelectedSoundVolume(-1);
        int expected = 0;
        int actual = stations.getSelectedSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void checkingTheVolumeTestSeventeenth() {

        stations.setSelectedSoundVolume(0);
        stations.increaseTheVolume();

        int expected = 1;
        int actual = stations.getSelectedSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingTheVolumeTestEighteenth() {

        stations.setSelectedSoundVolume(76);
        stations.increaseTheVolume();

        int expected = 77;
        int actual = stations.getSelectedSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingTheVolumeTestNineteenth() {

        stations.setSelectedSoundVolume(100);
        stations.increaseTheVolume();

        int expected = 100;
        int actual = stations.getSelectedSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingTheVolumeReductionTestTwentieth() {

        stations.setSelectedSoundVolume(100);
        stations.volumeReduction();
        int expected = 99;
        int actual = stations.getSelectedSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void checkingTheVolumeReductionTestTwentyFirst() {

        stations.setSelectedSoundVolume(48);
        stations.volumeReduction();
        int expected = 47;
        int actual = stations.getSelectedSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void checkingTheVolumeReductionTestTwentySecond() {

        stations.setSelectedSoundVolume(0);
        stations.volumeReduction();
        int expected = 0;
        int actual = stations.getSelectedSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

}
