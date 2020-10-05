package car.kia;

import factory.Body;
import factory.CarFactory;
import factory.Engine;
import factory.Interior;

public class KiaFactory implements CarFactory {

    @Override
    public Body createBody() {
        return new SedanBody();
    }

    @Override
    public Interior createInterior() {
        return new LuxInterior();
    }

    @Override
    public Engine createEngine() {
        return new DieselEngine();
    }
}
