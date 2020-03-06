import java.util.Random;

public class GatherBee extends Bee implements Runnable{
    @Override
    public void run() {

    }

    private double GatherNectar() throws Exception
    {
        int min = 100;
        int max = 500;
        Random rnd = new Random();
        int gatherTime = rnd.nextInt(min - max);
        Thread.sleep(gatherTime);

        double gatheredNectar = 0.00125;
        return gatheredNectar;
    }
    private void DelieverNectar()
    {

    }
}
