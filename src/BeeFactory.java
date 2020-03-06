public class BeeFactory {
    public GatherBee CreateGatherBee()
    {
        GatherBee gatherBee = new GatherBee();
        return gatherBee;
    }
    public ProductionBee CreateProductionBee()
    {
        ProductionBee produceBee = new ProductionBee();
        return produceBee;
    }
}
