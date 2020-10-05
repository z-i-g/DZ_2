package car.lada;

import factory.Body;

public class UniversalBody extends Body {

    @Override
    public String getName() {
        return "Purpure Universal";
    }

    @Override
    public String getColor() {
        return "Purpure";
    }

    @Override
    public String getType() {
        return "Universal";
    }
}
