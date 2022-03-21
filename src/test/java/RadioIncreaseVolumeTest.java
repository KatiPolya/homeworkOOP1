import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioIncreaseVolumeTest {

    @Test
    void increaseVolumeM1() {
        Radio cond = new Radio();
        cond.setCurrentVolume(-1);

        int expected = 1;
        int actual = cond.increaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume0() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);

        int expected = 1;
        int actual = cond.increaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume1() {
        Radio cond = new Radio();
        cond.setCurrentVolume(1);

        int expected = 2;
        int actual = cond.increaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume9() {
        Radio cond = new Radio();
        cond.setCurrentVolume(9);

        int expected = 10;
        int actual = cond.increaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume10() {
        Radio cond = new Radio();
        cond.setCurrentVolume(10);

        int expected = 10;
        int actual = cond.increaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume11() {
        Radio cond = new Radio();
        cond.setCurrentVolume(11);

        int expected = 10;
        int actual = cond.increaseVolume();

        assertEquals(expected, actual);
    }
}