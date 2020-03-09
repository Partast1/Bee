//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.locks.ReentrantLock;
//import java.util.jar.Attributes;
//
//public class Hive {
//    //    Attributes
//    private double honeyStorage;
//    private int flowerCount;
//
//    BeeFactory beeFactory = new BeeFactory();
//    BeeThreadHandler beeThreadHandler = new BeeThreadHandler();
//
//    //    Getters
//    public double getHoneyStorage() {
//        return honeyStorage;
//    }
//    public int getFlowerCount() {
//        return flowerCount;
//    }
//
//    //    Setters
//    public void setHoneyStorage(double honeyStorage) {
//        this.honeyStorage = honeyStorage;
//    }
//    public void setFlowerCount(int flowerCount) {
//        this.flowerCount = flowerCount;
//    }
//
//    public Hive()
//    {
//        honeyStorage = 0;
//        flowerCount = 0;
//
//
//
////            beeThreadHandler.GatherHandler(gather);
//
////            Runnable produce = beeFactory.CreateProductionBee();
////            beeThreadHandler.beeQueue.add(produce);
//
//    }
//}

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.jar.Attributes;

public class Hive {
//    Attributes
    private double honeyStorage;
    private int flowerCount;
    private static Hive single_instance=null;


    //    Getters
    public double getHoneyStorage() {
        return honeyStorage;
    }
    public int getFlowerCount() {
        return flowerCount;
    }

//    Setters
    public void setHoneyStorage(double honeyStorage) {
        this.honeyStorage = honeyStorage;
    }
    public void setFlowerCount(int flowerCount) {
        this.flowerCount = flowerCount;
    }
    private Hive()
    {
      
    }
    public static Hive Singleton()
    {
        // To ensure only one instance is created
        if (single_instance == null)
        {
            single_instance = new Hive();
        }
        return single_instance;
    }
}
