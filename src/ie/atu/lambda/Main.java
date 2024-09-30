package ie.atu.lambda;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        //Using Lamba expression instead of implementing the interface via a class
        MathOperation addition = (a,b) -> a + b;
        System.out.println();
      // MathOperation addition = new Addition();
        System.out.println("Addition: "+ addition.operate(5,3));


        StringOperation apply = (String s) -> s.toUpperCase();
        //StringOperation apply = new ToUpperCase();
        System.out.println("UpperCase Word: " + apply.apply("java"));

        Runnable task =() -> System.out.println("Hello from the thread");
        
        Thread thread = new Thread(task);
        thread.start();

        Calculator square = (int x) -> x* x;
        int result = square.calculate(5);
        System.out.println("Square of 5 is: "+ result);
           // Define a lambda to reverse a string. Function<String, String> defines a function that takes a String as input and returns a String as output
        Function<String, String> reverse = s -> new StringBuilder(s).reverse().toString();

        // Define a lambda to convert a string to uppercase
        Function<String, String> toUpperCase = s -> s.toUpperCase();

        // Combine lambdas
        Function<String, String> combinedOperation = reverse.andThen(toUpperCase);

        // Apply the combined operation
        System.out.println("Result: " + combinedOperation.apply("Lambda"));

        Function<String, String> trim = s -> s.trim();
        Function<String, String> replaceSpaces = s -> s.replace(" ", "-");
        Function<String, String> toLowerCase = s -> s.toLowerCase();

        // Combine the lambdas
        Function<String, String> combinedOperations = trim.andThen(replaceSpaces).andThen(toLowerCase);

        // Test the combined operation
        String resultOne = combinedOperations.apply("   Hello World From Lambda   ");
        System.out.println("Result: " + resultOne);


    }
}
