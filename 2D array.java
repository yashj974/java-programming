//The question bank specifically asks for displaying a 2D integer array using nested loops.

class Matrix {
    int[][] a = {
        {1, 2, 3},
        {4, 5, 6}
    };

    void display() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix m = new Matrix();
        m.display();
    }
}
