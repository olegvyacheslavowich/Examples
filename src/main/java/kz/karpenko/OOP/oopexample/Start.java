package kz.karpenko.OOP.oopexample;

/**
 * Created by Олег on 25.01.2017.
 */
public class Start {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String (s1);

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
    }
}
