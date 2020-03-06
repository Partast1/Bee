import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.jar.Attributes;

public class Hive {
//    Attributes
    private double honeyStorage;
    private int flowerCount;
    
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
    public Hive()
    {
        honeyStorage = 0;
        flowerCount = 0;


    }
}
