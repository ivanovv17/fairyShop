package fairyShop.models;

public class Sleepy extends BaseHelper{
    private static final int INITIAL_ENERGY_UNIT = 50;
    public Sleepy(String name) {
        super(name, INITIAL_ENERGY_UNIT);
    }

    @Override
    public void work() {
        super.setEnergy(15);
    }
}
