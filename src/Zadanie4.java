import java.util.Arrays;
import java.util.Scanner;

public class Zadanie4 {
    public static void starter() {
        //zadanie101();
        //zadanie101V();
        //zadanie102();
        //zadanie102while();
        //zadanie102odwrocona();
        //zadanie102odwwhile();
        //zadanie103();
        //zadanie103while();
        //zadanie104();
        //zadanie105();
        //zadanie105While();
        //zadanie106();
        //zadanie106While();
        //zadanie107();
        //zadanie107While();
        //zadanie109();
        //zadanie109While();
        zadanie110();
        //zadanie110Wile();
    }
    public static void zadanie110Wile() {
        System.out.println("podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        int silnia = 1;
        int i = 1;
        while (i <= liczba) {
            silnia = silnia * i;
            System.out.println(silnia);
            i++;
        }
    }
    public static void zadanie110() {
        System.out.println("podaj licze");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        int silnia = 1;
        for (int i = 1; i <= liczba; i++) {
            silnia = silnia * i;
        }
        System.out.println(silnia);
    }
    public static void zadanie109While() {
        String[] stringsArray = {"1", "2", "3", "4"};
        int[] intArray = new int[stringsArray.length];
        int i = 0;
        while (i < stringsArray.length) {
            intArray[i] = Integer.parseInt(stringsArray[i]);
            i++;
        }
        System.out.println("Tablica intów: " + Arrays.toString(intArray));
    }
    public static void zadanie109() {
        String[] stringArray = {"1", "2", "3", "4"};
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        System.out.println("Tablica intów: " + Arrays.toString(intArray));
        // Teraz masz tablicę intów intArray
        // Możesz używać intArray w swoim programie
    }
    public static void zadanie107While() {
        System.out.println("podaj wysokosc pola");
        Scanner scanner = new Scanner(System.in);
        int wysokosc = scanner.nextInt();
        System.out.println("podaj szerokosc pola");
        int szerokosc = scanner.nextInt();
        int i = 0;
        while (i < szerokosc) {
            int j = 0;
            while (j < wysokosc) {
                if (i == 0 || i == wysokosc - 1 || j == 0 || j == szerokosc - 1 || i == j || i + j == szerokosc - 1) {
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
    public static boolean isPrzekatna(int grubosc, int i, int j) {
        return i == j || i + j == grubosc - 1;
    }

    public static boolean isBorder(int wysokosc, int szerokosc, int i, int j) {
        return i == 0 || i == wysokosc - 1 || j == 0 || j == szerokosc - 1;
    }
    public static void zadanie107() {
        System.out.println("podaj wysokosc pola");
        Scanner scanner = new Scanner(System.in);
        int wysokosc = scanner.nextInt();
        System.out.println("podajszerokosc pola");
        int szerokosc = scanner.nextInt();
        for (int i = 0; i < wysokosc; i++) {
            for (int j = 0; j < szerokosc; j++) {
                if (isBorder(wysokosc, szerokosc, i, j) || isPrzekatna(szerokosc, i, j)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void zadanie106While() {
        System.out.println("podaj wysokosc pola");
        Scanner scanner = new Scanner(System.in);
        int wysokosc = scanner.nextInt();
        System.out.println("podajszerokosc pola");
        int szerokosc = scanner.nextInt();
        int i = 0;
        while (i < wysokosc) {
            int j = 0;
            while (j < szerokosc) {
                if (i == 0 || i == wysokosc - 1 || j == 0 || j == szerokosc - 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void zadanie106() {
        System.out.println("podaj wysokosc pola");
        Scanner scanner = new Scanner(System.in);
        int wysokosc = scanner.nextInt();
        System.out.println("podaj szerokosc pola");
        int szerokosc = scanner.nextInt();
        for (int i = 0; i < wysokosc; i++) {
            for (int j = 0; j < szerokosc; j++) {
                if (i == 0 || i == wysokosc - 1 || j == 0 || j == szerokosc - 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void zadanie105While() {
        System.out.println("Podaj wysokosc pola");
        Scanner scanner = new Scanner(System.in);
        int wysokosc = scanner.nextInt();
        System.out.println("podaj szerokosc pola");
        int szerokosc = scanner.nextInt();
        int i = 0;
        while (i < wysokosc) {
            int j = 0;
            while (j < szerokosc) {
                System.out.print("#");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void zadanie105() {
        System.out.println("podaj wysokosc pola");
        Scanner scanner = new Scanner(System.in);
        int wysokosc = scanner.nextInt();
        System.out.println("podaj szerokosc pola");
        int szerokosc = scanner.nextInt();
        for (int i = 0; i < wysokosc; i++) {
            for (int j = 0; j < szerokosc; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public static void zadanie104() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj rodzaj drogi zabudowany/niezabudowany/autostrada");
        String rodzajDrogi = scanner.nextLine();
        System.out.println("podaj predkosc z jaka jechales");
        int predkosc = scanner.nextInt();
        switch (rodzajDrogi.toLowerCase()) {
            case "zabudowany":
                if (predkosc <= 50) {
                    System.out.println("jechales przepisowo");
                } else if (predkosc <= 70) {
                    System.out.println("przeproczyles predkosc mandat 100");
                } else if (predkosc <= 90) {
                    System.out.println("przekroczyles predkosc mandat 200");
                } else if (predkosc <= 110) {
                    System.out.println(" przekroczyles predkosc mandat 300");
                } else {
                    System.out.println("Tracisz prawo jazdy i mandat 300");
                }
                break;
            case "niezabudowany":
                if (predkosc <= 70) {
                    System.out.println("jechales przepisowo");
                } else if (predkosc <= 90) {
                    System.out.println("przekroczyles predkosc mandat 100");
                } else if (predkosc <= 110) {
                    System.out.println("przekroczyles predkosc mandat 200");
                } else if (predkosc <= 130) {
                    System.out.println("przekroczyles predkosc mandat 300");
                } else {
                    System.out.println("przekroczyles predkosc, zabrane prawo jazdy mandat 300");
                }
                break;
            case "autostrada":
                if (predkosc <= 140) {
                    System.out.println("jechales przepisowo");
                } else if (predkosc <= 160) {
                    System.out.println("przekroczyles predkosc mandat 100");
                } else if (predkosc <= 180) {
                    System.out.println("przekroczyles predkosc mandat 200");
                } else if (predkosc <= 200) {
                    System.out.println("przekroczyles predkosc mandat 300");
                } else {
                    System.out.println("przekroczyles predkosc, zabrane prawo jazdy mandat 300");
                }
        }
    }
    public static void zadanie103while() {
        String[] cars = new String[100];
        System.out.println("podaj auta");
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < cars.length) {
            String input = scanner.nextLine();
            if ("exit".equalsIgnoreCase(input)) {
                break;
            }
            cars[i] = input;
            i++;
        }
        int j = 0;
        while (j < i) {
            System.out.println(cars[j]);
            j++;
        }
    }
    public static void zadanie102odwwhile() {
        System.out.println("podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int podstawa = scanner.nextInt();
        int i = 0;
        while (i <= podstawa / 2) {
            int space = 0;
            while (space < i) {
                System.out.print(".");
                space++;
            }
            int stars = 0;
            while (stars < podstawa - i * 2) {
                System.out.print("*");
                stars++;
            }
            i++;
            System.out.println();
        }
    }
    public static void zadanie102while() {
        System.out.println("podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int podstawa = scanner.nextInt();
        int i = 0;
        while (i <= podstawa / 2) {
            int space = 0;
            while (space < podstawa / 2 - i) {
                System.out.print(".");
                space++;
            }
            int stars = 0;
            int howManyStars = 2 * i + 1;
            if (podstawa % 2 == 0) {
                howManyStars = howManyStars - 1;
            }
            while (stars < howManyStars) {
                System.out.print("*");
                stars++;
            }
            i++;
            System.out.println();
        }
    }
    public static void zadanie102() {
        System.out.println("podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int podstawa = scanner.nextInt();
        for (int i = 0; i <= podstawa / 2; i++) {
            if (podstawa % 2 == 0) {
                //         podstawa = podstawa -1;
                for (int space = 0; space < podstawa / 2 - i; space++) {
                    System.out.print(".");
                }
                for (int stars = 0; stars < 2 * i; stars++) {
                    System.out.print("*");
                }
                for (int stars = 0; stars < podstawa - 2 * i; stars++) {
                    System.out.print("*");
                }
            } else {
                for (int space = 0; space < podstawa / 2 - i; space++) {
                    System.out.print(".");
                }
                for (int stars = 0; stars < 2 * i + 1; stars++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void zadanie102odwrocona() {
        System.out.println("podaj licze");
        Scanner scanner = new Scanner(System.in);
        int podstawa = scanner.nextInt();
        for (int i = 0; i < podstawa / 2 + 1; i++) {
            for (int space = 0; space < i; space++) {
                System.out.print(".");
            }
            for (int stars = 0; stars < podstawa - 2 * i; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void zadanie101V() {
        System.out.println("podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int lentgh = scanner.nextInt();
        int i = 0;
        while (lentgh > i) {
            int space = 0;
            while (space < i) {
                System.out.print(" ");
                space++;
            }
            int stars = 0;
            while (stars < 2 * (lentgh - i) - 1) {
                System.out.print("*");
                stars++;
            }
            System.out.println();
            i++;
        }
    }
    public static void zadanie101() {
        System.out.println("podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        for (int i = length; i > 0; i--) {
            for (int space = length - i; space > 0; space--) {
                System.out.print(".");
            }
            for (int stars = 1; stars < i * 2; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void zadanie103() {
        String[] cars = new String[100];
        System.out.println("podaj auto");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < cars.length; i++) {
            String input = scanner.nextLine();
            if ("exit".equals(input)) {
                break;
            }
            cars[i] = input;
        }
        for (String car : cars) {
            if (car != null) {
                System.out.println(car);
            } else {
                break;
            }
        }
    }
}

