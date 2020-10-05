package car.chevrolet;

import factory.Body;

public class HatchbackBody extends Body {

    @Override
    public String getName() {
        return "Black Hatchback";
    }

    @Override
    public String getColor() {
        return "Black";
    }

    @Override
    public String getType() {
        return "Hatchback";
    }
}
