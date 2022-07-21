package tdd.fizzbuzz;

public class FizzBuzz {
    public static String FIZZ = "Fizz";
    public static String BUZZ = "Buzz";

    public String countOff(int order){
        if(order % 3 == 0){
            return FIZZ;
        }
        else if(order % 5 == 0){
            return BUZZ;
        }
        return String.valueOf(order);
    }


}
