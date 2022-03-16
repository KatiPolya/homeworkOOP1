import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTestIncreaseStationNext {
    Radio cond = new Radio(9);

    @Test
    void increaseStationM1() {

        cond.setCurrentStation(-1);
        int expected = 1;
        int actual = cond.increaseStation();

        assertEquals(expected, actual);
    }

    @Test
    void increaseStation0() {

        cond.setCurrentStation(0);
        int expected = 1;
        int actual = cond.increaseStation();

        assertEquals(expected, actual);
    }

    @Test
    void increaseStation1() {

        cond.setCurrentStation(1);
        int expected = 2;
        int actual = cond.increaseStation();

        assertEquals(expected, actual);
    }

    @Test
    void increaseStation8() {

        cond.setCurrentStation(8);
        int expected = 9;
        int actual = cond.increaseStation();

        assertEquals(expected, actual);
    }

    @Test
    void increaseStation9() {

        cond.setCurrentStation(9);
        int expected = 0;
        int actual = cond.increaseStation();

        assertEquals(expected, actual);
    }

    @Test
    void increaseStation10() {

        cond.setCurrentStation(10);
        int expected = 1;
        int actual = cond.increaseStation();

        assertEquals(expected, actual);
    }

}