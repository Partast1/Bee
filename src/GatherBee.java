import java.util.Random;

public class GatherBee extends Bee implements Runnable {

    Hive hive = Hive.Singleton();
ProductionBee bb;
    @Override
    public void run() {
        try {
            GatherNectar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void GatherNectar() throws InterruptedException
    {

        int min = 100;
        int max = 500;
        Random rnd = new Random();
        int gatherTime = rnd.nextInt( max);
        Thread.sleep(gatherTime);
        double gatheredNectar = 0.00125;
        bb.beesRequiredHelp.add(Thread.currentThread());

    }

}
