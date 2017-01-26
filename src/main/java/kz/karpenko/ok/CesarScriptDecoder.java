package kz.karpenko.ok;

import java.util.ArrayList;

/**
 * Created by Олег on 22.01.2017.
 */
public class CesarScriptDecoder {
    private String encodedWord;
    private int key;
    private String language;
    private ArrayList<Character> alphabet = new ArrayList();

    public CesarScriptDecoder(String language, String encodedWord, int key) {
        this.language = language;
        this.encodedWord = encodedWord;
        this.key = key;
        if (language.equals("RUS")) {
            for (char c = 'Я'; c >= 'А'; c--)
                alphabet.add(c);
        } else if (language.equals("ENG"))
            for (char c = 'Z'; c >= 'A'; c--)
                alphabet.add(c);

    }

    public String decode() {
        String decodedWord = "";
        for (int i = 0; i < encodedWord.length(); i++) {
            char charByIndex = encodedWord.charAt(i);
            int charsIndexInAlphabet = alphabet.indexOf(charByIndex);
            decodedWord += getTrueWord(charsIndexInAlphabet);
        }

        return decodedWord;
    }

    private char getTrueWord(int index) {
        int charPlusNum = index + key;
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

