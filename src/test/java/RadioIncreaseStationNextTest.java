import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioIncreaseStationNextTest {

    @Test
    void increaseStationM1() {
        Radio cond = new Radio();

        cond.setCurrentStation(-1);
        int expected = 1;
        int actual = cond.increaseStation();

        assertEquals(expected, actual);
    }

    @Test
    void increaseStation0() {
        Radio cond = new Radio();

        cond.setCurrentStation(0);
        int expected = 1;
        int actual = cond.increaseStation();

        assertEquals(expected, actual);
    }

    @Test
    void increaseStation1() {
        Radio cond = new Radio();

        cond.setCurrentStation(1);
        int expected = 2;
        int actual = cond.increaseStation();

        assertEquals(expected, actual);
    }

    @Test
    void increaseStation8() {
        Radio cond = new Radio();

        cond.setCurrentStation(8);
        int expected = 9;
        int actual = cond.increaseStation();

        assertEquals(expected, actual);
    }

    @Test
    void increaseStation9() {
        Radio cond = new Radio();

        cond.setCurrentStation(9);
        int expected = 0;
        int actual = cond.increaseStation();

        assertEquals(expected, actual);
    }

    @Test
    void increaseStation10() {
        Radio cond = new Radio();

        cond.setCurrentStation(10);
        int expected = 1;
        int actual = cond.increaseStation();

        assertEquals(expected, actual);
    }

}