package car.chevrolet;

import factory.Body;
import factory.CarFactory;
import factory.Engine;
import factory.Interior;

public class ChevroletFactory implements CarFactory {

    @Override
    public Body createBody() {
        return new HatchbackBody();
    }

    @Override
    public Interior createInterior() {
        return new SimpleInterior();
    }

    @Override
    public Engine createEngine() {
        return new BenzinEngine();
    }
}
