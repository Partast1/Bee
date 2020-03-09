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

    BeeFactory beeFactory = new BeeFactory();

//      available cores.. pool size
   private int cores = Runtime.getRuntime().availableProcessors();

//      Thread pool
    ExecutorService pool = Executors.newFixedThreadPool(cores);
//      Lock
    ReentrantLock lock = new ReentrantLock();


    public BeeThreadHandler() {
        for (int i = 0; i < 666; i++) {
            Runnable gather = beeFactory.CreateGatherBee();
            beeQueue.add(gather);

        }
        for (int i = 0; i < 333; i++) {
            Runnable produce = beeFactory.CreateProductionBee();
            beeQueue.add(produce);
        }
            ThreadStarter();
    }

    public void ThreadStarter(){
        while (true) {
            Runnable bee = beeQueue.poll();
            if (bee instanceof GatherBee){
                GatherHandler(bee);
            }
            else if (bee instanceof ProductionBee)
            {
                ProductionHandler(bee);
            }
        }
    }
    public void GatherHandler(Runnable gather)
    {

        if (!lock.isLocked())
        {
            lock.lock();
//            Runnable gather = beeQueue.poll();
            pool.execute(gather);
            lock.unlock();
        }
        else {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }


    }
    public void ProductionHandler(Runnable produce)
    {

        if (!lock.isLocked())
        {
            lock.lock();
//            Runnable gather = beeQueue.poll();
            pool.execute(produce);
            lock.unlock();
        }
        else {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }


}
