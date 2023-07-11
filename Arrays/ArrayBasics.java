import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        Scanner in = new Scanner((System.in));
        int[] arra = new int[5];
        for (int i =0 ; i<arra.length;i++)
        {
            arra[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arra));



    }
}
