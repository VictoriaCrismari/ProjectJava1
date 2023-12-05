package Project1;

public class T1 {
    public static void main(String[] args) {
        //Create a program that uses an array to store
        //a list of temperatures for a week, and then
        //uses a loop to find the highest and lowest
        //temperature for the week.
        int[] temperature={89,85,92,91,88,84,86};
        int high=temperature[0];
        int low=temperature[0];
        for(int i=0;i<temperature.length;i++){
            if(temperature[i]>high){
                high=temperature[i];
            }else if(temperature[i]<low){
                low=temperature[i];
            }
        }
        System.out.println("The highest temperature  of the week is " +high);
        System.out.println("The lowest temperature of the week is "+low);
    }
}
