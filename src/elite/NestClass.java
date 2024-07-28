package elite;

class A {
    class B {
        void display() {
            System.out.println("Hi");
        }
    }
    B obj = new B();

}

public class NestClass {
    public static void main(String[] args) {
        A object = new A();
        A.B obj1 = object.new B();
        obj1.display();
        object.obj.display();
    }
}
