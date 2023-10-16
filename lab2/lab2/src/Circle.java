import java.util.Objects;

public class Circle extends Shape {
    public int radius;
    public Circle(int x, int y, int r)
    {
        super(x,y);
        radius = r;
    }
    public double square()
    {
        return Math.PI * radius * radius;
    }

    public double perimeter()
    {
        return 2 * Math.PI * radius;
    }

    public String fill(String color)
    {
        return "круг " + color;
    }

    public boolean equals(Object obj) {
        if(obj instanceof Circle anotherCircle) {
            boolean rEqual = Objects.equals(radius, anotherCircle.radius);
            return super.equals(anotherCircle) && rEqual;
        }
        else
            return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("x ").append(x).append("; ");
        sb.append("y ").append(y).append("; ");
        sb.append("r ").append(radius).append("; ");

        return sb.toString();
    }
}
