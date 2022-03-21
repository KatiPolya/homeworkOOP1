public class Radio {
    private int currentVolume;
    private int currentStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            currentVolume = 10;
        }
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        this.currentVolume = currentVolume;
        return currentVolume;
    }


    public int increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        currentVolume = currentVolume - 1;
        if (currentVolume < 0) {
            return 0;
        }
        return currentVolume;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int increaseStation() {
        currentStation = currentStation + 1;

        if (currentStation > 9) {
            return 0;
        }
        return currentStation;
    }

    public int decreaseStation() {
        currentStation = currentStation - 1;

        if (currentStation < 0) {
            return 9;
        }

        return currentStation;
    }
}

