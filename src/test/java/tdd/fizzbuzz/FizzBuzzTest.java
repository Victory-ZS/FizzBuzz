package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_say_order_number_when_countOff_given_order_is_1(){
        //given

        FizzBuzz fizzBizz = new FizzBuzz();

        //when

        String actual = fizzBizz.countOff(1);

        //then
        assertEquals("1", actual);
    }

    @Test
    void should_say_order_number_when_countOff_given_order_is_3(){
        //given

        FizzBuzz fizzBizz = new FizzBuzz();

        //when

        String actual = fizzBizz.countOff(3);

        //then
        assertEquals("Fizz", actual);
    }

    @Test
    void should_say_order_number_when_countOff_given_order_is_5(){
        //given

        FizzBuzz fizzBizz = new FizzBuzz();

        //when

        String actual = fizzBizz.countOff(5);

        //then
        assertEquals("Buzz", actual);
    }

    @Test
    void should_say_order_number_when_countOff_given_order_is_15() {
        //given

        FizzBuzz fizzBizz = new FizzBuzz();

        //when

        String actual = fizzBizz.countOff(15);

        //then
        assertEquals("FizzBuzz", actual);
    }


}
