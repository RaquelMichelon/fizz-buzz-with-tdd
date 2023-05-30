package org.michelon;

import org.junit.jupiter.api.Test;

/**
 * @autor raqueldarellimichelon
 * created on 30/05/23 inside the package - org.michelon
 **/
public class FizzBuzzConversor {


    public String convert(int number) {
        if(number % 3 == 0) {
            return "Fizz";
        }
        if(number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}


