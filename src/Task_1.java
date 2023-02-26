import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        int word = 15; // количество букв в признании
        int spaces = 3; // количество пробелов в признании
        int each3word = 62; // количестов сантиметров длины забора на каждые 3 буквы
        int Lspaces = 12; // количество сантиметров в одном пробеле
        int Allwords = (15 / 3) * 62; // длина всех букв
        int Allspaces = 12 * 3; // Длина всех пробелов
        int confession = Allspaces + Allwords; // Длина признания в сантиметрах

        System.out.println("Введите длину забора в сантиметрах");

        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        if (L < confession) {
            System.out.println(" Длины забора недостаточно для надписи в признании любви");
        } else {
            System.out.println("Длины забора достаточно для написания признания в любви");
        }
        sc.close();
    }
}


