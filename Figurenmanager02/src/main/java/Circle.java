class Circle extends Figure{

    double radius;
    int xOfCenter;
    int yOfCenter;

    public Circle(int xOfCenter, int yOfCenter, int radius) {
        this.radius = radius;
        this.xOfCenter = xOfCenter;
        this.yOfCenter = yOfCenter;
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
