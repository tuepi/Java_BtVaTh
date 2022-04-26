package xu_ly_ngoai_le_debug.illegal_triangle_exception;

public class TriangleException extends Exception{
    public TriangleException() {
    }

    @Override
    public String getMessage() {
        return "Không thỏa mãn điều kiện là 3 cạnh của một tam giác.";
    }
}

