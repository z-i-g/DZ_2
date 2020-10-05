package factory;

public abstract class Interior {

    public abstract String getName();

    public abstract String getColor();

    public abstract String getMaterial();

    @Override
    public String toString() {
        return "Interior: Material - " + getMaterial() + ", color - " + getColor() + ", name - " + getName() + ". ";
    }

}
