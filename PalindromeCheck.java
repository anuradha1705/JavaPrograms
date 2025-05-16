import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(), rev = 0, temp = num;
        while(num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        if(temp == rev)
            System.out.println(temp + " is a Palindrome");
        else
            System.out.println(temp + " is not a Palindrome");
    }
}