// demonstrate arrays to string

import java.util.Arrays;
class ArraysDemo {
    int[] numbers = {10,20,30,40};

    void display() {
        System.out.println(Arrays.toString(numbers));
    }

    public static void main(String[] args) {
        ArraysDemo arraysDemo = new ArraysDemo();
        arraysDemo.display();
    }
}
    

