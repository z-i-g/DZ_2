package car.lada;

import factory.Body;
import factory.CarFactory;
import factory.Engine;
import factory.Interior;

public class LadaFactory implements CarFactory {
    @Override
    public Body createBody() {
        return new UniversalBody();
    }

    @Override
    public Interior createInterior() {
        return new PrestigeInterior();
    }

    @Override
    public Engine createEngine() {
        return new ElectroEngine();
    }
}
