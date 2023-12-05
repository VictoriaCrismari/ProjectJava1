package Project1;

public class T7 {
    //Write a Java Program to print the first
    // 10 numbers of Fibonacci series.
    public static void main(String[] args) {
        int n=10,firstNumber=0,secondNumber=1;
        int nextNumber;
        for(int i=1;i<=n;i++){
            System.out.print(firstNumber+ " ");
            nextNumber=firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=nextNumber;
        }
    }
}
