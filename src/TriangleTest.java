public class TriangleTest {
    public static void main(String[] args) {
        Triangle tri1 = new Triangle();
        System.out.println(tri1);
        Triangle tri2 = new Triangle();
        System.out.println(tri2);
        tri1 = new Triangle(1.0,2.0,3.0);
        System.out.println(tri1);
        tri2 = new Triangle("blue",false,3.0,4.0,5.0);
        System.out.println(tri2);
    }
}
