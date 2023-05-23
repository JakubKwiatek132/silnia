import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();
        int wynik = obliczSilnie(liczba);
        System.out.println("Silnia z " + liczba + " wynosi: " + wynik);
    }

    public static int obliczSilnie(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * obliczSilnie(n - 1);
        }
    }
}