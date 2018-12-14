class Rectangle extends DrawFigure{

    int length;
    int width;
    int xOfTopLeft;
    int yOfTopLeft;

    public Rectangle(int xOfTopLeft, int yOfTopLeft, int length, int width) {
        this.length = length;
        this.width = width;
        this.xOfTopLeft = xOfTopLeft;
        this.yOfTopLeft = yOfTopLeft;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double circumfence() {
        return 2 * (length + width);
    }

    @Override
    public String output() {
        return "Rechteck mit Länge " + this.length + " und Breite " + this.width + ":\nFläche > " + area() + "\nUmfang > " + circumfence();
    }

}
