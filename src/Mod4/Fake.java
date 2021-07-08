package Mod4;

// Сложная задача.
// Написать код, который генерирует строку из 8ми символов ASCII,
// где чётные буквы - гласные, а нечётные - согласные.

import java.util.Arrays;

public class Fake {
    public static void main(String[] args) {
        int temp;
        Character[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        char[] randChar = new char[8];

        for (int i = 0; i < 8; i++) {
            if (i == 0 || i % 2 == 0) {
                temp = RandomChar();
                if (Arrays.asList(vowels).contains((char) temp)) {
                    randChar[i] = (char) (temp + 1);
                } else {
                    randChar[i] = (char) temp;
                }
            } else {
                if (i > 5) {
                    randChar[i] = vowels[i / 2];
                } else {
                    randChar[i] = vowels[i];
                }
            }
        }
        StringBuilder fakeWord = new StringBuilder("");
        fakeWord.append(randChar);
        System.out.println(fakeWord);


    }

    public static int RandomChar() {
        int min = 97;
        int max = 122;
        return (char) Math.floor(Math.random() * (max - min + 1) + min);
    }

}

