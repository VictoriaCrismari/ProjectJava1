package Project1;

public class T6 {
    //Write a java program to check whether
    // a given number is prime or not?
    public static void main(String[] args) {
        int num = 11;
        boolean IsPrime=true;
        for(int i=2 ; i<=num/2; i++){
            if(num%i==0){
                IsPrime=false;
            }
        }
        if(IsPrime){
            System.out.println(num +" is Prime");
        } else {
            System.out.println(num +"  is not prime");
        }
    }
    }
