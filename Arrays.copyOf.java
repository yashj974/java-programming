import java.util.Arrays;

class CopyArray{

    int[] a = {10,20,30,40};


    void copy() {
        int[] b = Arrays.copyOf (a,2);
        System.out.println(Arrays.toString(b));

    }

    public static void main(String[] args) {
        CopyArray copyArray = new CopyArray();
        copyArray.copy();
    }
}