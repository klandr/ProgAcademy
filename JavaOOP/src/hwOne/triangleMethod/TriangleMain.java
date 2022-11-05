package hwOne.triangleMethod;

public class TriangleMain {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(0.3,0.4,0.5);
        Triangle triangle2 = new Triangle();

        triangle2.setSideA(0.5);
        triangle2.setSideB(0.3);
        triangle2.setSideC(0.4);

        System.out.print("We have");
        System.out.println(triangle1);
        System.out.print("Area of triangle = ");
        System.out.println(triangle1.AreaOfTriangle());

        System.out.print("We have");
        System.out.println(triangle2);
        System.out.print("Area of triangle = ");
        System.out.println(triangle2.AreaOfTriangle());

    }
}
