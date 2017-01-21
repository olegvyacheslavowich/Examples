package kz.karpenko.ok;

/**
 * Created by Олег on 21.01.2017.
 * Метод шифрования Цезаря
 * Самая простая реализация
 * Сдвигает только на положительные числа
 * Требует доработок, но в целом пользоваться можно)
 */
public class CesarSript {
    private String word;
    private int shift;
    private char alphabet[] = new char[]{
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public CesarSript(String word, int shift) {
        this.word = word;
        this.shift = shift;
    }


    public String encrypt() {
        String encodedWord = "";
        for (int j = 0; j < word.length(); j++) {
            for (int i = 0; i < alphabet.length; i++) {
                if (alphabet[i] == word.charAt(j)) {
                    encodedWord += getShiftedChar(i);
                }
            }
        }
        return encodedWord;
    }

    private char getShiftedChar(int charNum) {
        int charPlusNum = charNum + shift;
        int newCharNum = 0;
        if (alphabet.length < charPlusNum) {
            newCharNum = charPlusNum - alphabet.length;
        } else {
            newCharNum = charPlusNum;
        }

        //дописать сюда что будет если ввести shift < 0!
        return alphabet[newCharNum];
    }
}
