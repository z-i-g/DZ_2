package car.kia;

import factory.Engine;

public class DieselEngine extends Engine {

    @Override
    public String getPower() {
        return "240";
    }

    @Override
    public String getType() {
        return "Diesel";
    }
}
