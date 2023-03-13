import org.example.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumTest {

    SumCalculator calculator;

    @BeforeEach
    public void generateCalculator() {

        calculator = new SumCalculator();

    }

    @Test
    public void test() {
        Assertions.assertEquals(calculator.sum(1), 1, "Incorrect calculation");
        Assertions.assertEquals(calculator.sum(2), 3, "Incorrect calculation");
        Assertions.assertEquals(calculator.sum(3), 6, "Incorrect calculation");

        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.sum(0), "Illegal exception on zero do not work");
    }

}
