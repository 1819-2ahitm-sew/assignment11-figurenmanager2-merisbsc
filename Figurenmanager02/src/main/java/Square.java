class Square extends DrawFigure{

    private int length;
    private int xOfTopLeft;
    private int yOfTopLeft;

    public Square(int xOfTopLeft, int yOfTopLeft, int length) {
        this.length = length;
        this.xOfTopLeft = xOfTopLeft;
        this.yOfTopLeft = yOfTopLeft;
    }

    @Override
    public double area() {
        return length * length;
    }

    @Override
    public double circumfence() {
        return 4 * length;
    }

    @Override
    public String output() {
        return "Quadrat mit Seitenlänge " + this.length + ":\nFläche > " + area() + "\nUmfang > " + circumfence();
    }

}
