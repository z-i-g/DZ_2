package car.kia;

import factory.Body;

public class SedanBody extends Body {

    @Override
    public String getName() {
        return "White Sedan";
    }

    @Override
    public String getColor() {
        return "White";
    }

    @Override
    public String getType() {
        return "Sedan";
    }
}
