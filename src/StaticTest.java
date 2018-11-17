public class StaticTest {
    public static void main(String[] args) {
        B b = new B();
        b.print();

        A a = b;
        a.print();    //nie wskazany zapis, lepiej duże A
        A.print();

    }

}

class A {
        static void print () {
        System.out.println("A");

    }
}
class B extends A {
    static void print () {
        System.out.println("B");

    }
}