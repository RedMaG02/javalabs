import java.util.Objects;

public class Line extends Shape{
    public int angle, length;
    public Line(int x, int y, int a, int l)
    {
        super(x,y);
        angle = a;
        length = l;
    }
    public double square()
    {
        return 0;
    }

    public double perimeter()
    {
        return length;
    }

    public String fill(String color)
    {
        return "линия " + color;
    }

    public boolean equals(Object obj) {
        if(obj instanceof Line anotherLine) {
            boolean aEqual = Objects.equals(angle, anotherLine.angle);
            boolean lEqual = Objects.equals(length, anotherLine.length);
            return super.equals(anotherLine) && aEqual && lEqual;
        }
        else
            return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("x ").append(x).append("; ");
        sb.append("y ").append(y).append("; ");
        sb.append("a ").append(angle).append("; ");
        sb.append("l ").append(length).append("; ");


        return sb.toString();
    }
}
