package kz.karpenko.ok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.Scanner;

/**
 * Created by Олег on 21.01.2017.
 */
public class StartSript {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String word = sc.nextLine().toUpperCase();
        System.out.print("Enter shift: ");
        int shift = sc.nextInt();
        CesarSript cs = new CesarSript(word,shift);
        System.out.println(cs.encrypt());
    }
}
