package generic;

public class Main {
    public static void main(String[] args) {
       MaxString maxString = new MaxString();
        System.out.println("Test case1");
        maxString.maxValue("Peach", "Apple", "Banana");
        System.out.println("Test case2");
        maxString.maxValue("Apple", "Zach", "Banana");
        System.out.println("Test case3");
        maxString.maxValue("Apple", "Banana", "Class");
    }
}
