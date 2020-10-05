package car.chevrolet;

import factory.Engine;

public class BenzinEngine extends Engine {

    @Override
    public String getPower() {
        return "116";
    }

    @Override
    public String getType() {
        return "Benzin";
    }
}
