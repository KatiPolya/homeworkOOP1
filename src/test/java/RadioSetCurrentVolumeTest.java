import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioSetCurrentVolumeTest {

    @Test
    void setCurrentVolumeM1() {
        Radio cond = new Radio();
        cond.setCurrentVolume(-1);

        int expected = 0;
        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume0() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);

        int expected = 0;
        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume1() {
        Radio cond = new Radio();
        cond.setCurrentVolume(1);

        int expected = 1;
        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume9() {
        Radio cond = new Radio();
        cond.setCurrentVolume(9);

        int expected = 9;
        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume10() {
        Radio cond = new Radio();
        cond.setCurrentVolume(10);

        int expected = 10;
        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume11() {
        Radio cond = new Radio();
        cond.setCurrentVolume(11);

        int expected = 10;
        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }
}