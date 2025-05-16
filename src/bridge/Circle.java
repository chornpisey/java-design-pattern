package bridge;

public class Circle extends Shape{
    protected Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle in color : " + this.color.fill());
    }
}
