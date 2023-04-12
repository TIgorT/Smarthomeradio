package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio stations = new Radio();

    @Test
    public void checkingTheWorkOfLombokTestTheFirst() {

        stations.setPlayingRadioStations(7);
        Assertions.assertEquals(9, stations.getMaxStations());
        Assertions.assertEquals(0, stations.getMinStations());
        Assertions.assertEquals(7, stations.getPlayingRadioStations());
    }

    @Test
    public void checkingTheWorkOfLombokTestTheSecond() {
        Radio stations = new Radio(34);
        stations.setPlayingRadioStations(25);
        Assertions.assertEquals(34, stations.getNumberOfRadioStations());
        Assertions.assertEquals(33, stations.getMaxStations());
        Assertions.assertEquals(0, stations.getMinStations());
        Assertions.assertEquals(25, stations.getPlayingRadioStations());
    }

    @Test
    public void checkingTheWorkOfLombokTestTheThird() {
        stations.setPlayingRadioStations(13);
        Assertions.assertEquals(0, stations.getPlayingRadioStations());
    }

    @Test
    public void checkingTheWorkOfLombokTestTheFourth() {
        stations.setPlayingRadioStations(-1);
        Assertions.assertEquals(0, stations.getPlayingRadioStations());
    }

    @Test
    public void checkingTheWorkOfLombokTestTheFifth() {
        stations.setPlayingRadioStations(7);
        stations.next();
        Assertions.assertEquals(8, stations.getPlayingRadioStations());
    }

    @Test
    public void checkingTheWorkOfLombokTestTheSixth() {
        stations.setPlayingRadioStations(9);
        stations.next();
        Assertions.assertEquals(0, stations.getPlayingRadioStations());

    }

    @Test
    public void checkingTheWorkOfLombokTestTheSeventh() {
        stations.setPlayingRadioStations(4);
        stations.prev();
        Assertions.assertEquals(3, stations.getPlayingRadioStations());
    }

    @Test
    public void checkingTheWorkOfLombokTestTheEighth() {
        stations.setPlayingRadioStations(0);
        stations.prev();
        Assertions.assertEquals(9, stations.getPlayingRadioStations());
    }

    @Test
    public void checkingTheWorkOfLombokTestTheNinth() {
        stations.setSelectedSoundVolume(25);
        Assertions.assertEquals(100, stations.getMaxSoundVolume());
        Assertions.assertEquals(0, stations.getMinSoundVolume());
        Assertions.assertEquals(25, stations.getSelectedSoundVolume());
    }

    @Test
    public void checkingTheWorkOfLombokTestTheTen() {
        stations.setSelectedSoundVolume(101);
        Assertions.assertEquals(0, stations.getSelectedSoundVolume());
    }

    @Test
    public void checkingTheWorkOfLombokTestTheEleven() {
        stations.setSelectedSoundVolume(-1);
        Assertions.assertEquals(0, stations.getSelectedSoundVolume());
    }

    @Test
    public void checkingTheWorkOfLombokTestTheTwelve() {
        stations.setSelectedSoundVolume(35);
        stations.increaseTheVolume();
        Assertions.assertEquals(36, stations.getSelectedSoundVolume());
    }

    @Test
    public void checkingTheWorkOfLombokTestTheThirteenth() {
        stations.setSelectedSoundVolume(100);
        stations.increaseTheVolume();
        Assertions.assertEquals(100, stations.getSelectedSoundVolume());

    }

    @Test
    public void checkingTheWorkOfLombokTestTheFourteenth() {
        stations.setSelectedSoundVolume(24);
        stations.volumeReduction();
        Assertions.assertEquals(23, stations.getSelectedSoundVolume());
    }

    @Test
    public void checkingTheWorkOfLombokTestTheFifteenth() {
        stations.setSelectedSoundVolume(0);
        stations.volumeReduction();
        Assertions.assertEquals(0, stations.getSelectedSoundVolume());
    }
}
