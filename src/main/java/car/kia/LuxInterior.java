package car.kia;

import factory.Interior;

public class LuxInterior extends Interior {

    @Override
    public String getName() {
        return "Lux";
    }

    @Override
    public String getColor() {
        return "Blue";
    }

    @Override
    public String getMaterial() {
        return "NanoMaterial";
    }
}
