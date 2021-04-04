package school;

public class StringMethods {

    /* Write a method which prints out the following ASCII table:

                 0 1 2 3 4 5 6 7 8 9
            ------------------------
            30 | ! " # $ % & ’
            40 | ( ) * + , - . / 0 1
            50 | 2 3 4 5 6 7 8 9 : ;
            60 | < = > ? @ A B C D E
            70 | F G H I J K L M N O
            80 | P Q R S T U V W X Y
            90 | Z [ \ ] ^ _ ‘ a b c
            100| d e f g h i j k l m
            110| n o p q r s t u v w
            120| x y z { | } ~
    */

    static void asciiTable()
    {
        System.out.print("     ");
        for(int i = 0; i<=9;i++)
        {
            System.out.print(i + " ");
        }
        System.out.println("\n------------------------");
        for(int i=3;i<13;i++)
        {
            System.out.printf("%2d0| ",i);
            for(int index=0;index<=9;index++)
            {
                if(index==7 && i==12) System.out.print(" "); //leaves a space for ASCII 127, which is 'delete'
                if(i == 3 && index<2)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print(((char)(index+i*10)) + " ");
                }
            }
            System.out.println();
        }
    }

    // Write a method which returns the index of a small letter in the alphabet (e.g. a = 0, c = 2, ...).
    // The method returns -1 if the letter is not a small letter.

    static int posInAl(char c)
    {
        if((int)c<97 || (int)c>122) return -1;
        return (int)c - (int)'a';
    }

    // Write a method which returns true if the input-String is a palindrome.
    // The method should be case insensitive, and ignore all spaces and punctuation marks in the String.

    static boolean isPalindrome(String s)
    {
        String s2 = "";
        for(int i = 0;i<s.length();i++)
        {
            if(!( s.charAt(i)=='!' || s.charAt(i)=='.' || s.charAt(i)==',' || s.charAt(i)==' '))
            {
                s2 = s2 + s.charAt(i);
            }
        }
        for(int i = 0;i<s2.length();i++)
        {
            char a = s2.charAt(i);
            char b = s2.charAt(s2.length()-i-1);
            if(!(Character.toUpperCase(a)==Character.toUpperCase(b)))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        asciiTable();
        System.out.println(isPalindrome("taCocat"));
    }
}
