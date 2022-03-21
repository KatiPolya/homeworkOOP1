import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioIncreaseVolumeTest {
    Radio cond = new Radio();

    @Test
    void increaseVolumeM1() {

        cond.setCurrentVolume(-1);

        int expected = 1;
        int actual = cond.increaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume0() {

        cond.setCurrentVolume(0);

        int expected = 1;
        int actual = cond.increaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume1() {

        cond.setCurrentVolume(1);

        int expected = 2;
        int actual = cond.increaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume99() {

        cond.setCurrentVolume(99);

        int expected = 100;
        int actual = cond.increaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume100() {

        cond.setCurrentVolume(100);

        int expected = 100;
        int actual = cond.increaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume101() {

        cond.setCurrentVolume(101);

        int expected = 100;
        int actual = cond.increaseVolume();

        assertEquals(expected, actual);
    }
}