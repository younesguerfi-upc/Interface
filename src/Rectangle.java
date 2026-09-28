public class Rectangle implements Sortable {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    @Override
    public int compareTo(Sortable other) {

        Rectangle otherRectangle = (Rectangle) other;

        return Double.compare(
                this.calculateArea(),
                otherRectangle.calculateArea()
        );
    }
}