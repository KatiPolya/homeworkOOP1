import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioDecreaseStationPrevTest {
    Radio cond = new Radio(9);

    @Test
    void decreaseStationM1() {

        cond.setCurrentStation(-1);
        int expected = 9;
        int actual = cond.decreaseStation();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseStation0() {

        cond.setCurrentStation(0);
        int expected = 9;
        int actual = cond.decreaseStation();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseStation1() {

        cond.setCurrentStation(1);
        int expected = 0;
        int actual = cond.decreaseStation();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseStation8() {

        cond.setCurrentStation(8);
        int expected = 7;
        int actual = cond.decreaseStation();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseStation9() {

        cond.setCurrentStation(9);
        int expected = 8;
        int actual = cond.decreaseStation();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseStation10() {

        cond.setCurrentStation(10);
        int expected = 9;
        int actual = cond.decreaseStation();

        assertEquals(expected, actual);
    }
}