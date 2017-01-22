package kz.karpenko.ok;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Олег on 21.01.2017.
 */
public class StartSript {
    static Scanner sc = new Scanner(System.in);
    static String language;
    static String word;
    static int shift;

    public static void main(String[] args) throws IOException {
        encrypt();
        System.out.println("Do you want to decode word or string? Y/N");
        String answer = sc.nextLine().toUpperCase();
        if (answer.equals("N"))
            System.exit(0);
        else if (answer.equals("Y"))
            decode();
    }

    private static void encrypt() {

        System.out.print("Enter language: ");
        language = sc.nextLine().toUpperCase();

        System.out.print("Enter text: ");
        word = sc.nextLine().toUpperCase();

        System.out.print("Enter key: ");
        shift = Integer.parseInt(sc.nextLine());

        CesarSript cs = new CesarSript(language, word, shift);
        System.out.println(cs.encrypt());
    }

    private static void decode() {
        System.out.print("Enter language: ");
        language = sc.nextLine().toUpperCase();

        System.out.print("Enter text: ");
        word = sc.nextLine().toUpperCase();

        System.out.print("Enter key: ");
        shift = Integer.parseInt(sc.nextLine());

        CesarScriptDecoder scriptDecoder = new CesarScriptDecoder(language, word, shift);
        System.out.print(scriptDecoder.decode());

    }
}
