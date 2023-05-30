package org.michelon;

import org.junit.jupiter.api.Test;

/**
 * @autor raqueldarellimichelon
 * created on 30/05/23 inside the package - org.michelon
 **/
public class FizzBuzzConversor {


    public String convert(int number) {

        String result = "";

        if(number % 3 == 0) {
            result = result + "Fizz";
        }
        if(number % 5 == 0) {
            result = result + "Buzz";
        }
        if(result.isEmpty()) {
            result = result + String.valueOf(number);
        }
        return result;
    }
}


