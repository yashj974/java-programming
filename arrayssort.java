//Create a class containing a 1D array and demonstrate Arrays.sort().

import java.util.Arrays;

class SortDemo {

    int[] numbers = {50, 40, 30, 20, 10};

    void display() {

        Arrays.sort(numbers);

        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void main(String[] args) {
        SortDemo sortDemo = new SortDemo();
        sortDemo.display();
    }
}