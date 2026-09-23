//Create two 1D arrays and demonstrate Arrays.equals().

import java.util.Arrays;

class compareArrays {

    public static void main(String[] args) {

        int[] a = {10, 20, 30};
        int[] b = {10, 20, 30};

        if (Arrays.equals(a, b)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}
