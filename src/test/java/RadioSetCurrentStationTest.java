import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioSetCurrentStationTest {
    Radio cond = new Radio(20);

    @Test
    void setCurrentStation() {

        cond.setCurrentStation(15);

        int expected = 15;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStation0() {

        cond.setCurrentStation(0);

        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStation1() {

        cond.setCurrentStation(1);

        int expected = 1;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStation8() {

        cond.setCurrentStation(8);

        int expected = 8;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStation9() {

        cond.setCurrentStation(9);

        int expected = 9;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStation20() {

        cond.setCurrentStation(20);

        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }
}