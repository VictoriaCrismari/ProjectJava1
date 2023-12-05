package Project1;

public class T8 {
    public static void main(String[] args) {
        //Maximum and minimum number in the array?
        int[] numbers={49,12,15,71,9,124,36,68};
        int max=numbers[0];
        int min=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }else if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println("Maximum number is " +max);
        System.out.println("Minimum is "+min);
    }
}
