package car.lada;

import factory.Engine;

public class ElectroEngine extends Engine {

    @Override
    public String getPower() {
        return "350";
    }

    @Override
    public String getType() {
        return "Electrical";
    }
}
