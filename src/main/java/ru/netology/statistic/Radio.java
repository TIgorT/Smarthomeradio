package ru.netology.statistic;

public class Radio {
    private int playingRadioStations;
    private int maxStations = 9;
    private int minStations = 0;
    private int selectedSoundVolume;
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;


    public int getPlayingRadioStations() {
        return playingRadioStations;
    }

    public void setPlayingRadioStations(int newPlayingRadioStations) {
        if (newPlayingRadioStations > maxStations) {
            return;
        }
        if (newPlayingRadioStations < minStations) {
            return;
        }
        playingRadioStations = newPlayingRadioStations;
    }

    public int next() {
        if (playingRadioStations < maxStations) {
            playingRadioStations++;
        } else {
            playingRadioStations = minStations;
        }
        return playingRadioStations;
    }

    public int prev() {
        if (playingRadioStations > minStations) {
            playingRadioStations--;
        } else {
            playingRadioStations = maxStations;
        }
        return playingRadioStations;
    }

    public int getSelectedSoundVolume() {
        return selectedSoundVolume;
    }

    public void setSelectedSoundVolume(int newSelectedSoundVolume) {
        if (newSelectedSoundVolume > maxSoundVolume) {
            return;
        }
        if (newSelectedSoundVolume < minSoundVolume) {
            return;
        }
        selectedSoundVolume = newSelectedSoundVolume;
    }

    public int increaseTheVolume() {
        if (selectedSoundVolume < maxSoundVolume) {
            selectedSoundVolume++;
        }
        return selectedSoundVolume;
    }

    public int volumeReduction() {
        if (selectedSoundVolume > minSoundVolume) {
            selectedSoundVolume--;
        }
        return selectedSoundVolume;
    }

}

