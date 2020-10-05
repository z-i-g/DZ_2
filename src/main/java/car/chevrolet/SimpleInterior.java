package car.chevrolet;

import factory.Interior;

public class SimpleInterior extends Interior {

    @Override
    public String getName() {
        return "Normal";
    }

    @Override
    public String getColor() {
        return "White";
    }

    @Override
    public String getMaterial() {
        return "Plastic";
    }
}
