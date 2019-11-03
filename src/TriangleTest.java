public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        System.out.println("Area = " + triangle.getArea() + " Perimeter "+ triangle.getPerimeter());

        triangle = new Triangle(6,4,5,"red",true);
        System.out.println(triangle);
        System.out.println("Area = " + triangle.getArea() + " Perimeter "+ triangle.getPerimeter());
    }
}
