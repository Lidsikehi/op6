package models.animals.birds;

public class Hen extends NonFlyingBird{

    public Hen(double height, double weight, String eyeColor, String feathersColor) {
        super(height, weight, eyeColor, feathersColor);
    }

    @Override
    public String sound() {
        return String.format("Кудах-кудах!");
    }

    @Override
    public String toString() {
        return String.format("Курица (%s)", super.toString());
    }
}
