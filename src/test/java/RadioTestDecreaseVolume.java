import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTestDecreaseVolume {
    Radio cond = new Radio();

    @Test
    void decreaseVolumeM1() {

        cond.setCurrentVolume(-1);

        int expected = 0;
        int actual = cond.decreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume0() {

        cond.setCurrentVolume(0);

        int expected = 0;
        int actual = cond.decreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume1() {

        cond.setCurrentVolume(1);

        int expected = 0;
        int actual = cond.decreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume99() {

        cond.setCurrentVolume(99);

        int expected = 98;
        int actual = cond.decreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume100() {

        cond.setCurrentVolume(100);

        int expected = 99;
        int actual = cond.decreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume101() {

        cond.setCurrentVolume(101);

        int expected = 99;
        int actual = cond.decreaseVolume();

        assertEquals(expected, actual);
    }
}