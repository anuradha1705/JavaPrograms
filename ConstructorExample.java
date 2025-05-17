public class ConstructorExample {
    int x;
    ConstructorExample(int val) {
        x = val;
    }
    void show() {
        System.out.println("Value: " + x);
    }
    public static void main(String[] args) {
        ConstructorExample obj = new ConstructorExample(5);
        obj.show();
    }
}