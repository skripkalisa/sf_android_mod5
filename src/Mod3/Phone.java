package Mod3;
import java.util.Scanner;
public class Phone {
       public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       boolean isCorrectNumber = false;
       while (!isCorrectNumber) {
           String phoneNumber = scanner.nextLine(); //Считывает строку из System.in
           isCorrectNumber = checkPhoneNumberIsCorrect(phoneNumber);
           if (!isCorrectNumber) {
               System.out.println("Введите корректный номер!");
           } else {
               System.out.println(formatNumber(phoneNumber));
           }
       }
   }

   private static boolean checkPhoneNumberIsCorrect(String phoneNumber) {
       String clean = phoneNumber.replaceAll("[^0-9]", "");
       return clean.length() == 11;
   }

   private static String formatNumber(String phoneNumber) {
       String clean = phoneNumber.replaceAll("[^0-9]", "");
       String result = "+7" + " " + clean.substring(1, 4) + " " +
               clean.substring(4, 7) + " " + clean.substring(7, 9) + " " + clean.substring(9);

       return result;
   }
}
