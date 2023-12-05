package Project1;

public class T5 {
    //Write a program to swap 2 numbers
    //without a temporary variable?
    public static void main(String[] args) {

        int num1 = 6, num2 = 8;
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swapping numbers: num1= "+num1+", num2= "+num2);
    }
}
