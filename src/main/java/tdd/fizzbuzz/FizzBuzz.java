package tdd.fizzbuzz;

public class FizzBuzz {
    public static String FIZZ = "Fizz";
    public static String BUZZ = "Buzz";
    public static String FIZZBUZZ = "FizzBuzz";

    public String countOff(int order){
        if(order % 3 == 0){
            if(order % 5 == 0){
                return FIZZBUZZ;
            }
            return FIZZ;
        }
        else if(order % 5 == 0){
            return BUZZ;
        }
        return String.valueOf(order);
    }


}
