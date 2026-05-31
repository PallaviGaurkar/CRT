import java.io.*;
import java.util.*;
public class SumOfDigits {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n%9 == 0) System.out.println(9);
        
        else System.out.println(n%9);
    }

}
