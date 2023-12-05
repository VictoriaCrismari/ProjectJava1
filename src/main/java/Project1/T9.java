package Project1;

public class T9 {
    //Write a java program to find the second
    // largest number in the array?
    public static void main(String[] args) {
        int[] num={9,15,35,12,28,814,26,36,87,547};
        int largest=0;
        int sLargest=0;
        for(int i=0;i<num.length;i++){
            if(num[i]>largest){
                sLargest=largest;
                largest=num[i];
            }
            else if(num[i]>sLargest){
                sLargest=num[i];
            }
        }
        System.out.println("Second largest number is "+sLargest);
        System.out.println("Largest number is "+largest);
    }
    }
