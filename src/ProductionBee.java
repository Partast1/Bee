import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProductionBee extends Bee implements Runnable{

 GatherBee bb;
    public BlockingQueue<Runnable> beesRequiredHelp = new ArrayBlockingQueue<>(500);
    @Override
    public void run() {
        try {
            HelpGatherBeeWithNectar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void HelpGatherBeeWithNectar()
    {
        Runnable bee = beesRequiredHelp.poll();
        hive.setHoneyStorage(hive.getHoneyStorage() + nectar);
        System.out.println(hive.getHoneyStorage() + "Threadname" + Thread.currentThread().getName());
    }
    private void ProduceNectar()
    {

    }
}
