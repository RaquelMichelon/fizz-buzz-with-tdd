package org.michelon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @autor raqueldarellimichelon
 * created on 30/05/23 inside the package - org.michelon
 **/
class FizzBuzzConversorTest {
    @Test
    public void convertShouldReturnsItselfWhenNotMultipleOf3and5() {
        FizzBuzzConversor fizzBuzzConversor = new FizzBuzzConversor();

        String result = fizzBuzzConversor.convert(1);

        assertEquals("1", result);

        result = fizzBuzzConversor.convert(2);

        assertEquals("2", result);

    }

    @Test
    public void convertShouldReturnsFizzWhenMultipleOf3() {
        FizzBuzzConversor fizzBuzzConversor = new FizzBuzzConversor();

        String result = fizzBuzzConversor.convert(3);

        assertEquals("Fizz", result);


    }

}