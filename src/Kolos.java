import java.util.Arrays;
import java.util.Scanner;

public class Kolos {
    public static void starter(){
        //zadanie8C();
        //zadanie7();
        //zadanie9C();
        //zaadanie3D();
        //zadanie2D();
        //zadanie7E();
        //zadanie1E();
        //zadanie1F();
        //zadanie3F();
        //zadanie2F();
        //zadanieChoinkaboczna();
        //zadanieSito();
    }
    public static void zadanieSito(){
        //System.out.println("podaj zakres");
        Scanner scanner = new Scanner(System.in);
        int zakres = scanner.nextInt();
        boolean[] intArray = new boolean[zakres];
        for (int i = 0; i < zakres; i++){
            intArray[i] = true;
        }
        for (int i = 2; i * i < zakres; i++){
            if (intArray[i]){
                for (int j = i * i; j < zakres; j = j + i){
                    intArray[j] = false;
                }
            }
        }
        for (int i = 0; i < zakres; i++){
            if (intArray[i]){
                System.out.println(i);
            }
        }
    }
    public static void zadanieChoinkaboczna(){
        System.out.println("podaj wysokosc choinki");
        Scanner scanner = new Scanner(System.in);
        int wysokosc = scanner.nextInt();
        for (int i = 0; i < wysokosc; i++){
            for (int space = 0;space < wysokosc -i -1;space++){
                System.out.print(".");
            }
            for (int stars = 0; stars < i + 1; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = wysokosc -1; i > 0;i--){
            for (int space2 = 0;space2 < wysokosc - i;space2++){
                System.out.print(".");
            }
            for (int stars2 = 0; stars2 < i ; stars2++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void zadanie2F(){
        for (int i = 0; i <= 100; i++){
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i);j++){
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(i);
            }
        }
    }
    public static void zadanie3F(){
        System.out.println("podaj zakres liczb");
        Scanner scanner = new Scanner(System.in);
        int zakres = scanner.nextInt();
        boolean[] intArray = new boolean[zakres];
        for (int i = 0; i < zakres; i++){
            intArray[i] = true;
        }
        for (int i = 2; i < zakres; i++){
            if (intArray[i]){
                for (int j = i * 2; j < zakres; j = j + i){
                    intArray[j] = false;
                }
            }
        }
        for (int i = 0; i < zakres; i++){
            if (intArray[i]){
                System.out.println(i);
            }
        }
    }
    public static void zadanie1F(){
        System.out.println("podaj liczbe z ciagu");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        int first = 1;
        int second = 1;
        int third = 1;
        int fourth = 1;
        for (int i = 0; i < liczba; i++){
            int next = first + second + third + fourth;
            first = second;
            second = third;
            third = fourth;
            fourth = next;
            System.out.println(next);
        }
    }
    public static void zadanie1E(){
        System.out.println("podaj wysokosc choinki");
        Scanner scanner = new Scanner(System.in);
        int wysokosc = scanner.nextInt();
        for (int i = wysokosc -1; i >= 0 ; i--){
            for (int space = 0; space < wysokosc -i; space++){
                System.out.print(" ");
            }
            for (int stars = 0; stars < i * 2 + 1; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void zadanie7E(){
        System.out.println("podaj wysokosc pola");
        System.out.println("podaj szerokosc pola");
        Scanner scanner = new Scanner(System.in);
        int wysokosc = scanner.nextInt();
        int szerokosc = scanner.nextInt();
        for (int i = 0; i < wysokosc; i++){
            for (int j = 0; j < szerokosc; j++){
                if (i == 0 || j == 0 || i == wysokosc -1 || j == szerokosc -1 || i == j || i + j == szerokosc -1){
                    System.out.print("#");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void zadanie2D(){
        System.out.println("podaj liczbe od 10 do 90");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        for (int i = liczba; i <= 90; i++){
            if (i % 3 == 0 && i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    public static void zaadanie3D(){
        System.out.println("podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        System.out.println("podaj druga liczbe");
        int second = scanner.nextInt();
        int start = 0;
        int end = 0;
        if (first > second){
            start = first;
            end = second;
        }else {
            start = second;
            end = first;
        }
        for (int i = start; i > end; i--){
            System.out.println(i);
        }
    }
    public static void zadanie9C(){
        int[] intArray = new int[]{-9,-7,-8,2,-11,-15};
        int maxValue = intArray[0];
        int minValue = intArray[0];
        for (int i = 0; i < intArray.length; i++){
            if (maxValue < intArray[i]){
                maxValue = intArray[i];
            }
            if (minValue > intArray[i]){
                minValue = intArray[i];
            }
        }
        System.out.println(maxValue);
        System.out.println(minValue);
    }
    public static void zadanie7(){
        System.out.println("podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        int[] intArray = new int[liczba];
        for (int i = 0; i < intArray.length; i++){
            intArray[i] = liczba + i;
            if (i >= 5){
                intArray[i] = 2;
            }
        }
        System.out.println(Arrays.toString(intArray));
    }
    public static void zadanie8C(){
        int[] intArray = new int[]{1 , 2, 3,4,5,6,7,8,9,10};
        String[] newArray = new String[intArray.length];
        for (int i = 0; i < intArray.length; i++){
            newArray[i] = Integer.toString(intArray[i]);
        }
        System.out.println(Arrays.toString(newArray));
    }
}