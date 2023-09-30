package seminars.third.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainHW {
    // HW 3.1. Нужно покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).
    @Test
    public void testEvenNumber() {
        EvenOddNumber evenOddNumber = new EvenOddNumber();
        assertTrue(evenOddNumber.isEven(6));
        assertTrue(evenOddNumber.isEven(0));
        assertTrue(evenOddNumber.isEven(-4));
    }
    @Test
    public void testOddNumber() {
        EvenOddNumber evenOddNumber = new EvenOddNumber();
        assertFalse(evenOddNumber.isEven(7));
        assertFalse(evenOddNumber.isEven(11));
        assertFalse(evenOddNumber.isEven(-3));
    }


    // HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%
    @Test
    public void testNumberInInterval() {
        NumberInInterval numberInInterval = new NumberInInterval();
        assertTrue(numberInInterval.isNumberInInterval(30));
        assertTrue(numberInInterval.isNumberInInterval(50));
        assertFalse(numberInInterval.isNumberInInterval(10));
        assertFalse(numberInInterval.isNumberInInterval(500));
        assertFalse(numberInInterval.isNumberInInterval(25));
        assertFalse(numberInInterval.isNumberInInterval(100));
    }
}

