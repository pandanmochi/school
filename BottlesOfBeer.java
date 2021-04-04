package school;

import java.io.IOException;

public class BottlesOfBeer {

    // https://www.99-bottles-of-beer.net/

    static void bob()
    {
        int b = 99;
        while(b>0)
        {
            int b2 = b-1;
            System.out.println(b + " bottles of beer on the wall, " + b + " bottles of beer.");
            if(b==1)
            {
                System.out.println("Take one down and pass it around, no more bottles of beer on the wall.");
                System.out.println();
                System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
                System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
            }
            else
            {
                System.out.println("Take one down and pass it around, " + b2 +" bottles of beer on the wall.");
            }
            System.out.println();
            b--;
        }
    }

    public static void main(String[] args) throws IOException {
        bob();
    }
}
