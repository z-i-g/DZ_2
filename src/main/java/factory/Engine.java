package factory;

public abstract class Engine {

    public abstract String getPower();

    public abstract String getType();

    @Override
    public String toString() {
        return "Engine: type - " + getType() + ", power - " + getPower() + ".  ";
    }

}
