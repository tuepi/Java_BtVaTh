package xu_ly_ngoai_le_debug.illegal_triangle_exception;

public class MyConnection {
    int a;
    int b;
    int c;

    public MyConnection() {
    }

    public MyConnection(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void isTriangle() throws TriangleException {
        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && b + c > a && a + c > b) {
                System.out.println("Thỏa mãn 3 cạnh của một tam giác.");
                System.out.println("Tam giác {" + a + ", " + b + ", " + c + "}");
            } else
                throw new TriangleException();
        } else
            throw new TriangleException();
    }
}
