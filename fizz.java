import java.util.Optional;

public class fizz {

    public static void main(String args[]) {
        
        System.out.println("FizzBuzz : " + fizzBuzz(103));
    }
    public static String fizzBuzz(int number) {
        String result = Optional.of(number)
                .map(n -> (n % 3 == 0 ? "Fizz" : "") + (n % 5 == 0 ? "Buzz" : ""))
                .get();
        return result.isEmpty() ? Integer.toString(number) : result;
    }
}







