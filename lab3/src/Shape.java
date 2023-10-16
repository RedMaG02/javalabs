import java.util.Objects;
public abstract class Shape implements IDrawable, IMovable, IObjectsMath{
    public int x, y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double square();
    public abstract double perimeter();
    public void move (int newX, int newY)
    {
        x = newX;
        y = newY;
    };
    public abstract String fill(String color);

    public boolean equals(Object obj) {
        if(obj instanceof Shape anotherShape) {
            boolean xEqual = Objects.equals(x, anotherShape.x);
            boolean yEqual = Objects.equals(y, anotherShape.y);
            return xEqual && yEqual;
        }
        else
            return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("x ").append(x).append("; ");
        sb.append("y ").append(y).append("; ");


        return sb.toString();
    }
}