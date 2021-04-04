package school;

import java.io.IOException;

public class PrintTriangle {

//    print the following triangles using nested for-loops.
//    example output:
//
//        *
//        **
//        ***
//        ****
//        *****

    static void triangle1(int n)
    {
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//        *****
//        ****
//        ***
//        **
//        *


    static void triangle2(int n)
    {
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n-i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        triangle1(5);
        System.out.println();
        triangle2(5);
    }
}
