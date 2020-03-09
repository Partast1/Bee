import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class Main {


    public static void main(String[] args) {

        ReentrantLock lock = new ReentrantLock();
        Hive hive = Hive.Singleton();
        BeeThreadHandler beeThreadHandler = new BeeThreadHandler();
//        beeThreadHandler.GatherHandler();



//        System.out.println(hive.getHoneyStorage());
//        for (int i = 0; i < 3; i++) {
//            if (!lock.isLocked())
//            {
//                lock.lock();
//                gatherBee.start();
//                lock.unlock();
//            }
//        }


    }
}
