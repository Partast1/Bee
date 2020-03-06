import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {

        BeeFactory beeFactory = new BeeFactory();
//      Fixed pool size
         final int MAX_T = 3;

//      Thread pool
        ExecutorService pool = Executors.newFixedThreadPool(MAX_T);
//      Lock
        ReentrantLock lock;

        for (int i = 0; i < 666; i++)
        {
            Runnable gather = beeFactory.CreateGatherBee();
            pool.execute(gather);

        }
        for (int i = 0; i < 333; i++)
        {
            Runnable produce = beeFactory.CreateProductionBee();
            pool.execute(produce);
        }

    }
}
