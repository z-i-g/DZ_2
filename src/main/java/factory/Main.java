package factory;

import car.chevrolet.ChevroletFactory;
import car.lada.LadaFactory;

public class Main {

    public static void main(String[] args) {

        CarFactory chevroletFactory = new ChevroletFactory();
        Body chevpoletBody = chevroletFactory.createBody();
        Interior chevroletInterior = chevroletFactory.createInterior();
        Engine chevroletEngine = chevroletFactory.createEngine();
        System.out.println("<<<Chevrolet>>> " + chevpoletBody + chevroletInterior + chevroletEngine);

        CarFactory ladaFactory = new LadaFactory();
        Body ladaBody = ladaFactory.createBody();
        Interior ladaInterior = ladaFactory.createInterior();
        Engine ladaEngine = ladaFactory.createEngine();
        System.out.println("<<<Lada>>>" + ladaBody + ladaInterior + ladaEngine);

    }

}
