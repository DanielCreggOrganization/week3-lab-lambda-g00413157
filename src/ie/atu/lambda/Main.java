package ie.atu.lambda;

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


    }
}
