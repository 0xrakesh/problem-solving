package elite;

class OverrideClass {
    void show() {
        System.out.println("Hello");
    }
}
public class Main {
    public static void show() {
        System.out.print("Hi");
    }
    public static void main(String[] args) {
        OverrideClass obj = new OverrideClass();
        obj.show();
    }
}
