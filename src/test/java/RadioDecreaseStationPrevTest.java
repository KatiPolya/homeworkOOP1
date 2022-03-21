import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioDecreaseStationPrevTest {
    @Test
    void decreaseStationM1() {
        Radio cond = new Radio();

        cond.setCurrentStation(-1);
        int expected = 9;
        int actual = cond.decreaseStation();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseStation0() {
        Radio cond = new Radio();

        cond.setCurrentStation(0);
        int expected = 9;
        int actual = cond.decreaseStation();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseStation1() {
        Radio cond = new Radio();

        cond.setCurrentStation(1);
        int expected = 0;
        int actual = cond.decreaseStation();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseStation8() {
        Radio cond = new Radio();

        cond.setCurrentStation(8);
        int expected = 7;
        int actual = cond.decreaseStation();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseStation9() {
        Radio cond = new Radio();

        cond.setCurrentStation(9);
        int expected = 8;
        int actual = cond.decreaseStation();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseStation10() {
        Radio cond = new Radio();

        cond.setCurrentStation(10);
        int expected = 9;
        int actual = cond.decreaseStation();

        assertEquals(expected, actual);
    }
}