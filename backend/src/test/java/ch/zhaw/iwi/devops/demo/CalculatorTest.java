package ch.zhaw.iwi.devops.demo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        // Originaler Test
        // assertEquals(5, calc.add(2, 3));

        // Geänderter Test für die geänderte Implementierung
        assertEquals(6, calc.add(2, 3));
    }
}