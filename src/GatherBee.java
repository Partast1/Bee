import java.util.Random;

public class GatherBee extends Bee implements Runnable{

    Hive hive = new Hive();

    @Override
    public void run() {
        try {
            GatherNectar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void GatherNectar() throws Exception
    {
        int min = 100;
        int max = 500;
        Random rnd = new Random();
        int gatherTime = rnd.nextInt(min - max);
        Thread.sleep(gatherTime);

        double gatheredNectar = hive.getHoneyStorage() + 0.00125;
        hive.setHoneyStorage(gatheredNectar);


    }
    private void DelieverNectar()
    {

    }
}
