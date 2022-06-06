public class Radio {
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentStation;
    private int minStation = 0;
    private int maxStation;
    private int numberOfStation = 10;

    public Radio(int numberOfStation) {
        this.numberOfStation = numberOfStation;
        maxStation = this.numberOfStation - 1;
    }

    public Radio() {
        maxStation = numberOfStation - 1;
    }


    public int countMaxStation(int numberOfStation) {
        maxStation = numberOfStation - 1;
        return maxStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        this.currentVolume = currentVolume;
        return currentVolume;
    }


    public int increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        currentVolume = currentVolume - 1;

        if (currentVolume < minVolume) {
            return minVolume;
        }
        return currentVolume;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int increaseStation() {

        if (currentStation == maxStation) {
            return minStation;
        }
        currentStation = currentStation + 1;

        return currentStation;
    }

    public int decreaseStation() {
        if (currentStation == minStation) {
            return maxStation;
        }
        currentStation = currentStation - 1;

        return currentStation;
    }
}

