import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioDecreaseVolumeTest {

    @Test
    void decreaseVolumeM1() {
        Radio cond = new Radio();
        cond.setCurrentVolume(-1);

        int expected = 0;
        int actual = cond.decreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume0() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);

        int expected = 0;
        int actual = cond.decreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume1() {
        Radio cond = new Radio();
        cond.setCurrentVolume(1);

        int expected = 0;
        int actual = cond.decreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume9() {
        Radio cond = new Radio();
        cond.setCurrentVolume(9);

        int expected = 8;
        int actual = cond.decreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume10() {
        Radio cond = new Radio();
        cond.setCurrentVolume(10);

        int expected = 9;
        int actual = cond.decreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume11() {
        Radio cond = new Radio();
        cond.setCurrentVolume(11);

        int expected = 9;
        int actual = cond.decreaseVolume();

        assertEquals(expected, actual);
    }
}