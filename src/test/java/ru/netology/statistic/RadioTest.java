package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test

    public void showTheSelectedRadioStationTestFirst() {
        Radio stations = new Radio();
        stations.setPlayingRadioStations(0);

        int expected = 0;
        int actual = stations.getPlayingRadioStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void showTheSelectedRadioStationTestSecond() {
        Radio stations = new Radio();
        stations.setPlayingRadioStations(7);

        int expected = 7;
        int actual = stations.getPlayingRadioStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void showTheSelectedRadioStationTestThird() {
        Radio stations = new Radio();
        stations.setPlayingRadioStations(9);

        int expected = 9;
        int actual = stations.getPlayingRadioStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void showTheSelectedRadioStationTestFourth() {
        Radio stations = new Radio();
        stations.setPlayingRadioStations(10);

        int expected = 0;
        int actual = stations.getPlayingRadioStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void showTheSelectedRadioStationTestFifth() {
        Radio stations = new Radio();
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
        Radio stations = new Radio();
        stations.setPlayingRadioStations(6);
        stations.next();
        int expected = 7;
        int actual = stations.getPlayingRadioStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void bannedRadioStationTestEighth() {
        Radio stations = new Radio();
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
        Radio stations = new Radio();
        stations.setPlayingRadioStations(6);
        stations.prev();
        int expected = 5;
        int actual = stations.getPlayingRadioStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prohibitedRadioStationBelowTheMinimumTestEleven() {
        Radio stations = new Radio();
        stations.setPlayingRadioStations(9);
        stations.prev();
        int expected = 8;
        int actual = stations.getPlayingRadioStations();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void showTheCurrentSoundTestTwelve() {
        Radio stations = new Radio();
        stations.setSelectedSoundVolume(0);
        int expected = 0;
        int actual = stations.getSelectedSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void showTheCurrentSoundTestThirteenth() {
        Radio stations = new Radio();
        stations.setSelectedSoundVolume(56);
        int expected = 56;
        int actual = stations.getSelectedSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void showTheCurrentSoundTestFourteenth() {
        Radio stations = new Radio();
        stations.setSelectedSoundVolume(100);
        int expected = 100;
        int actual = stations.getSelectedSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void showTheCurrentSoundTestFifteenth() {
        Radio stations = new Radio();
        stations.setSelectedSoundVolume(101);
        int expected = 0;
        int actual = stations.getSelectedSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void showTheCurrentSoundTestSixteen() {
        Radio stations = new Radio();
        stations.setSelectedSoundVolume(-1);
        int expected = 0;
        int actual = stations.getSelectedSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void checkingTheVolumeTestSeventeenth() {
        Radio stations = new Radio();
        stations.setSelectedSoundVolume(0);
        stations.increaseTheVolume();

        int expected = 1;
        int actual = stations.getSelectedSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingTheVolumeTestEighteenth() {
        Radio stations = new Radio();
        stations.setSelectedSoundVolume(76);
        stations.increaseTheVolume();

        int expected = 77;
        int actual = stations.getSelectedSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingTheVolumeTestNineteenth() {
        Radio stations = new Radio();
        stations.setSelectedSoundVolume(100);
        stations.increaseTheVolume();

        int expected = 100;
        int actual = stations.getSelectedSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingTheVolumeReductionTestTwentieth() {
        Radio stations = new Radio();
        stations.setSelectedSoundVolume(100);
        stations.volumeReduction();
        int expected = 99;
        int actual = stations.getSelectedSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void checkingTheVolumeReductionTestTwentyFirst() {
        Radio stations = new Radio();
        stations.setSelectedSoundVolume(48);
        stations.volumeReduction();
        int expected = 47;
        int actual = stations.getSelectedSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void checkingTheVolumeReductionTestTwentySecond() {
        Radio stations = new Radio();
        stations.setSelectedSoundVolume(0);
        stations.volumeReduction();
        int expected = 0;
        int actual = stations.getSelectedSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

}
