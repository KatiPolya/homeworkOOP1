public class Radio {
    private int currentVolume;

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
        if (currentVolume > 10) {
            return 10;
        }
        if (currentVolume < 0) {
            return 0;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume <= 10) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume > 10) {
            return 10;
        }
        if (currentVolume < 0) {
            return 0;
        }
        return currentVolume;
    }

    private int currentStation;

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

        if (currentStation == 9) {
            return 0;
        }
        if (currentStation > 9) {
            currentStation = 0;
        }

        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }

        return currentStation;
    }

    public int decreaseStation() {
        if (currentStation > 9) {
            currentStation = 0;
        }

        if (currentStation == 0) {
            return 9;
        }

        if (currentStation <= 9) {
            currentStation = currentStation - 1;
        }

        return currentStation;
    }
}

