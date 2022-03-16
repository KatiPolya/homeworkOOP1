import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTestSetCurrentVolume {
    Radio cond = new Radio();

    @Test
    void setCurrentVolumeM1() {

        cond.setCurrentVolume(-1);

        int expected = 0;
        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume0() {

        cond.setCurrentVolume(0);

        int expected = 0;
        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume1() {

        cond.setCurrentVolume(1);

        int expected = 1;
        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume99() {

        cond.setCurrentVolume(99);

        int expected = 99;
        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume100() {

        cond.setCurrentVolume(100);

        int expected = 100;
        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume101() {

        cond.setCurrentVolume(101);

        int expected = 100;
        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }
}