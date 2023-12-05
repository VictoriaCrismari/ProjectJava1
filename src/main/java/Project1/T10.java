package Project1;

public class T10 {
    // Write a program to print out duplicate
    // elements from an Array of Strings?

    public static void main(String[] args) {
        double []  values= {1.2,2.53,7.14,2.53,7.14,18.3,8,3.12};
        System.out.println("Duplicate elements is the array : ");
        for (int i = 0; i < values.length; i++) {
            for (int j = i+1; j < values.length; j++) {
                if(values[i]==values[j])
                    System.out.println(values[j]);
            }
        }
    }
    }
