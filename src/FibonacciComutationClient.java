import java.util.concurrent.ForkJoinPool;

public class FibonacciComutationClient {
    public static void main(String[] args) {
        int number = 30;
        int poolSize = Runtime.getRuntime().availableProcessors();
        ForkJoinPool pool = new ForkJoinPool(poolSize);

        long beforeTime = System.currentTimeMillis();
        System.out.println("BeforeTIme"+ beforeTime);

        int result = new FibonacciComputation(number).compute();

        long afterTime = System.currentTimeMillis();
        System.out.println("Result " +  result);


        System.out.println("Total Time in Milliseconds Taken "+ (afterTime - beforeTime));

    }
}
