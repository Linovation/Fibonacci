import java.util.concurrent.RecursiveTask;

public class FibonacciComputation extends RecursiveTask<Integer> {

    private final int number;

    FibonacciComputation(int number) {
        this.number = number;
    }

    @Override
    protected Integer compute() {
        if(number <= 1) {
            return number;
        }
        FibonacciComputation f1 = new FibonacciComputation(number - 1);
        FibonacciComputation f2 = new FibonacciComputation(number - 2);
        f1.fork();
        return f2.compute() + f1.join();
    }
}
