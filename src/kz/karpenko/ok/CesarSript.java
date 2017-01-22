package kz.karpenko.ok;

import java.util.ArrayList;

/**
 * Created by Олег on 21.01.2017.
 * Метод шифрования Цезаря
 * Самая простая реализация
 * Сдвигает только на положительные числа
 * Требует доработок, но в целом пользоваться можно)
 */
public class CesarSript {
    private String language;
    private String word;
    private int key;
    private ArrayList<Character> alphabet = new ArrayList<>();

    public CesarSript(String language, String word, int key) {
        this.language = language;
        this.word = word;
        this.key = key;

        if (language.equals("RUS")) {
            for (char c = 'А'; c <= 'Я'; c++)
                alphabet.add(c);
        } else if (language.equals("ENG"))
            for (char c = 'A'; c <= 'Z'; c++)
                alphabet.add(c);
    }

    public String encrypt() throws ArrayIndexOutOfBoundsException {
        String encodedWord = "";
        for (int j = 0; j < word.length(); j++) {
            char charAtWord = word.charAt(j);
            int index = alphabet.indexOf(charAtWord); // we're get char's number in the alphabet
            encodedWord += getShiftedChar(index);
        }
        return encodedWord;
    }

    private char getShiftedChar(int charNum) {
        int charPlusNum = charNum + key;
        int newCharNum = 0;
        if (alphabet.size() < charPlusNum) {
            newCharNum = charPlusNum - alphabet.size();
        } else {
            newCharNum = charPlusNum;
        }
        //дописать сюда что будет если ввести shift < 0!
        return alphabet.get(newCharNum);
    }
}
