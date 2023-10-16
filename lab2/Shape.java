public abstract class Shape {
    protected int x, y;

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
    public abstract void fill(Color color);
}