import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTestSetCurrentStation {
    Radio cond = new Radio(9);

    @Test
    void setCurrentStation() {

        cond.setCurrentStation(-1);

        int expected = 0;
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
    void setCurrentStation10() {

        cond.setCurrentStation(10);

        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }
}