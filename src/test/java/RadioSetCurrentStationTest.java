import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioSetCurrentStationTest {

    @Test
    void setCurrentStation() {
        Radio cond = new Radio();
        cond.setCurrentStation(-1);

        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStation0() {
        Radio cond = new Radio();
        cond.setCurrentStation(0);

        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStation1() {
        Radio cond = new Radio();
        cond.setCurrentStation(1);

        int expected = 1;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStation8() {
        Radio cond = new Radio();
        cond.setCurrentStation(8);

        int expected = 8;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStation9() {
        Radio cond = new Radio();
        cond.setCurrentStation(9);

        int expected = 9;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStation10() {
        Radio cond = new Radio();
        cond.setCurrentStation(10);

        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }
}