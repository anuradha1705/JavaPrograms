public class nested_if {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 15;
        if (a > b) {
            if (a > c) {
                System.out.println("a is the largest");
            } else {
                System.out.println("c is the largest");
            }
        } else {
            if (b > c) {
                System.out.println("b is the largest");
            } else {
                System.out.println("c is the largest");
            }
        }
    }
}
