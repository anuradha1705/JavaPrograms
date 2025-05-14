public class FinalVariable {
    public static void main(String[] args) {
        final int myNum = 12;
       // myNum = 20;  //Will generate an error can't assign a value to a final variable.

        System.out.println(myNum);
    }
}
