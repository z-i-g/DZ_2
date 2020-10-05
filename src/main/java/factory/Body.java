package factory;

public abstract class Body {

    public abstract String getName();

    public abstract String getColor();

    public abstract String getType();

    @Override
    public String toString() {
        return "Body: type - " + getType() + ", color - " + getColor() + ", name - " + getName() + ".  ";
    }

}
