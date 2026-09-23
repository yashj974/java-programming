class StringDemo{


    String text = "Hello, World!";

    void display() {
        System.out.println(text.length());
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.charAt(0));
        System.out.println(text.substring(0, 5));

    }

    public static void main(String[] args) {
        StringDemo stringDemo = new StringDemo();
        stringDemo.display();
    }

}