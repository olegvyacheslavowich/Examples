package kz.karpenko.ok;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Олег on 21.01.2017.
 */
public class StartSript {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter language: ");
        String language = sc.nextLine().toUpperCase();
        System.out.print("Enter text: ");
        String word = sc.nextLine().toUpperCase();
        System.out.print("Enter shift: ");
        int shift = sc.nextInt();
        CesarSript cs = new CesarSript(language,word,shift);
        System.out.println(cs.encrypt());
    }
}
