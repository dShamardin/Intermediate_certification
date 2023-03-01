import java.util.InputMismatchException;
import java.util.Scanner;



public class Task_1 {

    public static void main(String[] args) {



        int word = 15; // количество букв в признании
        int spaces = 3; // количество пробелов в признании
        int Length3Word = 62; // количестов сантиметров длины забора на каждые 3 буквы
        int LSpaces = 12; // количество сантиметров в одном пробеле
        int AllWords = (15 / 3) * 62; // длина всех букв
        int AllSpaces = 12 * 3; // длина всех пробелов
        int confession = AllSpaces + AllWords; // Длина признания в сантиметрах

        System.out.println("Введите число сантиметров");

        try {
            Scanner sc = new Scanner(System.in);
            int L = sc.nextInt();
            if(L<confession) {
                do {
                    //  for (int L = sc.nextInt(); L < confession; L++){
                    System.out.println(" Длины забора недостаточно для надписи в признании любви");
                    System.out.println("");
                    System.out.println("Введите длину забора в сантиметрах повторно");
                    break;
                }
                while (L>=confession);
                   }
            else { System.out.println("Длины забора достаточно");
            }
            sc.close();
             }
        catch (InputMismatchException e) {
            System.out.println("Введено не число");
        }
      finally {
            System.out.println(" ");
            System.out.println("Дейстие программы завершено");
        }
    }
}


