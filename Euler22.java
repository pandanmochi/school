package school;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Euler22 {

    //https://projecteuler.net/problem=22

    int getNameScore(String s) {
        String u = s.toUpperCase();
        int score = 0;
        for (int i = 0; i < u.length(); i++) {
            score = score + ((int) u.charAt(i) - (int) 'A' + 1);
        }
        return score;
    }

    int multiplyScorePos(String s, int position) {
        return getNameScore(s) * position;
    }

    int euler22(String[] s)
    {
        int sum = 0;
        for(int i=0;i<s.length;i++)
        {
            sum = sum + multiplyScorePos(s[i], i+1);
        }
        return sum;
    }

    private String[] getNames() throws IOException {
        // replace it with your own path
        String fileName = "/Users/Uyen/names.txt";

        FileInputStream fis = new FileInputStream(fileName);
        String text = new Scanner(fis).useDelimiter("\\A").next();
        String[] names = text.split(" ");
        for(int i = 0;i<names.length;i++)
        {
            names[i] = names[i].trim();
        }
        return names;
    }

    public static void main(String[] args) throws IOException {
        SelectionSort sort = new SelectionSort();
        Euler22 euler = new Euler22();
        String[] a = euler.getNames();
        sort.selectionSortString(a);
        System.out.println(euler.euler22(a));

        //Solution: 871198282
    }
}
