public class Main {
    public static void main(String[] args)
    {
        Shape[] shapes = new Shape[15];
        shapes[0] = new Circle(1, 1,5);
        shapes[1] = new Line(1, 1,2,2);
        shapes[2] = new Rectangle(1, 1,4,5);
        shapes[3] = new Circle(2, 2,5);
        shapes[4] = new Line(2, 2,2,3);
        shapes[5] = new Rectangle(2, 2,3,5);
        shapes[6] = new Circle(1, 1,5);
        shapes[7] = new Line(1, 1,2, 5);
        shapes[8] = new Rectangle(1, 1,4, 5);
        shapes[9] = new Circle(2, 3,5);
        shapes[10] = new Line(2, 2,6,3);
        shapes[11] = new Rectangle(2, 9,3,5);
        shapes[12] = new Circle(1, 87,5);
        shapes[13] = new Line(1, 1,23, 5);
        shapes[14] = new Rectangle(1, 33,4, 5);
        for (int i = 0; i<15; i++)
        {
            System.out.println(shapes[0].equals(shapes[i]));
            System.out.println(shapes[i].toString());
            System.out.println(shapes[i].perimeter());
            System.out.println(shapes[i].square());
            System.out.println(shapes[i].fill("krasniy"));
            shapes[i].move(i, i);
            System.out.println(shapes[0].equals(shapes[i]));
        }
    }
}