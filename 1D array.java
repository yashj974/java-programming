//Create a class containing a 1D array and use a for loop to display all elements.
class ArrayDemo {

    int[] numbers = {1,2,3,4,5}; // 1D array initialization

    void display() {
        for(int i =0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


        
    }

    public static void main(String[] args) {
        ArrayDemo arrayDemo = new ArrayDemo();
        arrayDemo.display();
    }


}