public class Radio {
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

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
        if (currentVolume > maxVolume) {
            return maxVolume;
        }
        if (currentVolume < minVolume) {
            return minVolume;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume <= maxVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume > maxVolume) {
            return maxVolume;
        }
        if (currentVolume < minVolume) {
            return minVolume;
        }
        return currentVolume;
    }

    private int currentStation;
    private int minStation = 0;
    private int maxStation = 9;

    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }

    public Radio() {
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
        if (currentStation > maxStation) {
            currentStation = minStation;
        }

        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        }

        return currentStation;
    }

    public int decreaseStation() {
        if (currentStation > maxStation) {
            currentStation = minStation;
        }

        if (currentStation == minStation) {
            return maxStation;
        }

        if (currentStation <= maxStation) {
            currentStation = currentStation - 1;
        }

        return currentStation;
    }
}

