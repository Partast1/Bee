import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BeeThreadHandler
{
//SPLIIT BEES FROM QUEUE AND MAKE THREADS RUN
    public BlockingQueue<Runnable> beeQueue = new ArrayBlockingQueue<>(1000);

    //      Fixed pool size
    final int MAX_T = 3;

    //      Thread pool
    ExecutorService pool = Executors.newFixedThreadPool(MAX_T);
    //      Lock
    ReentrantLock lock;

    public void BeeSpliter()
    {

    }
    public void ThreadStarter(){
        while (true) {

            ProductionHandler();
            GatherHandler();
        }
    }
    public void ProductionHandler()
    {

            lock.tryLock();
            try {

                pool.execute(produce);

                lock.unlock();
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }


    }
    public void GatherHandler()
    {

        lock.tryLock();
        try {
            pool.execute(gather);
            lock.unlock();
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }


    }

}
