import java.util.Objects;

public class Rectangle extends Shape{
    public int width, heigth;
    public Rectangle(int x, int y, int h, int w)
    {
        super(x,y);
        width = w;
        heigth = h;
    }
    public double square()
    {
        return width * heigth;
    }

    public double perimeter()
    {
        return (width + heigth) * 2;
    }

    public String fill(String color)
    {
        return "прямоугольник " + color;
    }

    public boolean equals(Object obj) {
        if(obj instanceof Rectangle anotherRectangle) {
            boolean wEqual = Objects.equals(width, anotherRectangle.width);
            boolean hEqual = Objects.equals(heigth, anotherRectangle.heigth);
            return super.equals(anotherRectangle) && wEqual && hEqual;
        }
        else
            return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("x ").append(x).append("; ");
        sb.append("y ").append(y).append("; ");
        sb.append("w ").append(width).append("; ");
        sb.append("h ").append(heigth).append("; ");


        return sb.toString();
    }

}
