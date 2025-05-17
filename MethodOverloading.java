public class MethodOverloading {
    void display(int a) {
        System.out.println("Integer: " + a);
    }
    void display(String b) {
        System.out.println("String: " + b);
    }
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        mo.display(10);
        mo.display("Hello");
    }
}