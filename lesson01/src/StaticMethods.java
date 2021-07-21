public class StaticMethods {
    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static void hello(String name) {
        System.out.println("hello " + name);
    }

    static void hello(String name, int age) {
        System.out.println("hello " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        System.out.println(add(5,3));
        System.out.println(subtract(5,3));
        hello("Lukasz");
        hello("Paula", 17);
    }
}
