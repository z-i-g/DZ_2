package factory;

public interface CarFactory {

    Body createBody();

    Interior createInterior();

    Engine createEngine();

}
