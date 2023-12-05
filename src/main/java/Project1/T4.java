package Project1;

public class T4 {
    //Create a 2D array of integers. Develop a program which
    // will calculate the sum of even and odd numbers for that array.

    public static void main(String[] args) {
        int[][] numbers={
                {2,12,14,15,18,7,9},
                {3,2,15,8,51,47,6},
                {5,20,32,8,9,45,17}
        };
        int sumEven=0,sumOdd=0;
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length ; j++) {
                if (numbers[i][j]%2==0){
                    sumEven=sumEven+numbers[i][j];
                } else if (numbers[i][j]%2!=0) {
                    sumOdd=sumOdd+numbers[i][j];
                }
            }
        }
        System.out.println("The sum of even numbers is "+sumEven);
        System.out.println("The sum of odd numbers is "+sumOdd);

    }
}
