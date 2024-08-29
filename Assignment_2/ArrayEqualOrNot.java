package Assignment_2;

import java.util.Arrays;

public class ArrayEqualOrNot {
    public static void main(String[] args) {
        int[] a = {2,3,4};
        int[] b = {3,5,6};
        boolean res = Arrays.equals(a,b);
        if(res == true){
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }
    }
}
