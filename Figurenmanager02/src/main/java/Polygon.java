public class Polygon extends DrawFigure{

    public Polygon() {

    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double circumfence() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String output() {
        return "Kreis mit Radius " + this.radius + ":\nFläche > " + area() + "\nUmfang > " + circumfence();
    }
}
