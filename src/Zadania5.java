import java.util.Scanner;

public class Zadania5 {
    public static void starter() {
        zadanie1();
        //zadanie2();
        //zadanie3();
        //zadanie4();
        //zadanie5();
        //zadanie1While();
        //zadanie2While();
        //zadanie3While();
        //zadanie4While();
        //zadanie5While();
        //zadanieEkstra();
        //zadanieTribonaci();
    }
    public static void zadanieTribonaci() {
        System.out.println("podaj dlugosc ciagu");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        int first = 1;
        int second = 1;
        int third = 1;
        int next;
        for (int i = 0; i < index; i++) {
            next = first + second + third;
            first = second;
            second = third;
            third = next;
            System.out.println(next);
        }
    }
    public static void zadanie5While() {
        System.out.println("podaj wysokosc trojkata");
        Scanner scanner = new Scanner(System.in);
        int wysokosc = scanner.nextInt();
        System.out.println("podaj szerokosc trojkata");
        int szerokosc = scanner.nextInt();
        int i = 0;
        while (i < wysokosc) {
            int j = 0;
            while (j < szerokosc * 2) {
                if (j == wysokosc - 1 - i || j == wysokosc - 1 + i || i == wysokosc - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            i++;
            System.out.println();
        }
    }
    public static void zadanie4While() {
        System.out.println("podaj wyskosc kwadratu");
        Scanner scanner = new Scanner(System.in);
        int wysokosc = scanner.nextInt();
        System.out.println("podaj szerokosc kwadratu");
        int szerokosc = scanner.nextInt();
        int i = 0;
        while (i < szerokosc) {
            int j = 0;
            while (j < wysokosc) {
                if (i > 0 && i < wysokosc - 1 && j > 0 && j < szerokosc - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void zadanie3While() {
        System.out.println("podaj zakres");
        Scanner scanner = new Scanner(System.in);
        int zakres = scanner.nextInt();
        int i = 0;
        boolean[] liczby = new boolean[zakres + 1];
        while (i < zakres) {
            liczby[i] = true;
        }
        while (i * i < zakres) {
            int j = i * i;
            if (liczby[i]) {
                while (j < zakres) {
                    liczby[j] = false;
                }
            }
        }
        System.out.println("oto liczby pierwsze");
        while (i <= zakres) {
            if (liczby[i]) {
                System.out.println(i);
            }
        }
    }
    public static void zadanie2While() {
        int number = 2;
        while (number <= 100) {
            int i = 2;
            boolean isPrime = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if (isPrime == true) {
                System.out.println(number + " ");
            }
            number++;
        }
    }
    public static void zadanie1While() {
        System.out.println("podaj dlugosc ciagu");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        int first = 0, second = 1, i = 0;
        int next;
        while (i < index) {
            next = first + second;
            first = second;
            second = next;
            System.out.println(next + " ");
            i++;
        }
    }
    public static void zadanieEkstra() {
        for (int i = 0; i < 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
    public static void zadanie5() {
        System.out.println("podaj wysoksoc trojkata");
        Scanner scanner = new Scanner(System.in);
        int wysokosc = scanner.nextInt();
        System.out.println("podaj szerokosc trojkata");
        int szerokosc = scanner.nextInt();
        for (int i = 0; i < wysokosc; i++) {
            for (int j = 0; j < 2 * szerokosc - 1; j++) {
                if (j == wysokosc - 1 - i || j == wysokosc - 1 + i || i == wysokosc - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void zadanie4() {
        System.out.println("podaj wysokosc kwadratu");
        Scanner scanner = new Scanner(System.in);
        int wysokosc = scanner.nextInt();
        System.out.println("podaj szerokosc pola");
        Scanner scanner1 = new Scanner(System.in);
        int szerokosc = scanner1.nextInt();
        for (int i = 0; i < wysokosc; i++) {
            for (int j = 0; j < szerokosc; j++) {
                if (i == 0 || j == 0 || i == wysokosc - 1 || j == szerokosc - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void zadanie3() {
        System.out.println("do jakiej liczby mam szukac liczb pierwszych");
        Scanner scanner = new Scanner(System.in);
        int zakres = scanner.nextInt();
        int[] liczby = new int[zakres + 1];
        for (int i = 0; i <= zakres; i++) {
            liczby[i] = 1;
        }
        for (int i = 2; i * i <= zakres; i++) {
            if (liczby[i] != 0) {
                for (int j = i * 2; j <= zakres; j += i) {
                    liczby[j] = 0;
                }
            }
        }
        System.out.println("oto liczby pierwsze");
        for (int i = 2; i <= zakres; i++) {
            if (liczby[i] == 1) {
                System.out.println(i + " ");
            }
        }
        System.out.println("podaj liczbe");
        Scanner scanner1 = new Scanner(System.in);
        int number = scanner1.nextInt();
        if (liczby[number] == 1){
            System.out.println( number + " jest liczba pierwsza");
        }else {
            System.out.println(number + " nie jest liczba pierwsza");
        }
    }
    public static void zadanie2() {
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
    public static void zadanie1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj dlugosc ciagu ");
        int index = scanner.nextInt();

        int first = 0, second = 1;
        System.out.println("oto liczby ");
        for (int i = 0; i <= index; i++) {
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.print(first);
    }
}
