import java.util.Scanner;

public class NoweZadania {

    public static void starter() {
        //System.out.println("Startuje starter");
        //zadanieOstatnieV2();
        //zadanie1();
        //zadanieProbne2();
        //zadanie2();
        //zadanie2V2();
        //zadanie3();
        //zadanie3V2();
        //zadanie4();
        //zadanie4V2();
        //zadanie5();
        //zadanie5V2();
        //zadanie6();
        //zadanie6V2();
    }

    public static void zadanie6V2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int i = scanner.nextInt();
        if (i <= 9 || i >= 91) {
            System.out.println("podaj liczbe od 10 do 90");
        }
        int j = 1;
        while (j <= 10) {
            int wynik = (int) Math.pow(2, j);
            int wynik2 = wynik + i;
            System.out.println(wynik2);
            j++;
        }
    }
    public static void zadanie6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int i = scanner.nextInt();
        if (i <= 9 || i >= 91) {
            System.out.println("podaj liczbe od 10 do 90");
        }
        int wynik;
        int wynik2;
        for (int j = 1; j <= 10; j++) {
            wynik = (int) Math.pow(2, j);
            wynik2 = i + wynik;
            System.out.println(wynik2);
        }
    }
    public static void zadanie5V2() {
        int i = 1;
        while (i <= 10) {
            int wynik = (int) Math.pow(2, i);
            System.out.println(wynik);
            i++;
        }
    }
    public static void zadanie5() {
        for (int i = 1; i <= 10; i++) {
            int wynik = (int) Math.pow(2, i);
            System.out.println(wynik);
        }
    }
    public static void zadanie4V2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int a = scanner.nextInt();
        if (a <= 9 || a >= 91) {
            System.out.println("podaj liczbe od 10 do 90");
        }
        while (a <= 90) {
            if (a % 3 == 0) {
                System.out.println(a);
            }
            a++;
        }
    }
    public static void zadanie4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int a = scanner.nextInt();
        if (a <= 9 || a >= 91) {
            System.out.println("podaj liczbe od 10 do 90");
        }
        for (int i = a; i <= 90; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
    public static void zadanie3V2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int a = scanner.nextInt();
        if (a <= 9 || a >= 91) {
            System.out.println("Podaj liczbe od 10 do 90");
        }
        System.out.println("Podaj druga liczbe");
        int b = scanner.nextInt();
        if (b <= 9 || b >= 91) {
            System.out.println("Podaj liczbe od 10 do 90");
        }
        int wynik = Math.abs(a - b);
        while (wynik >= 0) {
            System.out.println(wynik--);
        }
    }
    public static void zadanie3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int a = scanner.nextInt();
        if (a <= 9 || a >= 91) {
            System.out.println("Podaj liczbe od 10 do 90");
        }
        System.out.println("podaj druga liczbe");
        int b = scanner.nextInt();
        if (b <= 9 || b >= 91) {
            System.out.println("podaj liczbe od 10 do 90");
        }
        int start;
        int koniec;
        if (a > b) {
            start = a;
            koniec = b;
        } else {
            start = b;
            koniec = a;
        }
        for (int i = start; i >= koniec; i--) {
            System.out.println(i);
        }
    }
    public static void zadanie2V2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int a = scanner.nextInt();
        if (a <= 9 || a >= 91) {
            System.out.println("podaj liczbe od 10 do 90");
        } else {
            while (a <= 90) {
                if (a % 3 == 0 && a % 2 == 0) {
                    System.out.println(a);
                }
                a++;
            }
        }
    }
    public static void zadanie2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int a = scanner.nextInt();
        if (a <= 9 || a >= 91) {
            System.out.println("podaj liczbe od 10 do 90");
        } else {
            for (int i = a; i <= 90; i++) {
                if (i % 2 == 0 && i % 3 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
    public static void zadanieProbne2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int a = scanner.nextInt();
        System.out.println("podaj druga liczbe");
        int b = scanner.nextInt();
        System.out.println("podaj trzecia liczbe");
        int c = scanner.nextInt();
        int wynik;
        if (a > b && a > c) {
            wynik = a;
        } else if (b > a && b > c) {
            wynik = b;
        } else {
            wynik = c;
        }
        System.out.println("Najwieksza liczba to " + wynik);
    }
    public static void zadanie1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj bok");
        int a = scanner.nextInt();
        System.out.println("podaj drugi bok");
        int b = scanner.nextInt();
        System.out.println("podaj trzeci bok");
        int c = scanner.nextInt();
        int wynik = (a + b);
        if (wynik > c) {
            System.out.println(" trojkat prawidlowy");
        } else {
            System.out.println("trojkat nieprawidlowy");
        }
        wynik = a + c;
        if (wynik > b) {
            System.out.println("trojkat prawidlowy");
        } else {
            System.out.println("trojkat nieprawidlowy");
        }
        wynik = b + c;
        if (wynik > a) {
            System.out.println("trojkat prawidlowy");
        } else {
            System.out.println("trojkat nieprawidloy");
        }
    }
    public static void zadanieOstatnieV2() {
        System.out.println("startuje zadanieOstatnie");
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
        } else {
            System.out.println("trojkat nieprawidlowy");
        }
    }
}
