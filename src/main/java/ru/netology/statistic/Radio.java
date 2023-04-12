package ru.netology.statistic;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int numberOfRadioStations = 10;
    private int maxStations = 9;
    private int minStations = 0;
    private int playingRadioStations = minStations;
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;
    private int selectedSoundVolume;


    public Radio(int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;
        maxStations = numberOfRadioStations - 1;

    }

    public void setPlayingRadioStations(int playingRadioStations) {
        if (playingRadioStations > maxStations) {
            return;
        }
        if (playingRadioStations < minStations) {
            return;
        }
        this.playingRadioStations = playingRadioStations;
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

    public void setSelectedSoundVolume(int selectedSoundVolume) {
        if (selectedSoundVolume > maxSoundVolume) {
            return;
        }
        if (selectedSoundVolume < minSoundVolume) {
            return;
        }
        this.selectedSoundVolume = selectedSoundVolume;
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

