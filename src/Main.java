import java.util.Scanner;

public class Main {
    private static final double PI_VALUE = 3.14;

    public static void main(String[] args) {
        //zadanie();
        //    zadanie();
        //zadanie2();
        //zadanieChoinka();
        //zadaniePetla();
        //zadanie6();
        //zadanie33();
        //zadaniePole();
        //zadanieKolo();
        //zadanieDemo();
        //zadanieDemo2();
        // zadanieFor();
        //zadaniePierwsze();
        //zadanieDrugie();
        //zadanieDrugieV2();
        //zadanieTrzecie();
        //zadanieTrzecieV2();
        //zadanieCzwarte();
        //zadanieCzwarteV2();
       // zadaniePiate();
        //zadaniePiateV2();
        //zadanieSzoste();
        //zadanieSzosteV2();
        //zadanieBarwi();
        //zadanieBarwi2();
        //zadanieBarwi3();
        //zadanieBarwi4();
        //zadanieOstatnie();
        //zadanieBarwi5();
        //NoweZadania.starter();
        //ZadaniaTablice.starter();
        //Zadanie3.starter();
        //Zadanie4.starter();
        //Zadania5.starter();
        //Podsumowanie.starter();
        //Kolos.starter();
        ZadaniaDodatkowe.starter();
    }
    private static void zadanieBarwi5() {
        int a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        for (int i = a; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("oto liczby" + i);
            }
        }
    }
    private static void zadanieOstatnie() {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj a");
        a = scanner.nextInt();
        System.out.println("podaj b");
        b = scanner.nextInt();
        System.out.println("podaj c");
        c = scanner.nextInt();
        if (a > b + c) {
            System.out.println("trojkat prawidlowy");
        }
        else {
            System.out.println("trojkat nieprawidlowy");
        }
    }
    private static void zadanieBarwi4() {
        int i = 1;
        while (i <= 100) {
            if (i % 3 == 0) {
                System.out.println("oto liczby podzielne przez 3 " + i);
            }
            if (i % 5 == 0) {
                System.out.println("oto liczby podzielne przez 5 " + i);
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("To liczby podzielne przez 3 i 5 " + i);
            }
            i++;
        }
    }

    private static void zadanieBarwi3() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input <= 99) {
            for (int i = input; i <= 100; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Podales za duza liczbe");
        }
    }
    private static void zadanieBarwi2() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        if (text.equals("x")) {
            System.out.println("napisales x");
        } else if (text.equals("y")) {
            System.out.println("napisales y");
        } else System.out.println("Glupoty pierdolisz");
    }
    private static void zadanieBarwi() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input % 2 == 0) {
            System.out.println("liczba jest podzielna przez dwa");
        } else {
            System.out.println("licza nie jest podzielna przez dwa");
        }
    }
    private static void zadanieSzosteV2() {
        System.out.println("Podaj liczbe od 1 do 100");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int liczba = 0;
        while (input > 0) {
            input = input - 5;
            liczba += 5;
            System.out.println(input);
            if (liczba % 15 == 0) {
                System.out.println(":)");
                liczba = 0;
            }
        }
    }
    private static void zadanieSzoste() {
        System.out.println("Podaj liczbe od 1 do 100");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int liczba = 0;
        for (int i = input; i > 0; i -= 5) {
            System.out.println(i);
            liczba += 1;// to jest to samo co liczba = liczba + 5
            if (liczba % 3 == 0) {
                System.out.println(":)");
                System.out.println("Liczba to " + liczba);
            }
        }
    }
    private static void zadaniePiateV2() {
        int i = 0;
        while (i <= 100) {
            if (i % 10 == 4 || i % 10 == 8){
                System.out.println(Math.pow(i, 2));
            }
            System.out.println(i);
            i++;
        }
    }
    private static void zadaniePiate() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            if (i % 10 == 4 || i % 10 == 8) {
                System.out.println(Math.pow(i, 2));
            }
        }
    }
    private static void zadanieCzwarteV2() {
        int i = 10;
        while (i <= 30) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
    private static void zadanieCzwarte() {
        for (int i = 10; i <= 30; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    private static void zadanieTrzecieV2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int start = scanner.nextInt();
        System.out.println("podaj druga liczbe");
        int end = scanner.nextInt();
        while (start <= end) {
            System.out.println(start);
            start++;
        }
    }
    private static void zadanieTrzecie() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int liczba = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = liczba ;i <= b ; i++) {
            System.out.println(i);
        }
    }
    private static void zadanieDrugieV2() {
        int liczba = 19;
        while (liczba <= 154) {
            System.out.println(liczba);
            liczba++;
        }
    }
    private static void zadanieDrugie() {
        for (int i = 19; i <= 154; i++) {
            System.out.println(i);
        }
    }
    private static void zadaniePierwsze() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int liczba = scanner.nextInt();
        int suma = 0;
        while (liczba > 0) {
            int i = liczba % 10;
            suma += i;
            liczba /= 10;
        }
        System.out.println("suma to " + suma);
    }
    private static void zadanieFor() {
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        for (int i = liczba; i > 0; i /= 10) {
            System.out.println(i + "  " + liczba);
        }
    }
    private static void zadanieDemo2() {
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        while (liczba > 0) {
            System.out.println("dalej jade");
            liczba = scanner.nextInt();
            System.out.println(liczba);
            liczba = liczba + 2;
            liczba -= 2;
        }
    }
    private static void zadanieKolo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj promien");
        double promien = scanner.nextDouble();
        double result = PI_VALUE * promien * Math.pow(promien, 2);
        System.out.println("Pole kola rowna sie " + result);
    }
    private static void zadaniePole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj podstawe");
        double number1 = scanner.nextDouble();
        System.out.println("podaj wysokosc ");
        double number2 = scanner.nextDouble();
        double result = number1 * number2 / 2;
        System.out.println("Pole trojkata wynosi " + result);
    }
    private static void zadanieDemo() {
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        int first = liczba % 10;
        System.out.println(first);
        int second = liczba / 10 % 10;
        System.out.println(second);
        int third = liczba / 100 % 10;
        System.out.println(third);
        int fourth = liczba / 1000 % 10;
        System.out.println(fourth);
        int result = first + second + third + fourth;
        System.out.println(result);
    }

    private static void zadanie33() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int n = scanner.nextInt();
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        if (n > 10) ;
        System.out.println("podaj liczbe dwucyfrowa");
        System.out.println("Suma licz jest równa: " + sum);
    }
    private static void zadanie6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwsza liczbe: ");
        int number1 = scanner.nextInt();
        System.out.print("Podaj druga liczbe: ");
        int number2 = scanner.nextInt();
        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
        System.out.println(number1 * number2);
        System.out.println(number1 % number2);
    }

    public static void zadaniePetla() {
        int suma = 0;
        for (int i = 0; i < 20; i = i + 2) {
            System.out.println(i);
            suma = suma + i;
        }
        System.out.println(suma);
    }
    public static void zadanieChoinka() {
        int height = 5;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height + 1; j++) {
                System.out.println(" ");
                for (int d = 0; d < 1; d++)
                    for (int k = 0; k < i; k++) {
                        System.out.println("*");
                    }
                System.out.println();
            }
        }
    }
    public static void zadanie1() {
        System.out.println("wynik zadania 1");
        System.out.println("hello");
        System.out.println("Kamil Franczak");
    }
    public static void zadanie2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe 1:");
        int liczba1 = scanner.nextInt();
        System.out.println("podaj liczbe 2:");
        int liczba2 = scanner.nextInt();
        int result = dodaj(liczba1, liczba2);
        System.out.println(result);
    }
    public static int dodaj(int mojaLicza1, int mojaLiczba2) {
        int result = mojaLicza1 + mojaLiczba2;
        return result;
    }
}
    









