package car.lada;

import factory.Interior;

public class PrestigeInterior extends Interior {

    @Override
    public String getName() {
        return "Prestige Interior";
    }

    @Override
    public String getColor() {
        return "Green";
    }

    @Override
    public String getMaterial() {
        return "Carbon";
    }
}
