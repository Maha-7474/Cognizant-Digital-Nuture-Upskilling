import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceAndCallable {

    public static void main(String[] args) {

        // Create a thread pool with 3 threads
        ExecutorService executor =
                Executors.newFixedThreadPool(3);

        try {

            // Create Callable tasks
            Callable<Integer> task1 = () -> 10 + 20;

            Callable<Integer> task2 = () -> 30 + 40;

            Callable<Integer> task3 = () -> 50 + 60;

            // Submit tasks
            Future<Integer> future1 =
                    executor.submit(task1);

            Future<Integer> future2 =
                    executor.submit(task2);

            Future<Integer> future3 =
                    executor.submit(task3);

            // Retrieve results
            System.out.println(
                    "Result 1: "
                            + future1.get());

            System.out.println(
                    "Result 2: "
                            + future2.get());

            System.out.println(
                    "Result 3: "
                            + future3.get());

        } catch (Exception e) {
            System.out.println(e);
        }

        // Shutdown executor
        executor.shutdown();
    }
}