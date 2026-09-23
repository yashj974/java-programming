import java.util.Arrays;

class Matrix {
    int[][] a = {
        {1, 2},
        {3, 4}
    };

    void display() {
        System.out.println(Arrays.deepToString(a));
    }

    public static void main(String[] args) {
        Matrix m = new Matrix();
        m.display();
    }
}