package Mod4;
// Простая задача.
// Написать код, который генерирует строки из  8 - 12  ASCII символов
// (генератор сложных паролей)
public class Main {
    public static void main(String[] args) {
        int min = 33;
        int max = 126;
        for (int i = 0; i < 12; i++) {
            int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
            System.out.print((char)random_int);
        }
    }
}
